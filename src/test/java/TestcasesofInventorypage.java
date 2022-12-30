import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
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
}
	
	 @Test
	   public void validateproducttextTest() throws IOException
	   {
		     login.procreedtoInventoryPage(Utilities.readpropertyfile("UserId"), Utilities.readpropertyfile("Password"));
		    
		     String act= invent.validateProducttext();
		     Assert.assertEquals(act,"PRODUCTS");
	   }
	 
	 @Test
	 public void valadatingswaglogoTest()
	 {
		 boolean result = invent.validateswaglogo();
		 Assert.assertTrue(result);
	 }
	   
	 @AfterMethod()
	   public void closebrowser()
	   
	   {
		 driver.close();  
	   }
	 
	
}