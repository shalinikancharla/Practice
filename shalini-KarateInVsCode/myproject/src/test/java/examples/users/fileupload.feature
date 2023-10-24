Feature:file upload

Scenario:file upload demo
    Given url 'https://www.file.io/'
    And header Content-type = 'image/png'

    And request karate.read("petimage.png")
    #And request file
    When method Post
    Then status 201

