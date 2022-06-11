Feature: Automate Leaftaps Application

Scenario: TC001_Login and Logout

Given Launch ChromeBrowser and load URL
And Enter username as DemoSalesManager
And Enter Password as crmsfa
When Click the login button
Then It's navigated Homepage
And Click the logout button
And Close browser


Scenario: TC002_Login and Logout Failure

Given Launch ChromeBrowser and load URL
And Enter username as harun
And Enter Password as crmsfa
When Click the login button
Then It's navigated same page
But  Verify error massage
And Close browser

Scenario: TC003_CreateLead

Given Launch ChromeBrowser and load URL 
And Enter username as DemoSalesManager 
And Enter Password as crmsfa 
And Click the login button
And Click CRMSFA
And Click leads link
When Click createLead	
And Enter the company  as ABC
And Enter the firstname as Hema
And Enter the lastname as Mali
And Choose source as Website
And Click the create lead button
Then It's navigated ViewLeadPage 
And Verify the firstname
And Close browser