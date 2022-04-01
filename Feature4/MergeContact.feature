Feature: Merge Contact

Background: 
Given A chrome Browser is launched 
And Load the Leaftaps url 'http://leaftaps.com/opentaps/control/main'
And Maximize the browser

Scenario Outline: TC006_MergeContact
Given Enter the username as <username>
And Enter the password as <password>
And Select the submit button
And Select the 'CRM/SFA' link
And Select the 'Leads' link
And Select the 'Contacts' link
And Select Merge Contacts 
And Select Widget of From Contact
And Select first resulting Lead
And Select Widget of To Contact
And Select Second Resulting Contact
When Select Merge button 
And Accept the Alert
Then Verify the title of the page


Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|

