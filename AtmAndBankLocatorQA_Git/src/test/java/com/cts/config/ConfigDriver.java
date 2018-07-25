package com.cts.config;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ConfigDriver  {
	
	public WebDriver driver =null;
	@SuppressWarnings("deprecation")
	public WebDriver getSetDriver() {
		String workingDir = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver",workingDir+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"BrowserDrivers"+File.separator+"chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","/home/ubuntu/chromedriver");		
		//ChromeOptions opt= new ChromeOptions();	
		//DesiredCapabilities desiredCap = DesiredCapabilities.chrome();
		//desiredCap.setCapability("--headless", true);
        //final URL url = new URL("http://18.188.250.212:8080/AtmAndBranchLocator.war/");
        //driver = new RemoteWebDriver(url, desiredCap);
		//opt.addArguments("port=4444");
		//opt.addArguments("--headless");
//		DesiredCapabilities desired = new DesiredCapabilities();		
//		desired.setCapability(ChromeOptions.CAPABILITY, opt);
		//driver = new ChromeDriver(opt);
		//driver = new RemoteWebDriver(desired);
		//driver = new ChromeDriver();

// 		System.setProperty("webdriver.gecko.driver", "/home/ubuntu/geckodriver");
// 		FirefoxOptions fo = new FirefoxOptions();
// 		fo.addArguments("--headless");
// 		driver = new FirefoxDriver(fo);

// 		System.setProperty("phantomjs.binary.path", "/usr/local/bin/phantomjs");
// 		System.setProperty("phantomjs.binary.path", "/usr/local/share/phantomjs-2.1.1-linux-x86_64/bin/phantomjs");
		File path=new File("/usr/local/bin/phantomjs");
		System.setProperty("phantomjs.binary.path", path.getAbsolutePath());
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setJavascriptEnabled(true);
		String [] phantomJsArgs = {"--ignore-ssl-errors=yes"};
		desiredCapabilities.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, phantomJsArgs);
		driver = new PhantomJSDriver(desiredCapabilities);
		
		
// 		driver = new HtmlUnitDriver();
		return driver;
	}

}
