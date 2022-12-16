package neostoxPOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Utilitynew.common_;

public class neostoxhomepag{
	@FindBy(xpath = "(//a[text()='OK'])[2]")private WebElement okbutton;
    @FindBy(xpath = "(//a[text()='Close'])[5]")private WebElement closebuttonn;
    @FindBy(id="lbl_curbalancetop")private WebElement bal;
    @FindBy(xpath = "(//span[text()='Hi suni bira'])[1]")private WebElement uservalidate;
    @FindBy(xpath ="//span[text()='Logout']" )private WebElement logoutbutton;
	public neostoxhomepag(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void okbuttonn() {
	okbutton.click();
		
	}
	public void closebutton() {//driver) {
		closebuttonn.click();
			
		}
	public String userbalance(WebDriver driver) {
		String availbal = bal.getText();
		
	
	return availbal;
	}
	public String uservalidateID() {
		String userId = uservalidate.getText();
	Reporter.log("user id"+userId+"CORRECT",true );
	return userId;}
	public void logout(WebDriver driver) {
		uservalidate.click();
		common_.wait(driver, 1000);
		logoutbutton.click();
	}
}
