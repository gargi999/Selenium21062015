package com.webtek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddressPage {
	
private static WebDriver driver;
	
	public AddressPage(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using=".//*[@id='center_column']/form/p/button")
	public static WebElement proceedTocheckout;
	
	@FindBy(how=How.XPATH,using=".//*[@id='ordermsg']/textarea")
	public static WebElement ordermsg;
	
	@FindBy(how=How.ID,using="id_address_delivery")
	public static WebElement seldeliveryaddr;
	
	@FindBy(how=How.ID,using="addressesAreEquals")
	public static WebElement chkaddress;
	
	
	
	/*public static WebElement proceedTocheckout=driver.findElement(By.xpath(".//*[@id='center_column']/form/p/button"));
	public static WebElement ordermsg=driver.findElement(By.xpath(".//*[@id='ordermsg']/textarea"));
	public static WebElement continueshop=driver.findElement(By.xpath(".//*[@id='center_column']/form/p/a"));
	public static Select seldeliveryaddr=new Select(driver.findElement(By.id("id_address_delivery")));*/
	
	
	
	
		

}
