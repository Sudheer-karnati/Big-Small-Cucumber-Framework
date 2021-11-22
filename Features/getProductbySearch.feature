Feature: validating search bar

  Scenario: send keys and add a product to cart 
    Given Open the browser
    And User navigate to HomePage
    When user send keys and add a product to cart
    Then product added to wishlist
   
     
