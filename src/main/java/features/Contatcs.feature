Feature: Free CRM create contact


Scenario Outline: Free CRM Login test Scenario


Given user is already on login Page
When title of login page is free crm
Then user enters "<username>" and "<password>"
Then user is on homepage
Then user clicks on contacts
Then user clicks on new contact
Then user provides "<firstname>" and "<lastname>"
Then user saves new contact

Examples:
|username           |password|firstname|lastname|
|nsonali21@gmail.com|Abc@1234|peter    |david|

