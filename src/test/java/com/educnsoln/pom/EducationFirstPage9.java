package com.educnsoln.pom;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.educnsoln.utilities.PropertyReader;

public class EducationFirstPage9 extends com.educnsoln.base.CommonFunctions {
	

	public static void browserLaunch()  {
		driver.findElement(By.name(PropertyReader.getProperty("browser"))).sendKeys("chrome");
		driver.findElement(By.id(PropertyReader.getProperty("baseUrl"))).sendKeys("https://www.sharekhan.com/");
		
	}

	public static void cickElement(String EducationFirst_btn_xpath) {
		driver.findElement(By.xpath("//a[@id='mainHeader']/nav/ul/li[7]/a")).click();
		
	}

	public static void dashBoardDisplayCheck2() {
		Assert.assertTrue(driver.findElement(By.xpath("//a[@id='mainHeader']/nav/ul/li[7]/a")).isDisplayed());
	}

	 
		
	}



