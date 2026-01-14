Feature: Data Driven Testing

  Scenario Outline: To validate login functionality on OHRM
    Given Open Orange HRM application
    When Enter valid username as "<UserName>" and valid password as "<Password>"
    And I click on Login button
    Then Dashboard page should display

    Examples: 
      | UserName | Password    |
      | admin    | admin123    |
      | sneha    | sneha123    |
      | priyanka | priyanka123 |
      | admin    | admin123    |
