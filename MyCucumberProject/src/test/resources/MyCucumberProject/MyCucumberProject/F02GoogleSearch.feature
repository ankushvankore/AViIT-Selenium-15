Feature: Search on Google

  Scenario: To validate search functionality on Google
    Given Open Google in Browser
    When Enter the text to search in search box
    And Hit Enter
    Then a valid search result should display
