#reuse of step definiton methods for multiple steps as below
Feature: Delete Lead
Background:
Given A chrome Browser is launched 
And Load the Leaftaps url 'http://leaftaps.com/opentaps/control/main'
And Maximize the browser

Scenario Outline: TC004_Delete Lead
Given Enter the username as <username>
And Enter the password as <password>
And Select the submit button
And Select the 'CRM/SFA' link 
And Select the 'Leads' link
And Select the 'Find Leads' link
And Select Phone Tab and enter PhoneNumber
And Select Find Lead link1
And Capture lead ID of the first resulting Lead
And Select first resulting Lead for deletion
When Select Delete button
And Select Find leads link2
And Enter captured lead ID
And Click Find leads
Then verify the deletion


Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|
