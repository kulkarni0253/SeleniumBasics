package blablacarB15.tests.profile.personalinfo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import blablacarB15.pomLib.common.LoginPageB15;
import blablacarB15.pomLib.profile.personalinfo.ProfilePerInfoPage;
import blablacarB15.utilites.PropertiesOperation;

public class CreateProfileScenarios {
	
	@Test
	public void createUserProfilewithMandatoryField() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HarshalKulkarni\\Desktop\\Selenium_files\\3rd June\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
			PropertiesOperation prop = new PropertiesOperation();
	      String url = prop.getRadicalValueBykey("hostURL");
		driver.get(url);
		LoginPageB15 login = new LoginPageB15();
		login.loginTest(driver, "kulkarni.h.k.28@gmail.com", "harshal@5");
		
		ProfilePerInfoPage info = new ProfilePerInfoPage();
		info.gotoprofilepage(driver);
		info.enterUserName(driver, "Bandya");
		boolean result = info.isSaveButtonEnabled(driver);
		Assert.assertTrue(result);
		System.out.println("Your first automated test case is in progress.....");
		
	}
	
//	@Test
//	public void createUserProfilewithAllField() throws InterruptedException{
//		
//		WebDriver driver = new FirefoxDriver();
//		driver.get("blablacar.in");
//		LoginPageB15 login = new LoginPageB15();
//		login.loginTest(driver, "Mayur", "abc");
//		
//	}

}
