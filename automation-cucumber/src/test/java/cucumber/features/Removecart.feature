Feature: Remove Cart Sauce Product

  # Positive case remove cart product
  Scenario Outline: Remove cart product
    Given user login with valid credentials cart
    When user input <username> as username cart item
    And user input <password> as password cart item
    And user click submit button cart
    And user click add product to cart item
    And user click cart icon
    Then user remove cart product

    Examples:

      | username            | password
      | standard_user       | secret_sauce