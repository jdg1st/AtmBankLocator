package com.cts.pages;
import org.openqa.selenium.By;

public class AtmBankLocPage{

	public final By welcomeUser = By.xpath(".//div//font[contains(text(),'Welcome')]");
	public final By logout = By.xpath(".//div//u[text()='logout']");
	public final By selectBank = By.id("banks");
	public final By locality = By.id("locality");
	public final By zipCode = By.id("zipcode");
	public final By searchType = By.id("atm");
	public final By searchBtn = By.xpath(".//input[@value='Search']");
	public final By searchTab = By.xpath(".//button[text()='Search']");
	public final By historyTab = By.xpath(".//button[text()='History']");
	public final By searchResult = By.id("rightcolumn");
	
	
	
	
	
	/*private List<WebElement> tableHeader=null;
	private List<WebElement> setTableHeader(){
		tableHeader= driver.findElements(By.xpath(".//div[@class='tabbedContent']//div[@class='allTablesContainer']//table/thead/tr/th"));
		return tableHeader;
	}
	public List<WebElement> getTableHeader(){
		return this.setTableHeader();		
	}
	
	
	private List<WebElement> tableRows=null;
	private List<WebElement> setTableRows(){
		tableRows= driver.findElements(By.xpath(".//div[@class='tabbedContent']//div[@class='allTablesContainer']//table/tbody[@class='tableBodyContainer']/tr/td"));
		return tableRows;
	}
	public List<WebElement> getTableRows(){
		return this.setTableRows();		
	}
	
	private WebElement advertisementClose=null;
	private WebElement setAdvertisementClose(){
		advertisementClose= driver.findElement(By.id("advertClose"));
		return advertisementClose;
	}
	public WebElement getAdvertisementClose(){
		return this.setAdvertisementClose();		
	}
	
	
	private WebElement cookyAcceptance=null;
	private WebElement setCookyAcceptance(){
		cookyAcceptance= driver.findElement(By.xpath(".//section[@class='js-cookies-notice cookies-notice']//div[text()='I accept cookies from this site']"));
		return cookyAcceptance;
	}
	public WebElement getCookyAcceptance(){
		return this.setCookyAcceptance();		
	}*/
}
