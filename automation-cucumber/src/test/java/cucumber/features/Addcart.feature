Feature: Add Cart Sauce Product

  # Positive case add cart product
  Scenario Outline: Add cart product
    Given user login with valid credentials
    When user input <username> as username cart
    And user input <password> as password cart
    And user click submit button
    Then user click add product to cart

    Examples:

      | username            | password
      | standard_user       | secret_sauce