Feature: Testing tasks APIs in Todoist

  Background:
    * url 'https://api.todoist.com/rest/v2/'
    * header Authorization = 'Bearer 033b628f4fd3ff978e5eb357117d4b05f244b22c'

  Scenario: Get tasks
    Given path 'tasks'
    When method GET
    Then status 200
    Then match response == "#array"

  Scenario: Create a task
    Given path 'tasks'
    And request { "content": "Study for an hour", "due_string": "tomorrow at 12:00", "due_lang": "en", "priority": 4 }
    When method POST
    Then status 200
    And match response.content == "Study for an hour"
    And match response.priority == 4
    Then print response
    And karate.write(response.id, "tasks.txt");

  Scenario: Get a specific task
    * def taskId = read("file:target/tasks.txt");
    * print taskId
    Given path 'tasks/',taskId
    When method GET
    Then status 200

  Scenario: Update a task
    * def taskId = read("file:target/tasks.txt");
    * print taskId
    Given path 'tasks/',taskId
    And request { "content": "Buy Coffee" }
    When method POST
    Then status 200
    And match response.content == 'Buy Coffee'

  Scenario: Close a task
    * def taskId = read("file:target/tasks.txt");
    * print taskId
    Given path 'tasks/',taskId,'/close'
    When method POST
    Then status 204
    And match response == ''

  Scenario: Reopen a task
    * def taskId = read("file:target/tasks.txt");
    * print taskId
    Given path 'tasks/',taskId,'/reopen'
    When method POST
    Then status 204
    And match response == ''

  Scenario: Delete a task
    * def taskId = read("file:target/tasks.txt");
    * print taskId
    Given path 'tasks/',taskId
    When method DELETE
    Then status 204