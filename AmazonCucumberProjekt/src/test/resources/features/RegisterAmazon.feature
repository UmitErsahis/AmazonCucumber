Feature: User should be able to register to Amazon

  Scenario Outline: Create account in amazon
    Given the user is on the register page
    When the user enters in using"<Your name>","<Mobil number or email>","<Password>","<Re-enter password>"
    Then the user should be able register to amazon
    Examples:
      | Your name | Mobil number or email | Password   | Re-enter password |
      | Ahmet     | ahmet23@gmail.com     | Test12345! | Test12345!       |
