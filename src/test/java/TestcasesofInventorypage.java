import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.SwagLab_base;
import Pages.InventoryPage;
import Pages.Loginpage;
import Utility.Utilities;

public class TestcasesofInventorypage extends SwagLab_base {
	Loginpage login;
	InventoryPage invent;
	
	
	@BeforeMethod
	public void setup() throws IOException
	{
		
	     launchchromebrowser();	
		 invent=new InventoryPage();
		 login=new Loginpage();
		 login.procreedtoInventoryPage(Utilities.readpropertyfile("UserId"), Utilities.readpropertyfile("Password"));
   }
	
	
	 @Test
	   public void validateproducttextTest() 
	   {
		    
		     String act= invent.validateProducttext();
		     Assert.assertEquals(act,"PRODUCTS");
	   }
	 
	 @Test 
	 public void valadatingApplogoTest()
	 {    
		 
		 boolean result = invent.validateApplogo();
		 Assert.assertTrue(result, "Result is False");
	 }
	 @Test
	  public void validateSmalllogoTest()
	  {
		  
		boolean result = invent.validatesmalllogo(); 
		Assert.assertTrue(result, "Small logo is not displayed");
	  }
	   
	 @Test 
	 public void validatebiglogoTest()
	 {
		 boolean result = invent.validateBiglogo();
		 Assert.assertTrue(result,"Big logo is Not displayed");
		 
     }
	 
	 @Test
	 public void ValidateTwitterLogoTest()
	 {
		boolean result = invent.validateTwitterlogo(); 
		Assert.assertTrue(result, "Twitter logo is not Displayed");
	 }
	 
	 
	 @Test
	 public void ValidateFacebookLogoTest()
	 {
		boolean result = invent.validateFacebookLogo(); 
		Assert.assertEquals(result, true);
	 }
	 
	 @AfterMethod()
	   public  void closebrowser()
	   
	   {
		 driver.close();  
	   }
	 
	
}