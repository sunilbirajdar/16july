package Utilitynew;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class   common_ {
		WebDriver driver;
		public static void screenshot(WebDriver driver, String nam) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 	
		File destination=new File("C:\\Users\\sunil birajdar\\OneDrive\\Pictures\\myfile"+nam+".png");	
	    FileHandler.copy(src, destination);
		}
		public static void ScrollintoView(WebDriver driver,WebElement element)
		{
			JavascriptExecutor jss = (JavascriptExecutor)driver;
			jss.executeScript("arguments[0].scrollIntoView(true)", element);
		    Reporter.log("scrolling into view ", true);
		}
		
		public static void wait (WebDriver driver, int wait) 
		{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(wait));
		Reporter.log("implicit waiting.", true);
}
		public static String propertiesMFile(String key ) throws IOException {
			
		//create object of properties file.
			Properties prop=new Properties();		
		
		FileInputStream myfile=new FileInputStream("C:\\Users\\sunil birajdar\\eclipse-workspace\\TATA5\\neostox.properties");
	    prop.load(myfile);
	   String keys = prop.getProperty(key);
	    
	   Reporter.log("Reading from properties file", true);
	
		return keys;
		}
		}
