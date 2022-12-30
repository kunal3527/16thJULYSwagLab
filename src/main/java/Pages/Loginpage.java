package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Base.SwagLab_base;
import Utility.Utilities;

public class Loginpage extends SwagLab_base {
   // obj repo
	@FindBy(id = "user-name")private WebElement Username;
    @FindBy(id = "password") private WebElement Password;
	@FindBy(xpath = "//input[@type='submit']")private WebElement Loginbutton;
    @FindBy(xpath = "//div[@class='bot_column']")private WebElement loginlogo;
 public Loginpage()
 {
	 PageFactory.initElements(driver, this);
 }
    public String validatetitle()
	{ Reporter.log("Validating title....",true);
		return driver.getTitle();
	}
	
	
	public String validateUrl()
	{
		Reporter.log("Validating currunturl....",true);
		 return driver.getCurrentUrl();
		 
	}
	
    public String procreedtoInventoryPage(String un,String pass)
    {
    	Username.sendKeys(un);
    	Password.sendKeys(pass);
    	Loginbutton.click();
    	Reporter.log("valadating URL of Inventory page to redirect on it.........",true);
    	return driver.getCurrentUrl();
    }
    
//    public void enterpassword(String pass)
//    {
//    	
//    	Password.sendKeys(pass);
//    }
    
//    public void clickOnloginbutton()
//    {
//    	
//    	Loginbutton.click();
//    }
    
    
    public boolean validateloginlogo()
    {
    
    Reporter.log("Validating loginlogo....",true);
    return loginlogo.isDisplayed();	
    	
    }
    
  
    
   
   
    
    
}
