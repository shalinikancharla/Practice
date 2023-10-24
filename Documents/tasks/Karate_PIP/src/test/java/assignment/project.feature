Feature: Testing projects APIs in Todoist

  Background:
    * url 'https://api.todoist.com/rest/v2'
    * header Authorization = 'Bearer 033b628f4fd3ff978e5eb357117d4b05f244b22c'

  Scenario: Get projects
    Given path 'projects'
    When method GET
    And status 200
    And match response == "#array"

  Scenario: Create a project and validate API response
    Given path 'projects'
    And request { "name": "Study" }
    And header Content-Type = 'application/json'
    When method POST
    Then status 200
    * def jsonSchemaExpected =
    """
     {
      "id": "#string",
      "parent_id": "##string",
      "order":  '#number',
      "color": "#string",
      "name": "#string",
      "comment_count": '#number',
      "is_shared": "#boolean",
      "is_favorite": "#boolean",
      "is_inbox_project":"#boolean",
      "is_team_inbox": "#boolean",
      "url": "#string",
      "view_style": "#string",
      }
      """
    * match response == jsonSchemaExpected
    Then print response
    And karate.write(response.id, "projects.txt");

  Scenario: Get details of a specific project
    * def projectId = read("file:target/projects.txt");
    * print projectId
    Given path 'projects/' , projectId
    When method GET
    Then status 200

  Scenario: Update a project
    * def projectId = read("file:target/projects.txt");
    * print projectId
    Given path 'projects/' , projectId
    And request { name: 'Planning' }
    When method POST
    Then status 200
    Then match response.name == 'Planning'

  Scenario: Delete a project
    * def projectId = read("file:target/projects.txt");
    * print projectId
    Given path 'projects/' , projectId
    When method DELETE
    Then status 204

  Scenario: Get project collaborators
    Given path 'projects/2314680314/collaborators'
    When method GET
    Then status 200
    Then match response == []