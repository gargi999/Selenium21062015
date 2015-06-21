package com.webtek.pages;

import java.util.List;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class RegistrationPage {

private static WebDriver driver;
	
	public RegistrationPage(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(how=How.NAME,using="id_gender")
	public static List<WebElement> radiogender;
	
			
	@FindBy(how=How.XPATH,using=".//*[@id='customer_firstname']")
	public static WebElement firstname;

	
	@FindBy(how=How.XPATH,using=".//*[@id='customer_lastname']")
	public static WebElement lastname;
	//public static WebElement lastname=driver.findElement(By.xpath(".//*[@id='customer_lastname']"));
	
	@FindBy(how=How.XPATH,using=".//*[@id='passwd']")
	public static WebElement pwd;
	//public static WebElement pwd=driver.findElement(By.xpath(".//*[@id='passwd']"));

	@FindBy(how=How.ID,using="days")
	public static WebElement dd;
	//public static Select dd = new Select(driver.findElement(By.id("days")));	 
	
	@FindBy(how=How.ID,using="months")
	public static WebElement mm;
	//public static Select mm = new Select(driver.findElement(By.id("months")));
	
	@FindBy(how=How.ID,using="years")
	public static WebElement yyyy;
	//public static Select yyyy = new Select(driver.findElement(By.id("years")));
	
	@FindBy(how=How.XPATH,using="//input[@id='newsletter']")
	public static WebElement newsletter;
	//public static WebElement newsletter=driver.findElement(By.xpath("//input[@id='newsletter']"));
	
	@FindBy(how=How.XPATH,using="//input[@id='optin']")
	public static WebElement optin;
	//public static WebElement optin=driver.findElement(By.xpath("//input[@id='optin']"));
	
	@FindBy(how=How.CSS,using="#firstname")
	public static WebElement firstnm_address;
	//public static WebElement firstnm_address=driver.findElement(By.cssSelector("#firstname"));
	
	@FindBy(how=How.CSS,using="#lastname")
	public static WebElement lastnm_address;
	//public static WebElement lastnm_address=driver.findElement(By.cssSelector("#lastname"));
	
	@FindBy(how=How.CSS,using="#company")
	public static WebElement company;
	//public static WebElement company=driver.findElement(By.cssSelector("#company"));
	
	@FindBy(how=How.CSS,using="#address1")
	public static WebElement address1;
	
	//public static WebElement address1=driver.findElement(By.cssSelector("#address1"));
	
	@FindBy(how=How.CSS,using="#address2")
	public static WebElement address2;
	//public static WebElement address2=driver.findElement(By.cssSelector("#address2"));
	
	@FindBy(how=How.CSS,using="#city")
	public static WebElement city;
	//public static WebElement city=driver.findElement(By.cssSelector("#city"));
	
	@FindBy(how=How.ID,using="id_state")
	public static WebElement state;
	//public static Select state = new Select(driver.findElement(By.id("id_state")));	
	
	@FindBy(how=How.CSS,using="#postcode")
	public static WebElement pincode;
	//public static WebElement pincode=driver.findElement(By.cssSelector("#postcode"));
	
	@FindBy(how=How.ID,using="id_country")
	public static WebElement country;
	//public static Select country = new Select(driver.findElement(By.id("id_country")));
	
	@FindBy(how=How.ID,using="other")
	public static WebElement other;
	//public static WebElement other=driver.findElement(By.cssSelector("#other"));
	
	@FindBy(how=How.ID,using="phone")
	public static WebElement phone;
	//public static WebElement phone=driver.findElement(By.cssSelector("#phone"));
	
	@FindBy(how=How.ID,using="phone_mobile")
	public static WebElement mobile;
	//public static WebElement mobile=driver.findElement(By.cssSelector("#phone_mobile"));
	
	@FindBy(how=How.ID,using="alias")
	public static WebElement alias;
	//public static WebElement alias=driver.findElement(By.cssSelector("#alias"));
	
	@FindBy(how=How.ID,using="submitAccount")
	public static WebElement submit;
	//public static WebElement submit=driver.findElement(By.cssSelector("#submitAccount"));
	
	
	
}
