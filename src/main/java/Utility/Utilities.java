package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;

import Base.SwagLab_base;

public class Utilities extends SwagLab_base{

	public static String readExcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("C:\\Users\\SAI\\Velocity\\eclipse-workspace\\Maven_Swag_Lab_Automate\\Testdata\\Swag_lab_Data.xlsx");
		String value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
		Reporter.log("Data reading from excel sheet.......",true);
		return value;
	}
	
	public static String readpropertyfile(String key) throws IOException
	{
	Properties p=new Properties();
	FileInputStream Myfile=new  FileInputStream("C:\\Users\\SAI\\Velocity\\eclipse-workspace\\Maven_Swag_Lab_Automate\\Swaglab.properties");
	p.load(Myfile);	
	Reporter.log("Reading " +key+" from property File......",true);
	String value = p.getProperty(key);
	return value;
	}
	
	public static void Screenshot(String ScreenshotName) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\SAI\\Velocity\\eclipse-workspace\\Maven_Swag_Lab_Automate\\Screenshot\\"+ScreenshotName+".png");
	    org.openqa.selenium.io.FileHandler.copy(src, dest);
	    Reporter.log("Taking screenshot of "+ScreenshotName+"......",true);
	}
	
	public static void wait(int waittime)
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waittime));
		Reporter.log("Taking wait of "+waittime+" ms.....",true);
	}
	
	public static void Scrolling(String element)
	{
		
		wait(1000);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		Reporter.log("Scrolling towords the "+element+ ".....",true);
	}
	
}

