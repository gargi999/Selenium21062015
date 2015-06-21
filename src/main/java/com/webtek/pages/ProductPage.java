package com.webtek.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductPage {

	private static WebDriver driver;
	public ProductPage(WebDriver driver){
		this.driver=driver;
	}
	
	/*Sorting products based on a sorting criteria*/
	
	@FindBy(how=How.ID,using="selectProductSort")
	public static WebElement sort;
	
	@FindBy(how=How.CSS,using="input#layered_id_attribute_group_1")
	public static WebElement chkbox_sizeS;
	
	@FindBy(how=How.CSS,using="input#layered_id_attribute_group_2")
	public static WebElement chkbox_sizeM;
	
	
	@FindBy(how=How.CSS,using="input#layered_id_attribute_group_3")
	public static WebElement chkbox_sizeL;
	
	@FindBy(how=How.CSS,using="input#layered_id_attribute_group_8")
	public static WebElement chkbox_colour_white;
	
	@FindBy(how=How.CSS,using="input#layered_id_attribute_group_11")
	public static WebElement chkbox_colour_black;
	
	@FindBy(how=How.CSS,using="input#layered_id_attribute_group_13")
	public static WebElement chkbox_colour_orange;
	
	@FindBy(how=How.CSS,using="input#layered_id_attribute_group_14")
	public static WebElement chkbox_colour_blue;
	
	@FindBy(how=How.CSS,using="input#layered_id_attribute_group_15")
	public static WebElement chkbox_colour_green;
	
	@FindBy(how=How.CSS,using="input#layered_id_attribute_group_16")
	public static WebElement chkbox_colour_yellow;
	
	@FindBy(how=How.LINK_TEXT,using="Pink")
	public static WebElement colour_pink;
	
	@FindBy(how=How.XPATH,using=".//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img")
	public static WebElement item1;
	
	@FindBy(how=How.XPATH,using=".//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span")
	public static WebElement additem1;
	
	
	@FindBy(how=How.XPATH,using=".//*[@id='center_column']/ul/li[2]/div/div[1]/div/a[1]/img")
	public static WebElement item2;
	
	@FindBy(how=How.XPATH,using=".//*[@id='center_column']/ul/li[2]/div/div[2]/div[2]/a[1]/span")
	public static WebElement additem2;
	
	
	@FindBy(how=How.XPATH,using=".//*[@id='layer_cart']/div[1]/div[2]")
	public static WebElement product_cart;
	
	@FindBy(how=How.XPATH,using=".//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
	public static WebElement proceedTochkout;
	
	

}
