package com.webtek.actions;

import com.webtek.pages.Home;
import com.webtek.pages.LoginPage;
import com.webtek.utils.Log;


public class SignInAction {
	
public static void execute(String uemail,String upwd) throws Exception{
	
	try{
		Home.sign_in.click();
		LoginPage.Registered.userid.sendKeys(uemail);
		LoginPage.Registered.pwd.sendKeys(upwd);
		LoginPage.Registered.submit.click();
		Log.info("Registered User login successful");
		
	}catch(Exception e){
		
		Log.error("Registered User could not Sign in successfully");
		throw(e);
	}
		
	}

}
