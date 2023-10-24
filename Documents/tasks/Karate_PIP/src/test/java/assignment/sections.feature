Feature: Testing sections APIs in Todoist

  Background:
    * url 'https://api.todoist.com/rest/v2/'
    * header Authorization = 'Bearer 033b628f4fd3ff978e5eb357117d4b05f244b22c'
    * def projectId = '2314680314'

  Scenario: Retrieve sections for a project
    Given path "sections"
    And param project_id = projectId
    When method GET
    Then status 200
    Then match response == "#array"

  Scenario: Create a new section
    Given path 'sections'
    And request { "project_id": 2314680314, "name": "Highest Priority" }
    When method POST
    Then status 200
    * def jsonSchemaExpected =
        """
        {
        "id": "#string",
        "project_id":  "#string",
        "order":'#number',
        "name":  "#string",
        }
        """
    * match response == jsonSchemaExpected
    Then print response
    And karate.write(response.id, "sections.txt");

  Scenario: Retrieve a section
    * def sectionId = read("file:target/sections.txt");
    * print sectionId
    Given path 'sections/',sectionId
    When method GET
    Then status 200


  Scenario: Update a section
    * def sectionId = read("file:target/sections.txt");
    * print sectionId
    Given path 'sections/',sectionId
    And request {  "project_id": 2314680314,"name": "Supermarket" }
    When method POST
    Then status 200
    Then match response.name == 'Supermarket'

  Scenario: Delete a section
    * def sectionId = read("file:target/sections.txt");
    * print sectionId
    Given path 'sections/',sectionId
    When method DELETE
    Then status 204

