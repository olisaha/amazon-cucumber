Feature: searching a product

  Scenario Outline: successful searching of a product
    Given user is on the amazon home-page
    When user sign-in by passing email-id and password with excel row "<row_index>"
    When user searched PRODUCT in the search-box
    When user sorted the  price and selected the lowest price
    When user clicked on add to cart
    Then user check mycart to check if the selected product is succefully added to cart

    Examples: 
      | row_index |
      |         1 |
