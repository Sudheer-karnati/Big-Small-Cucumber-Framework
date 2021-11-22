Feature: validating cash on delivery

  Scenario: check COD for product 
    Given Open the browser
    And User navigate to HomePage
    When user click a product and enter pincode
    Then cash on delivery is validated
   
     
