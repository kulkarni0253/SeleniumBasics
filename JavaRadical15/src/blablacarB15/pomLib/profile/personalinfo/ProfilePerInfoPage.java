package blablacarB15.pomLib.profile.personalinfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class ProfilePerInfoPage {
	
	
	String userNameLocator = "//input[@id='profile_general_firstname']";
	String saveButtonLocator = "//button[@type='submit']";
	String profile = "//a[@href='/dashboard/profile/menu']";	
	String minibio = "//div[@class='c-item-label o-flux-body o-flux-body--media']";
	String Threelines = "//button[@class='c-topbar-element c-topbar-element--button js-drawer-trigger']";
	String Dashboard = "//span[@text()='Dashboard']";
	
	public void gotoprofilepage(WebDriver driver) throws InterruptedException{
		
		driver.findElement(By.xpath(Threelines)).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(Dashboard)).click();
		
		driver.findElement(By.xpath(profile)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(minibio)).click();	
	}
	
	
	public void enterUserName(WebDriver driver, String name){
		driver.findElement(By.xpath(userNameLocator)).clear();
		driver.findElement(By.xpath(userNameLocator)).sendKeys(name);
	}
	
	public String getUserNameText(WebDriver driver, String name){
		return driver.findElement(By.xpath(userNameLocator)).getText();
	}
	
	
	public void clickSaveButton(WebDriver driver){
		driver.findElement(By.xpath(saveButtonLocator)).click();
	}
	
	public boolean  isSaveButtonEnabled(WebDriver driver){
		return driver.findElement(By.xpath(saveButtonLocator)).isEnabled();
	}

}
