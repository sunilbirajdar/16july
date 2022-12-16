package neostoxPOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class neostoxsloginpag {
	
	@FindBy(xpath = "(//input[@type='number'])[1]") private WebElement mobileno;
	@FindBy(xpath = "(//a[text()='Sign In'])[2]") private WebElement signin;
public neostoxsloginpag(WebDriver driver) 
 {
	PageFactory.initElements(driver, this);
}
public void login(WebDriver driver, String un) {
	
Reporter.log("mobile number entering", true);	
mobileno.sendKeys(un);


}public void sigin() {
Reporter.log(".preessing in sign", true);
signin.click();


}

}
