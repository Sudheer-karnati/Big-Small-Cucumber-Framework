Feature: validating wishlist btn 

  Scenario: add a personal gift to wishlist 
    Given Open the browser
    And User navigate to HomePage
    When user click on personal gift and click wishlist
    Then product added to the wishlist
   
     
