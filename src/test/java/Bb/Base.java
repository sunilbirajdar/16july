package Bb;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import Utilitynew.common_;


	public class Base {
		protected WebDriver driver;
		public   void hit_browser() throws IOException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\\\sunil Birajdar\\\\chromedriver.exe");
		    driver= new ChromeDriver();
			driver.manage().window().maximize();	
			driver.get(Utilitynew.common_.propertiesMFile("url"));
			Reporter.log("hitting url", true);
			common_.wait(driver, 2000);
		}
		
		
		
		
		public void closebrowser(WebDriver driver ) {
			common_.wait(driver, 2000);
			driver.close();
		}

		
}
