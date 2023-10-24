Feature: user Details

Scenario: request user details
Given url url
When method GET
Then status 200
And print response
And print myVarName