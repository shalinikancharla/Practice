Feature:  Testing labels APIs in Todoist

  Background:
    * url 'https://api.todoist.com/rest/v2/'
    * header Authorization = 'Bearer 033b628f4fd3ff978e5eb357117d4b05f244b22c'

  Scenario:  Labels end to end
    Given path 'labels'
    When method GET
    Then status 200
    Then match response == "#array"

  Scenario: Create a new label
    Given path 'labels'
    And request { "name": "Gaming" }
    When method POST
    Then status 200
    * def jsonSchemaExpected =
        """
        {
        "id":  "#string",
        "name":  "#string",
        "order": '#number',
        "color":  "#string",
        "is_favorite": '#boolean',
        }
        """
    * match response == jsonSchemaExpected
    Then print response
    And karate.write(response.id, "labels.txt");




  Scenario: Delete a specific label
    * def labelId = read("file:target/labels.txt");
    * print labelId
    Given path 'labels/' , labelId
    When method DELETE
    Then status 204

