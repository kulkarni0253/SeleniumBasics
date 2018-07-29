package blablacarB15.pomLib.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageB15 {
	
	String userNameLocator = ".//*[@id='root']/main/div/div/div/div/form/div[1]/div/input";
	String userpwdLocator = ".//*[@id='root']/main/div/div/div/div/form/div[2]/div/input";
	String loginButtonLocator = ".//*[@id='root']/main/div/div/div/div/form/div[3]/button";
	String Loginwithmail = ".//*[@id='root']/main/div/div/div/div/div/nav/a/span";
	
	
	public void enterUserName(WebDriver driver, String name){
		driver.findElement(By.xpath(userNameLocator)).clear();
		driver.findElement(By.xpath(userNameLocator)).sendKeys(name);
	}
	
	public void enterUserpwd(WebDriver driver, String pwd) throws InterruptedException{
		driver.findElement(By.xpath(userpwdLocator)).sendKeys(pwd);
		Thread.sleep(5000);
		driver.findElement(By.xpath(loginButtonLocator)).click();
	}
	
	public void clickLoginButton(WebDriver driver) throws InterruptedException{
		driver.findElement(By.xpath(Loginwithmail)).click();
	}
	
	public void loginTest(WebDriver driver, String name, String pwd) throws InterruptedException{
		
		LoginPageB15 login = new LoginPageB15();
		login.clickLoginButton(driver);
		login.enterUserName(driver, name);
		login.enterUserpwd(driver, pwd);
		
		
	}

}
