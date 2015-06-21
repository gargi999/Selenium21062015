package com.webtek.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Home {
	
	private static WebDriver driver;
	
	public Home(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(how=How.CLASS_NAME,using="login")
	public static WebElement sign_in;
	
	@FindBy(how=How.CSS,using="#contact-link>a")
	public static WebElement contact;
	
	@FindBy(how=How.XPATH,using=".//*[@id='header']/div[3]/div/div/div[3]/div/a")
	public static WebElement addToCart;


public static class HeaderMenu{
	
   @FindBy(how=How.XPATH,using=".//*[@id='block_top_menu']/ul/li[1]/a")
	public static WebElement Women;
	
	@FindBy(how=How.XPATH,using=".//*[@id='block_top_menu']/ul/li[2]/a")
	public static WebElement Dresses;
	
	@FindBy(how=How.XPATH,using=".//*[@id='block_top_menu']/ul/li[3]/a")
	public static WebElement Tshirts;

	
}


public static class DressesSubmenu{
	
   @FindBy(how=How.XPATH,using=".//*[@id='block_top_menu']/ul/li[2]/ul/li[1]/a")
	public static WebElement casualdress;
	
	@FindBy(how=How.XPATH,using=".//*[@id='block_top_menu']/ul/li[2]/ul/li[2]/a")
	public static WebElement eveningdress;
	
	@FindBy(how=How.XPATH,using=".//*[@id='block_top_menu']/ul/li[2]/ul/li[3]/a")
	public static WebElement summerdress;

}



public static class BodyPage{
	
	@FindBy(how=How.LINK_TEXT,using="Best Sellers")
	public static WebElement bestseller;
	
	@FindBy(how=How.LINK_TEXT,using="Popular")
	public static WebElement popular;
	
	@FindBy(how=How.XPATH,using=".//*[@id='homefeatured']/li[1]/div/div[1]/div/a[1]/img")
	public static WebElement item1;
	
	@FindBy(how=How.XPATH,using=".//*[@id='homefeatured']/li[1]/div/div[2]/div/a[2]/span")
	public static WebElement addcart_item1;
	


}
	

}
