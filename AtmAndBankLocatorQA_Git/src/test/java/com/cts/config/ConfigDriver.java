package com.cts.config;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class ConfigDriver  {
	
	public WebDriver driver =null;
	@SuppressWarnings("deprecation")
	public WebDriver getSetDriver() throws MalformedURLException {
		String workingDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",workingDir+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"BrowserDrivers"+File.separator+"chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		
		
		DesiredCapabilities desiredCap = DesiredCapabilities.chrome();
		desiredCap.setCapability("headless", true);

        final URL url = new URL("http://18.221.101.141:8080/AtmAndBranchLocator.war/");
        driver = new RemoteWebDriver(url, desiredCap);

		
//		opt.addArguments("--start-maximized");
//		opt.addArguments("--headless");
//		DesiredCapabilities desired = new DesiredCapabilities();		
//		desired.setCapability(ChromeOptions.CAPABILITY, opt);

//		driver = new ChromeDriver(opt);
//		driver = new RemoteWebDriver(desired);
		return driver;
	}

}
