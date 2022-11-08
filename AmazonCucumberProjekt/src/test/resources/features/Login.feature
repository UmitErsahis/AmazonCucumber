Feature: User should be able to change Liefern Region in Amazon


  Scenario: Enter into Amazon Page
    Given the user is on the Amazon BasePage
    And the user navigates to Liefern nach Ländern section
    And the user changes liefern adress in putting "11201" into the field
    And the user verifies that delivery region is "Brooklyn 11201‌"
    And the user select country from selection
    Then verify that country were changed

  @wip



  Scenario Outline:
    Given the user is on the Amazon BasePage
    And the user navigates to Liefern nach Ländern section
    And the user enters a "<postcode>" into the field
    Examples:
      | postcode |
      | 11201    |
      | 11202    |
      | 11203    |
      | 11204    |

    #ayni senaryoyu bir den fazla döndürüyor