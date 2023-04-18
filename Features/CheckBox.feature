Feature: Select Checkbox and verify it is selected are not
  Scenario: Selecting Checkbox and Radio Button
    Given I launch browser
    When I open webpage
    Then I select checkbox
    And I verify checkbox is selected or not
    Then I close the browser