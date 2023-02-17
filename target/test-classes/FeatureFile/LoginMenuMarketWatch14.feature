@LoginMenuMarketWatchDatawithoutExample
Feature: Sharekhan LoginMenuMarketWatch validation with datawithoutExample
Scenario:  Verify to LoginMenuMarketWatch Sharekhan application
Given user is on login screen 
When user clicks on LoginID as "<SWATIKALE>" and MembershipPassword as "<Swati@1435*>" on login page
And user clicks on Login button to see dashboard page 
And user clicks on MarketWatch Button on LoginMenuBar
Then user should able to see MarketWatch Button page on LoginMenuBar 