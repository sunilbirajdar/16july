package neostoxPOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Utilitynew.common_;

public class neostoxspasscode {
	
	@FindBy(xpath = "//input[@type='password']" )private WebElement passcode;
	@FindBy(xpath = "//a[text()='Submit']" )private WebElement submit;
	
	public  neostoxspasscode(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}public void neostoxpass( WebDriver driver,String pass) {
		
		common_.wait(driver, 1000);
		passcode.sendKeys(pass);
		Reporter.log(" passcode entering ", true);
		
	}
	public void submitbutton() throws InterruptedException {
		Thread.sleep(1000);
		submit.click();
	}
}
