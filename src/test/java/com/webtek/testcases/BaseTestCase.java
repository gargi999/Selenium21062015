package com.webtek.testcases;


import java.util.concurrent.TimeUnit;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterSuite;
import org.testng.Assert;
import org.testng.annotations.*;
import com.webtek.utils.Log;


public class BaseTestCase {
	
	public static WebDriver driver;

	@BeforeSuite
	public void Setup() throws Exception{
		
	DOMConfigurator.configure("log4j.xml");
	
	try{
		
	 driver = new FirefoxDriver();
	 driver.get("http://automationpractice.com/index.php");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 Log.info("Browser opening successfully with desired URL");
	 
	}catch(Exception e){
		Log.error("Browser not opening successfully");
		throw(e);
	}
	
	     System.out.println(driver.getTitle());
		 String ActualTitle=driver.getTitle();
		 Assert.assertEquals(ActualTitle, "My Store");
	
}
	
	@AfterSuite
	 public void teardown()
	 {
		  driver.close();
		  driver.quit();
	  }
	
	
	
}
	 
