Feature: Searching an Employee

  Background:
    When user enters valid username and valid password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option

 @test2 @id
  Scenario: Search employee by id
    When user enter valid employee id
    And user clicks on search button
    Then user see employee information is displayed

 @test2 @name
  Scenario: Search employee by name
    When user enters valid employee name
    And user clicks on search button
    Then user see employee information is displayed