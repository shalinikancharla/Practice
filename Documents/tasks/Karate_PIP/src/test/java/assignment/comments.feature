Feature: Testing comments APIs in Todoist

  Background:
    * url 'https://api.todoist.com/rest/v2/'
    * header Authorization = 'Bearer 033b628f4fd3ff978e5eb357117d4b05f244b22c'
    * def taskId = '6976999232'


  Scenario: Comments End to End

  Scenario: Get comments for a task
    Given path 'comments'
    And param task_id = taskId
    When method GET
    Then status 200
    Then match response == "#array"


  Scenario: Create a new comment
    Given path 'comments'
    And request
    """
    {
        "task_id": 6976999232,
        "content": "Buy eggs and bread also",
        "attachment": {
            "resource_type": "file",
            "file_url": "https://s3.amazonaws.com/domorebetter/Todoist+Setup+Guide.pdf",
            "file_type": "application/pdf",
            "file_name": "File.pdf"
        }
    }
    """
    And header Content-Type = 'application/json'
    When method POST
    Then status 200
    Then def expectedResponse =
        """
        {
        	"id": "#ignore",
        	"task_id": "6976999232",
        	"project_id": null,
        	"content": "Buy eggs and bread also",
        	"posted_at": "#ignore",
        	"attachment": {
        		"file_name": "File.pdf",
        		"file_type": "application/pdf",
        		"file_url": "https://s3.amazonaws.com/domorebetter/Todoist+Setup+Guide.pdf"
        	}
        }
        """
    Then match response == expectedResponse
    Then print response
    And karate.write(response.id, "comments.txt");

  Scenario: Get a comment by ID
    * def commentId = read("file:target/comments.txt");
    * print commentId
    Given path 'comments/' ,commentId
    When method GET
    Then status 200

  Scenario: Update a comment
    * def commentId = read("file:target/comments.txt");
    * print commentId
    Given path 'comments/',commentId
    And request { "content": "pay electricity bill" }
    When method POST
    Then status 200
    And match response.content ==  "pay electricity bill"

  Scenario: Delete a comment
    * def commentId = read("file:target/comments.txt");
    * print commentId
    Given path 'comments/',commentId
    When method DELETE
    Then status 204

