package Base;

import java.io.IOException;
import java.time.Duration;

import javax.swing.text.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;



public class SwagLab_base  {
  public static WebDriver driver;
	
	public void launchchromebrowser() throws IOException 
	
	{       
		    WebDriverManager.chromedriver().setup();
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAI\\Documents\\16th july A evnning//chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    Utility.Utilities.wait(10);
	        driver.get(Utility.Utilities.readpropertyfile("Url"));
	        Reporter.log("Chrome is running",true);
	
	}
}
