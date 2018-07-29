package blablacarB15.utilites;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class MyScreenShotUtil {
	
	
	public void getScreenShot(WebDriver driver) throws IOException{
		TakesScreenshot obj =  (TakesScreenshot) driver;
		File srcFile=  obj.getScreenshotAs(OutputType.FILE);
		String title = driver.getTitle();
		String myTimeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		
		File destFile =new File("C:\\test100\\"+"Project_"+title+"_"+myTimeStamp+".png");
		FileUtils.copyFile(srcFile, destFile);
	}
	

}
