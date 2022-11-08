Feature: User should be able to search with Search DropDown Buttons

@product
  Scenario: Searching through DropDown
    Given the user is on the Amazon BasePage


    When the user selects "product" from DropDown Button
    And the user clicks search button
    Then the user should be able to see relevant product page