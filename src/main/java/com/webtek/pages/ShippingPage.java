package com.webtek.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ShippingPage {
	
private static WebDriver driver;
	
	public ShippingPage(WebDriver driver){
		this.driver=driver;
	}

	@FindBy(how=How.CLASS_NAME,using="delivery_option_radio")
	public static WebElement deliveryopt;
	
	@FindBy(how=How.ID,using="cgv")
	public static WebElement service_terms; 
	
	@FindBy(how=How.XPATH,using=".//*[@id='form']/p/button")
	public static WebElement proceedTocheckout; 
	
	@FindBy(how=How.XPATH,using=".//*[@id='order']/div[2]/div/div/a")
	public static WebElement terms_alert_close;
	
// public static List<WebElement> deliveryopt=driver.findElements(By.className("delivery_option_radio"));
 
	
}
