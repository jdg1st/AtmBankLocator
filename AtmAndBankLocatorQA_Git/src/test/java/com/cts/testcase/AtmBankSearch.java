package com.cts.testcase;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
	
	@Test(priority=1)
	public void launchWebsite() {
		
		try {
			if(driver.getTitle().contains("Welcome to ATM and Branch")) {
				
				pageUtil.explicitWaitForElem("USERNAME", driver);
				
				System.out.println("success--------------");
			}
		}
		catch(Exception e) {
			
		}
	}
	
	@Test(priority=2)
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
	
	@Test(priority=3)
	public void locateAtm() {
		Select select =null;
		String searchRestTxt="";
		try {
			elem=driver.findElement(atmBankLocPage.searchResult);
			searchRestTxt=elem.getText();
			
			elem=driver.findElement(atmBankLocPage.searchTab);
			if(elem.isDisplayed()) {
				elem.click();
			}
			elem=driver.findElement(atmBankLocPage.selectBank);
			if(elem.isDisplayed()) {
				select= new Select(elem);
				select.selectByVisibleText("Barclays");
			}
			elem=driver.findElement(atmBankLocPage.searchType);
			if(elem.isDisplayed()) {
				elem.click();
			}
			pageUtil.explicitWaitForElem(pageUtil.getXpath(atmBankLocPage.locality), driver);
			
			elem=driver.findElement(atmBankLocPage.locality);
			if(elem.isDisplayed()) {
				select= new Select(elem);
				select.selectByVisibleText("Gristol");
			}
			pageUtil.explicitWaitForElem(pageUtil.getXpath(atmBankLocPage.zipCode), driver);
			
			elem=driver.findElement(atmBankLocPage.zipCode);
			if(elem.isDisplayed()) {
				select= new Select(elem);
				select.selectByVisibleText("18JK67");
			}
			elem=driver.findElement(atmBankLocPage.searchBtn);
			if(elem.isDisplayed()) {
				elem.click();
			}
			
			if (pageUtil.explicitWaitForElem(pageUtil.getXpath(atmBankLocPage.searchResult), driver)!=null) {
				elem=driver.findElement(atmBankLocPage.searchResult);
				searchRestTxt=elem.getText();
				if(!searchRestTxt.isEmpty()) {
					System.out.println("----------Search was successful-----------");
					System.out.println("\n");
					System.out.println("Search result was \n\n"+searchRestTxt);
				}
				
				else
					System.out.println("----------Search wasn't successful-----------");
			}
		}
		catch(Exception e) {
			
		}
	}
	
	@Test(priority=4)
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
