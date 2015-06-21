package com.webtek.actions;

//import java.util.Random;

import org.openqa.selenium.support.ui.Select;

import com.webtek.pages.Home;
import com.webtek.pages.LoginPage;
import com.webtek.pages.RegistrationPage;
import com.webtek.utils.Log;

public class SignUpAction {
	
public static void execute(String email,String firstName, String lastName,
		String password, String myfirstname, String mylastname,
		String mycompany, String myAddressField1, String myAddressField2,
		String myCity, String myPostCode, String myPhone,
		String myAliasAddress) throws Exception{
	

	if (LoginPage.CreateAccount.alertmsg==true)
	{
			Log.info("Invalid Login Attempt");
			
		}
	
try{
	
Home.sign_in.click();	
LoginPage.CreateAccount.email.sendKeys(email);
LoginPage.CreateAccount.submit.click();


	RegistrationPage.radiogender.get(1).click();
	RegistrationPage.firstname.sendKeys(firstName);
	RegistrationPage.lastname.sendKeys(lastName);
	RegistrationPage.pwd.sendKeys(password);
	
	Select dobdate=new Select(RegistrationPage.dd);
	dobdate.selectByValue("23");
	
	Select dobmonth=new Select(RegistrationPage.mm);
	dobmonth.selectByIndex(1);
	
	Select dobyear=new Select(RegistrationPage.yyyy);
	dobyear.selectByValue("1985");
	
	RegistrationPage.newsletter.click();
	RegistrationPage.optin.click();
	RegistrationPage.firstnm_address.clear();
	RegistrationPage.firstnm_address.sendKeys(myfirstname);
	RegistrationPage.lastnm_address.clear();
	RegistrationPage.lastnm_address.sendKeys(mylastname);
	RegistrationPage.company.sendKeys(mycompany);
	RegistrationPage.address1.sendKeys(myAddressField1);
	RegistrationPage.address2.sendKeys(myAddressField2);
	RegistrationPage.city.sendKeys(myCity);
	
	Select userstate=new Select(RegistrationPage.state);
	userstate.selectByVisibleText("Georgia");
	
	RegistrationPage.pincode.sendKeys(myPostCode);
	
	Select usercountry=new Select(RegistrationPage.country);
	usercountry.selectByVisibleText("United States");
	
	RegistrationPage.other.sendKeys("Delivery before midnight tomorrow");
	RegistrationPage.phone.sendKeys(myPhone);
	RegistrationPage.mobile.sendKeys("8051754417");
	RegistrationPage.alias.clear();
	RegistrationPage.alias.sendKeys(myAliasAddress);
	RegistrationPage.submit.click();
	Log.info("Registration successful");

}catch(Exception e){

	Log.error("SignUpAction not executed successfully--User registration incomplete");
	throw(e);
}

}
}

