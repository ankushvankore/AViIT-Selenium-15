Feature: Tricentis Automation

  Scenario: To validate automobile insurance
    Given Launch insurance application
    When Click on Automobile link
    When Enter following data
      | Audi | 1000 | 01/08/2026 | 2 | Petrol | 10000 | MH09GF1246 | 1000 |
      | BMW  | 1000 | 01/08/2026 | 2 | Petrol | 10000 | MH09GF1246 | 1000 |
    Then Vehicle data is accepted
