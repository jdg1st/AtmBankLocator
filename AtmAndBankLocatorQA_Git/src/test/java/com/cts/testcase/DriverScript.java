package com.cts.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cts.config.ConfigDriver;

public class DriverScript extends ConfigDriver{	
	
	protected static WebDriver driver=null;
	
//	public static void main(String[] args) {
	
	@BeforeSuite
	public void beforeTest() {		
		driver=getSetDriver();
		driver.get("http://18.221.101.141:8080/AtmAndBranchLocator.war/");		
		
	}
	
	@AfterSuite
	public void afterMethod() {
		driver.quit();
	}

}