Feature: Create Contact
Background: 
Given A chrome Browser is launched 
And Load the Leaftaps url 'http://leaftaps.com/opentaps/control/main'
And Maximize the browser

Scenario Outline: TC005_Create Contact
Given Enter the username as <username>
And Enter the password as <password>
And Select the submit button
And Select the 'CRM/SFA' link
And Select Contacts Button
And Select Create Contact button
And Enter FirstName1 Field
And Enter LastName1 Field
And Enter the Department1 Field
And Enter the Email id1 Field
And Select State-Province1 as NewYork
When Select Create Contact
Then  Contact should be created

Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|

