Feature: Login on Practice Test

  Background: 
    Given Launch Practice Test

  Scenario: To validate login with valid data
    When Enter valid user name
    When Enter valid password
    And Click on Login button
    Then Home page should display

  Scenario: To validate login with invalid data
    When Enter invalid user name and invalid password
    And Click on Submit button
    Then Error message should display
