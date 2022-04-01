#reuse of step definiton methods for multiple steps as below
Feature: Create Lead
#Background: This common precondition will be moved to base class  @BeforeMethod
#Given A chrome Browser is launched 
#Passing static parameter
#And Load the Leaftaps url 'http://leaftaps.com/opentaps/control/main'
#And Maximize the browser

Scenario Outline: TC001_Create Lead
Given Enter the username as <username>
And Enter the password as <password>
And Select the submit button
And Select the 'CRM/SFA' link
And Select the 'Leads' link
And Select the 'Create Lead' link
And Enter the Company Name
And Enter FirstName Field
And Enter LastName Field
And Enter the Department Field
And Enter the Email id Field
And Select State-Province as NewYork
When Select Create Lead
Then Lead should be created

Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|
