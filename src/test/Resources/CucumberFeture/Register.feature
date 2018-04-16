@raj
Feature: Log in
  Background: qughouq;ef
    Given I am on homepage
  Scenario Outline: User should not able to log in with invalid credentials
    When I enter invalid "<username>" and "<password>"
    Then I should not able to log in successfully
    Examples:
      | username | password |
      |Admin     |   admin  |
      |          | password |
      | testtest | password |
#
#      | username | password |error message|
#      |Admin     |   admin  |       |
#      |          | password |       |
#      | testtest | password |       |

#   Then I should not able to log in successfully with valid "<error message>"