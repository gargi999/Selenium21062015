package com.webtek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAccountPage {

	private static WebDriver driver;
	
public MyAccountPage(WebDriver driver){
	this.driver=driver;
}

@FindBy(how=How.XPATH,using=".//*[@id='header_logo']/a/img")
public static WebElement home;

@FindBy(how=How.CLASS_NAME,using="logout")
public static WebElement signout;

@FindBy(how=How.XPATH,using=".//*[@id='header']/div[3]/div/div/div[3]/div/a")
public static WebElement shopCart;


//public static WebElement signout=driver.findElement(By.cssSelector(".logout"));
//public static WebElement shopCart=driver.findElement(By.xpath(".//*[@id='header']/div[3]/div/div/div[3]/div/a"));
//public static WebElement returnhome=driver.findElement(By.xpath(".//*[@id='columns']/div[1]/a/i"));

}
