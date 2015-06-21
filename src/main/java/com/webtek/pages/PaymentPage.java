package com.webtek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaymentPage {
	
private static WebDriver driver;
	
	public PaymentPage(WebDriver driver){
		this.driver=driver;
	}
	
	 @FindBy(how=How.XPATH,using=".//*[@id='HOOK_PAYMENT']/div[1]/div/p/a")
	 public static WebElement pay_wire;
	 
	 @FindBy(how=How.XPATH,using=".//*[@id='HOOK_PAYMENT']/div[2]/div/p/a")
	 public static WebElement pay_check;

	 @FindBy(how=How.XPATH,using=".//*[@id='total_price']")
	 public static WebElement order_price;
		 
	 @FindBy(how=How.XPATH,using=".//*[@id='cart_navigation']/button")
	 public static WebElement confirm_order;
	 
	 @FindBy(how=How.XPATH,using=".//*[@id='center_column']/p[1]")
	 public static WebElement order_confirm_msg;
}
