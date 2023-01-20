Feature: check the login funtionality of HRM

  Scenario: check login successfull with valid credential
    Given open the browser
    Given Enter the Url
    When enter the valid username and password
    And click on login button
    Then check the home page is displayed
    


