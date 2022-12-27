Feature: Add Dependents

  @dependent
  Scenario: Adding dependents of the employee
    When user enters valid username and valid password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user enter valid employee id
    And user clicks on search button
    And user clicks on displayed information
    Then user sees employee details
    When user clicks on dependents button
    And user clicks on dependents add button
    And user enters dependent name
    And user selects the relationship
    And user selects the date from calender
    And user clicks on dependent save button
    Then user see the dependents information displayed
