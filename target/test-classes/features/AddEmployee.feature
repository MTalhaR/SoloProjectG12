Feature: Adding the Employee

  @test1
  Scenario: Adding one employee using feature file
    When user enters valid username and valid password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user clicks on Add Employee button
    And user enter "nazam" and "MS" and "sadaf"
    And user clicks on save button
    Then employee added successfully