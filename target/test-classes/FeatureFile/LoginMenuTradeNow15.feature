@LoginMenuTradeNowDatawithoutExample
Feature: Sharekhan LoginMenuTradeNow validation with datawithoutExample
Scenario:  Verify to LoginMenuTradeNow Sharekhan application
Given user is on login screen 
When user clicks on LoginID as "<SWATIKALE>" and MembershipPassword as "<Swati@1435*>" on login page
And user clicks on Login button to see dashboard page 
And user clicks on TradeNow Button on LoginMenuBar
Then user should able to see TradeNow Button page on LoginMenuBar 