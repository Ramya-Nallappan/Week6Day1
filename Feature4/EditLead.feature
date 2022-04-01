Feature: Edit Lead

Background: 
Given A chrome Browser is launched 
And Load the Leaftaps url 'http://leaftaps.com/opentaps/control/main'
And Maximize the browser

Scenario Outline: TC002_EditLead
Given Enter the username as <username>
And Enter the password as <password>
And Select the submit button
And Select the 'CRM/SFA' link
And Select the 'Leads' link
And Select the 'Find Leads' link
And Enter FirstName in searchfield
And Enter LastName Field in searchfield
And Select Find Lead
And Select the first resulting Lead
And Select edit button 
And clear the Company Name
And add the Company Name
And capture the updated Company Name
When select update button
Then verify the updated Company Name


Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|

