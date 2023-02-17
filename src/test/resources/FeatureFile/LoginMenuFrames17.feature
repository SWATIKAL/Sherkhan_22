@LoginMenuFramesDatawithoutExample
Feature: Sharekhan LoginMenuFrame validation with datawithoutExample
Scenario:  Verify to LoginMenuFrame Sharekhan application
Given user is on login screen 
When user clicks on LoginID as "<SWATIKALE>" and MembershipPassword as "<Swati@1435*>" on login page
And user clicks on Login button to see dashboard page 
And user clicks on LoginMenuFrame Button on LoginMenuBar
Then user should able to see LoginMenuFrame Button page on LoginMenuBar 