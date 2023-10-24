Feature: Login Sauce application

#  Negative Case login without any data
  Scenario:  Login without any data
    Given user is on Sauce Demo login page
    Then user click submit

# Positive case login with valid credentials
  Scenario Outline: Ensure login functionality
    Given user is on Sauce Demo login page
    When user input <username> as username
    And user input <password> as password
    Then user click submit

    Examples:

    | username            | password
    | standard_user       | secret_sauce



