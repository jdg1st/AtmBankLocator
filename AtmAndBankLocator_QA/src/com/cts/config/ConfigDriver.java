package com.cts.config;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ConfigDriver  {
	
	public WebDriver driver =null;
	public WebDriver getSetDriver() {
		String workingDir = System.getProperty("user.dir");		
		System.setProperty("webdriver.chrome.driver",workingDir+File.separator+"src"+File.separator+"com"+File.separator+"cts"+File.separator+"resources"+File.separator+"com.cts.resources.browserdrivers"+File.separator+"chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
//		opt.addArguments("--start-maximized");
		opt.addArguments("--headless");
		driver = new ChromeDriver(opt);
		return driver;
	}

}
