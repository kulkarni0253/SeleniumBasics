package com.prac.tal;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.test.Util.TestUtil;

import datadriven.ReadExcelSheet;
@Listeners(CustomListner.class)
public class HalfEbayTest {
	
	WebDriver driver;
	String excelPath = "C:\\Users\\HarshalKulkarni\\Desktop\\HalfEbayTestData.xlsx";
	
	@BeforeMethod
	public void SetUp(){
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\HarshalKulkarni\\Desktop\\Selenium_files\\3rd June\\chromedriver_win32_B39\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS );	
		driver.get("https://reg.ebay.in/reg/PartialReg");
	}
	
	@DataProvider
	public Object[][] getData(){
	Object data[][] =	TestUtil.getTestData("test");
	return data;
	}
		
		
	
	@Test(dataProvider = "getData")
	public void HalfEbayRegPage(String firstname, String lastname, String emailID, String Password){
	
		
		driver.findElement(By.xpath("//input[@id='firstname']")).clear();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstname);
		
		driver.findElement(By.xpath("//input[@id='lastname']")).clear();
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);
		
		driver.findElement(By.xpath(".//*[@id='email']")).clear();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(emailID);
		
		driver.findElement(By.xpath(".//*[@id='PASSWORD']")).clear();
		driver.findElement(By.xpath(".//*[@id='PASSWORD']")).sendKeys(Password);
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}

}
