Feature: Login & Logout
#Background: 
#Given A chrome Browser is launched 
#And Load the Leaftaps url 'http://leaftaps.com/opentaps/control/main'
#And Maximize the browser

Scenario Outline: TC001_Login & Logout
Given Enter the username as <username>
And Enter the password as <password>
When Select the submit button
Then  Verify the Welcomepage 

Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|
