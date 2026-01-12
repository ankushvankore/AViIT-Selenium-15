@SeleniumLinks
Feature: Selenium Links Test

  Background: 
    Given Open "https://www.selenium.dev/"

  @DownloadsLink
  Scenario: To validate Downloads link
    When Click on Downloads link
    Then Downloads page should open

  @DocumentsLink
  Scenario: To validate Documents link
    When Click on Documents link
    Then Documents page should open

  @ProjectsLink
  Scenario: To validate Projects link
    When Click on Projects link
    Then Projects page should open

  @SupportLink
  Scenario: To validate Support link
    When Click on Support link
    Then Support page should open
