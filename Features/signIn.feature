Feature: Checking login functionality

  Scenario Outline: check login with valid data
    Given user are on homepage
    When user enter credentials <username> and <password>
    And clicks on login button
    Then user navigated to homepage

    Examples: 
      | username           | password |
      | kskr1234@gmail.com | qwerasdf |
     
