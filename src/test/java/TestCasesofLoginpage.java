import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.SwagLab_base;
import Pages.InventoryPage;
import Pages.Loginpage;
import Utility.Utilities;

public class TestCasesofLoginpage extends SwagLab_base{
	 Loginpage login;
	 InventoryPage invent;
	
	@BeforeMethod
	
	public void setup() throws IOException
	{
		
	     launchchromebrowser();	
		 login=new Loginpage();
		 invent=new InventoryPage();
	}

//	@BeforeMethod
//	public void loginToSwagLabs() throws EncryptedDocumentException, IOException
//	{
//		Utilities.wait(3000);
//		login.enterusername(Utilities.readpropertyfile("UserId"));
//		login.enterpassword(Utilities.readpropertyfile("Password"));
//		 login.clickOnloginbutton();
//	}
	
   @Test
   public void validateTitleTest()
   {
	  String expected="Swag Labs";
	  String actual = login.validatetitle();
	  Assert.assertEquals(actual, expected);
	   
   }
   
   @Test 
   public void validateUrlTest()
   {
	  String expected="https://www.saucedemo.com/";
	  String actual = login.validateUrl(); 
	  Assert.assertEquals(actual, expected);
   }
   
   @Test(enabled=false)
   public void validatingloginlogoTest() throws InterruptedException
   {   Thread.sleep(2000);
	   boolean result = login.validateloginlogo();
	   Assert.assertEquals(result, true);
   }
   
   @Test(enabled=false)
   public void valiatingInventorypageURLTest() throws IOException
   {
	   String act=login.procreedtoInventoryPage(Utilities.readpropertyfile("UserId"), Utilities.readpropertyfile("Password"));
	   Assert.assertEquals(act, "https://www.saucedemo.com/inventory.html");
	   
   }
   
   
 
   @AfterMethod()
   public void closebrowser()
   
   {
	 driver.close();  
   }
   
}
