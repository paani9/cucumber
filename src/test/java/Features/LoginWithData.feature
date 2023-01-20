Feature: check the login funtionality of HRM1

  Scenario Outline: check login successfull with valid credential1
    Given open the browser
    Given Enter the Url
    When enter the valid <username> 
    And enter the valid <password> 
    And click on login button
    Then check the home page is display
    
    Examples:
    |username|password|
    |  Admin |admin123|