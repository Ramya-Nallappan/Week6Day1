#reuse of step definiton methods for multiple steps as below
Feature: Duplicate Lead
Background:
Given A chrome Browser is launched 
And Load the Leaftaps url 'http://leaftaps.com/opentaps/control/main'
And Maximize the browser

Scenario Outline: TC003_Duplicate Lead
Given Enter the username as <username>
And Enter the password as <password>
And Select the submit button
And Select the 'CRM/SFA' link 
And Select the 'Leads' link
And Select the 'Find Leads' link
And Select the Email Tab and enter EmailId
And Select Find Lead link
And Capture the name of the first resulting Lead
And Select the LeadID of the first resulting Lead
When Select the 'Duplicate Lead' link
Then Capture the Page title
Then Verification of the title


Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|
