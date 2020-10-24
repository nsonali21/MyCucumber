Feature: Free CRM Login Test Scenario
#without Examples keyword

 
#Scenario: Free CRM Login test Scenario
#Given user is already on login Page
#When title of login page is free crm
#Then user enters "nsonali21@gmail.com" and "Abc@1234"
#Then user clicks on Login button
#Then user is on homepage


##With Examples keyword
Scenario Outline: Free CRM Login test Scenario
Given user is already on login Page
When title of login page is free crm
Then user enters "<username>" and "<password>"
#Then user clicks on Login button
Then user is on homepage

Examples:
  | username  | password  |
  |nsonali21@gmail.com|Abc@1234|
  |tom|abc@12|