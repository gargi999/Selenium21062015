package com.webtek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	private static WebDriver driver;
	
public LoginPage(WebDriver driver){
	this.driver=driver;
}

public static class CreateAccount{
	
	@FindBy(how=How.CSS,using="#email_create")
	public static WebElement email;
	
	@FindBy(how=How.CSS,using="#SubmitCreate")
	public static WebElement submit;
	
	@FindBy(how=How.CSS,using="#create_account_error>ol>li")
	public static boolean alertmsg;
	
}

public static class Registered{
	
	@FindBy(how=How.CSS,using="#email")
	public static WebElement userid;
	
	@FindBy(how=How.CSS,using="#passwd")
	public static WebElement pwd;
	
	@FindBy(how=How.CSS,using="#SubmitLogin")
	public static WebElement submit;
	
	
	}

}
