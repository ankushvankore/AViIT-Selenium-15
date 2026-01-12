Feature: Automation Testing Practice Page

  Scenario: To validate automation testing practice page
    Given Open Automation Testing Practice Page
    When Enter name as "Priyanka Sutar"
    When Enter email as "priyanka@gmail.com"
    When Enter phone no as "9898989898"
    When Enter address as "Banglore"
    When Select gender as "Female"
    Then Testing successful
