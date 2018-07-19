package com.cts.testcase;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.cts.pages.AtmBankLocPage;
import com.cts.utility.PageUtil;

//import com.pom.com.PremierLeaguePage;
//import com.utility.com.ExportData;
//import com.utility.com.PageUtility;

public class AtmBankSearch extends DriverScript{

//	ExportData export = new ExportData();
//	PageUtility pageUtil = new PageUtility();
	protected WebElement elem=null;
	PageUtil pageUtil = new PageUtil();
	AtmBankLocPage atmBankLocPage = new AtmBankLocPage();
	
	@Test
	public void launchWebsite() {
		List<WebElement> elems = null;
		List<String> headers = new ArrayList<String>();
		List<String> rows = new ArrayList<String>();
		
		
		try {
			if(driver.getTitle().contains("Welcome to ATM and Branch")) {
				
				pageUtil.explicitWaitForElem("USERNAME", driver);
				
				System.out.println("success--------------");
			}
		}
		catch(Exception e) {
			
		}
	}
	
	@Test
	public void login() {
		try {
			elem=driver.findElement(By.id("USERNAME"));
			if(elem.isDisplayed()) {
				elem.sendKeys("joydeep");
			}
			elem=driver.findElement(By.id("PASSWORD"));
			if(elem.isDisplayed()) {
				elem.sendKeys("123");
			}
			elem=driver.findElement(By.id("submit"));
			if(elem.isDisplayed()) {
				elem.click();
			}
			if (pageUtil.explicitWaitForElem(pageUtil.getXpath(atmBankLocPage.welcomeUser), driver)!=null) {
				System.out.println("----------login successful-----------");

			}
		}
		catch(Exception e) {
			
		}
	}
	
	@Test
	public void logout() {
		try {
			elem=driver.findElement(atmBankLocPage.logout);
			if(elem.isDisplayed()) {
				elem.click();
			}
			if (driver.findElement(By.xpath(pageUtil.getXpath(atmBankLocPage.welcomeUser))).isDisplayed()) {
				System.out.println("----------did not logout-----------");

			}
		}
		catch(Exception e) {
			System.out.println("----------logged out-----------");
		}
	}
}
