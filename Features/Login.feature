Feature: sample Feature file
  Scenario: Test sample web page
    Given I launch browser
    When I open webpage
    Then I verify tile name of the page
    And I close the browser