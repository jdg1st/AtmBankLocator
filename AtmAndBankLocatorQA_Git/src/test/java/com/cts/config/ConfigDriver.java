package com.cts.config;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ConfigDriver  {
	
	public WebDriver driver =null;
	public WebDriver getSetDriver() {
		String workingDir = System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver",workingDir+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"BrowserDrivers"+File.separator+"chromedriver");
		//System.setProperty("webdriver.chrome.driver","//usr//lib//chromium-browser//chromedriver");
		//System.setProperty("webdriver.chrome.driver","//usr//bin//chromedriver");
		System.setProperty("webdriver.chrome.driver","//home//ubuntu//chromedriver");
		ChromeOptions opt= new ChromeOptions();
//		opt.addArguments("--start-maximized");
		opt.addArguments("--headless");
		driver = new ChromeDriver(opt);
		//driver = new ChromeDriver();
		return driver;
	}

}
