package com.webtek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderSummaryPage {
	
	private static WebDriver driver;
	
	public OrderSummaryPage(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using=".//*[@id='center_column']/p[2]/a[1]/span")
	public static WebElement proceedTocheckout;
	
	@FindBy(how=How.XPATH,using=".//*[@id='total_price']")
	public static WebElement order_price;
	//public static WebElement proceedTocheckout=driver.findElement(By.className("button btn btn-default standard-checkout button-medium"));
	

}
