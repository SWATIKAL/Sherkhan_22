package com.educnsoln.pom;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.educnsoln.utilities.PropertyReader;

public class MutualFundsPage7 extends com.educnsoln.base.CommonFunctions {
	

	public static void browserLaunch()  {
		driver.findElement(By.name(PropertyReader.getProperty("browser"))).sendKeys("chrome");
		driver.findElement(By.id(PropertyReader.getProperty("baseUrl"))).sendKeys("https://www.sharekhan.com/");
		
	}

	public static void cickElement(String Mutual_Funds_Menu_btn_xpath) {
		driver.findElement(By.xpath("//a[@id='mainHeader']/nav/ul/li[5]/a")).click();
		
	}

	public static void dashBoardDisplayCheck2() {
		Assert.assertTrue(driver.findElement(By.xpath("//a[@id='mainHeader']/nav/ul/li[5]/a")).isDisplayed());
		
	} 
	
}
