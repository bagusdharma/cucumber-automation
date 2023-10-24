Feature: Checkout Cart Sauce Product

  # Positive case complete checkout cart product
  Scenario Outline: Complete checkout cart product
    Given user login with valid credentials cart checkout
    When user input <username> as username cart item checkout
    And user input <password> as password cart item checkout
    And user click submit button cart checkout
    And user click add product to cart item checkout
    And user click cart icon checkout
    And user click checkout
    And user input first name
    And user input last name
    And user input postal code
    And user click continue checkout
    Then user click finish

    Examples:

      | username            | password
      | standard_user       | secret_sauce