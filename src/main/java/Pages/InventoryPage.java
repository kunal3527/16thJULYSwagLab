package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Base.SwagLab_base;
import Utility.Utilities;

public class InventoryPage extends SwagLab_base{
	@FindBy(xpath = "//span[text()='Products']")private WebElement prodtext;
	@FindBy(xpath ="//div[@class='peek']")private WebElement smalllogo;
	@FindBy(xpath = "//div[@class='app_logo']")private WebElement applogo;
	@FindBy(xpath = "//img[@alt='Swag Bot Footer']")private WebElement biglogo;
	@FindBy(xpath = "(//a[@target='_blank'])[1]")private WebElement Twitterlogo;
	@FindBy(xpath = "(//a[@target='_blank'])[2]")private WebElement Facebooklogo;
	public InventoryPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	 public String validateProducttext()
	    {
	    	Reporter.log("Validating product text....",true);
	    	 return prodtext.getText();
	    }
	    
	 public boolean validateApplogo()
	 {  
		 Reporter.log("Validating AppLogo....",true);
		 return applogo.isDisplayed(); 
	 }
	 
	public boolean validatesmalllogo()
	{    Reporter.log("Validating SmallLogo....",true);
		 return smalllogo.isDisplayed();
	}
	 
	public boolean validateBiglogo()
	{
		Reporter.log("Validating Biglogo....",true);
		return biglogo.isDisplayed();
	}
	
	public boolean validateTwitterlogo()
	{
		Reporter.log("Validating TwitterLogo....",true);
	    return Twitterlogo.isDisplayed();	
	}
	public boolean validateFacebookLogo()
	{
		return Facebooklogo.isDisplayed();
	}
}
