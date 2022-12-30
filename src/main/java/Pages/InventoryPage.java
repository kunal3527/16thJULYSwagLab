package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Base.SwagLab_base;

public class InventoryPage extends SwagLab_base{
	@FindBy(xpath = "//span[text()='Products']")private WebElement prodtext;
	@FindBy(xpath = "//div[@class='peek']")private WebElement swaglogo;
	
	public InventoryPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	 public String validateProducttext()
	    {
	    	Reporter.log("Validating product text....",true);
	    	 return prodtext.getText();
	    }
	    
	 public boolean validateswaglogo()
	 {
		 Reporter.log("Validating SwagLogo....",true);
		 return swaglogo.isDisplayed(); 
	 }
	 
	 
}
