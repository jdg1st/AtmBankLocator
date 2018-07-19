package com.cts.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cts.testcase.DriverScript;

public class PageUtil extends DriverScript{

	protected static WebDriver driver=null;

	public WebElement explicitWaitForElem(String locator, WebDriver driver) {
		WebDriverWait wdWait = new WebDriverWait(driver, 90);
		WebElement found=null;
		try {
			if(locator.contains("/")) {
				found = wdWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
			}
			else {
				found = wdWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
			}
		}
		catch(Exception e) {
			return null;
		}
		return found;
	}
	public String getXpath(By by) {
		String xPath = by.toString();
		String [] strArray = xPath.split(" ");
		return strArray[1].trim();
	}
}
