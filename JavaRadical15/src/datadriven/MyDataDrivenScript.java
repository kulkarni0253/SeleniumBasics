package datadriven;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyDataDrivenScript {
	
	WebDriver driver;
	String excelPath=
			"C:\\IBM_Workspace\\JavaRadical15\\src\\datadriven\\loginDemo.xlsx";
	
	@Test(dataProvider="B7MyDataProvider")
	public void loginToFacebook(String username, String password) throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HarshalKulkarni\\Desktop\\Selenium_files\\3rd June\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		
	}
	@DataProvider(name="B7MyDataProvider")
	public Object[][] getDataB7() throws InvalidFormatException, IOException{
		
		ReadExcelSheet excelObj = new ReadExcelSheet(excelPath);
		
		int rowCount = excelObj.getRowCount(0);
		int colCount = excelObj.getcolCount(0);
		
		System.out.println("rows are ="+rowCount+"cols are ="+colCount);
		
		Object[][] data = new Object[rowCount][colCount];
		
		
		for (int i=0 ; i<rowCount ;i++){
			int j=0; 
			data[i][j]=excelObj.getCellData(0,i, j);
			
			if(i<=rowCount){
				j++;
				}
			
			data[i][j]=excelObj.getCellData(0,i, j);
			if(i<=rowCount){
			j++;
			}
		}
		return data;
	}
	@AfterMethod
	public void tearDown(){
		//driver.quit();
	}
	


}
