package neostoxTestngclasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Bb.Base;
import Utilitynew.common_;
import neostoxPOMclasses.neostoxhomepag;
import neostoxPOMclasses.neostoxsloginpag;
import neostoxPOMclasses.neostoxspasscode;

@Listeners(Bb.Listener.class)
public class neostoxs extends Base{ 
	neostoxsloginpag loggin1;
	neostoxspasscode passcode;
	neostoxhomepag home;
@BeforeClass
public void launchbrowsers() throws IOException {
	hit_browser();
	loggin1=new neostoxsloginpag(driver);
	 passcode=new neostoxspasscode(driver);	
	 home = new neostoxhomepag(driver);
}
@BeforeMethod
public void loginneostoxs() throws EncryptedDocumentException, IOException, InterruptedException {
	
	common_.wait(driver, 1000);
	 loggin1.login(driver,common_.propertiesMFile("mobilenumber"));
	 common_.wait(driver, 1000);
	 loggin1.sigin();
	 common_.wait(driver, 1000);
	 passcode.neostoxpass(driver,common_.propertiesMFile("password"));
	
	 Thread.sleep(2000);
     passcode.submitbutton();
     Thread.sleep(2000);//
     home.okbuttonn();
     
     home.closebutton();}//}

  @Test
  public void availbalance() 
  {
	
	Assert.assertNotNull(home.userbalance(driver));
  
	 Reporter.log("availbal "+home.userbalance(driver), true);
	  

  }@Test
  public void validateuserID1() throws IOException 
  {
  	
  	Assert.assertEquals(home.uservalidateID(), common_.propertiesMFile("userid"),"exp and actual both rr macthing");

  	 Reporter.log("availbal "+home.uservalidateID(), true);
  	  
  }
	 @AfterMethod
  public void logout() {
	  
	  home.logout(driver);
	  
  }
  @AfterClass
  public void close() {
closebrowser(driver);
  }
}
