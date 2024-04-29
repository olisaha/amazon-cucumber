Feature: searching a product
Scenario: successful searching of a product
Given user is on the amazon home-page
When user clicked on sign-in option and signed in with valid credential
When user searched PRODUCT in the search-box
When user sorted the  price and selected the lowest price
When user clicked on add to cart 
Then user check mycart to check if the selected product is succefully added to cart

