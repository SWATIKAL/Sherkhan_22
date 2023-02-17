package com.educnsoln.runner;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import com.educnsoln.stepDefination.BrowserLaunchCloseStepDefination1;
import com.educnsoln.stepDefination.MainMenuStepDefination2;
import com.educnsoln.stepDefination.MarketMenuStepDefination3;
import com.educnsoln.stepDefination.NewToMarketStepDefination4;
import com.educnsoln.stepDefination.SuperInvestorStepDefination5;
import com.educnsoln.stepDefination.ActiveTraderStepDefination6;
import com.educnsoln.stepDefination.MutualFundsStepDefination7;
import com.educnsoln.stepDefination.ResearchStepDefination8;
import com.educnsoln.stepDefination.EducationFirstStepDefination9;
import com.educnsoln.stepDefination.InstaMfStepDefination10;
import com.educnsoln.stepDefination.ProductsAndServicesStepDefination11;
import com.educnsoln.stepDefination.LoginStepDefination12;
import com.educnsoln.stepDefination.LoginMenuBarStepDefination13;
import com.educnsoln.stepDefination.LoginMenuMarketWatchStepDefination14;
import com.educnsoln.stepDefination.LoginMenuTradeNowStepDefination15;
import com.educnsoln.stepDefination.LoginMenuReportsStepDefination16;
import com.educnsoln.stepDefination.LoginMenuFramesStepDefination17;
import com.educnsoln.stepDefination.TransferFundsStepDefination18;
import com.educnsoln.stepDefination.CashTransferStepDefination19;
import com.educnsoln.stepDefination.AddVirtualPortfolioStepDefination20;
import com.educnsoln.stepDefination.CreateVerifyWatchlistStepDefination21;
//import com.educationsolution.stepDefination;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@SuppressWarnings("unused")
@RunWith(Cucumber.class)
	
	@CucumberOptions(
			features =  "src\\test\\resources\\FeatureFile",
			//,glue = {"com.educnsoln.BrowserLaunchCloseStepDefination1"},
			//,glue = {"com.educnsoln.MainMenuStepDefination2"},
           // ,glue = {"com.educnsoln.MarketMenuStepDefination3"},
             glue = {"com.educnsoln.stepDefination"},
			
			//,glue = {"com.educnsoln.MainMenuPage2"},
			//name = {"com.educnsoln.BrowserLaunchCloseStepDefination1"},
			
			
			dryRun = true,
			
			monochrome = true,
			//tags = "@smoke and not @ignore"
			//tags = "@OrangeHRMLogin"
		    //tags = "@datatable"
			//tags = "@datawithoutExample"
			//tags="@test and not@Login1"
			//tags="@datawithoutExample or @datawithExample"     
			
			
			//tags = "@OpenCloseBrowser or @MainMenuVerification",
			//tags = "@MainMenuVerification",
							
			
		   //tags = "@OpenCloseBrowser and @MarketMenuVerification",
		   //tags = "@MarketMenuVerification",	
		   //tags = "@OpenCloseBrowser and @MainMenuVerification and @MarketMenuVerification",
		  
			
		
			
			
tags = "@OpenCloseBrowser or @MainMenuVerification or @MarketMenuVerification or @NewToMarketMenuVerification or @SuperInvestorMenuVerification or @ActiveTraderMenuVerification or @MutualFundsMenuVerification or @ResearchMenuVerification or @EducationFirstMenuVerification or @InstaMfMenuVerification or @ProductsAndServicesMenuVerification or @SharekhanLoginDatawithoutExample or @LoginMenuBarDatawithoutExample or @LoginMenuMarketWatchDatawithoutExample or @LoginMenuTradeNowDatawithoutExample or @LoginMenureportsDatawithoutExample or @LoginMenuFramesDatawithoutExample or @TransferFundswithDataTable or @CashTransferwithDataTable or @AddVirtualPortfoliowithDataTable or @CreateVerifyWatchlistwithDataTable",
			
		      // tags =	"@OpenCloseBrowser or @SharekhanLoginDatawithoutExample or @LoginMenuTradeNowDatawithoutExample or @LoginMenureportsDatawithoutExample or @TransferFundswithDataTable or @CashTransferwithDataTable",
		      // tags = "@LoginMenuFramesDatawithoutExample",
		       
//tags = "@OpenCloseBrowser or @MainMenuVerification  or @TransferFundswithDataTable or @CashTransferwithDataTable or @AddVirtualPortfoliowithDataTable or @CreateVerifyWatchlistwithDataTable",

plugin= {"pretty","html:target/cucumber-reports/reports.html",
			                "json:target/cucumber-reports/cucumber.json",
			                  "junit:target/cucumber-reports/cucumber.xml",
			                  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
			               
			    
			        )

			public class NewTestRunner {
				
			
				

		}

