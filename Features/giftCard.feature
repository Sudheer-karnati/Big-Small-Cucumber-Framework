Feature: validate gift card 

  Scenario: view all products and check product size and quantity 
    Given Open the browser
    And User navigate to HomePage
    When user click view all btn and select required size and quantity
    Then product added to cart
   
     
