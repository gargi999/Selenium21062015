package com.webtek.testcases;

import java.util.Random;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

//import com.webtek.actions.PurchaseAction;
//import com.webtek.actions.SignInAction;
//import com.webtek.actions.SignOut;
//import com.webtek.actions.SignUpAction;
import com.webtek.actions.SignUpBeforePurchaseAction;
import com.webtek.pages.AddressPage;
import com.webtek.pages.Home;
import com.webtek.pages.LoginPage;
import com.webtek.pages.MyAccountPage;
import com.webtek.pages.OrderSummaryPage;
import com.webtek.pages.PaymentPage;
import com.webtek.pages.ProductPage;
import com.webtek.pages.RegistrationPage;
import com.webtek.pages.ShippingPage;
import com.webtek.utils.ExcelUtils;
import com.webtek.utils.Log;


public class SanityTest1 extends BaseTestCase{
	
		@Test(dataProvider="SignUpUser")
		public void UserSignUpBeforePurchase(String f_Name, String l_Name,
				String pwd, String myf_name, String myl_name,
				String my_company, String myAddressF1, String myAddressF2,
				String my_City, String my_PostCode, String my_Phone,
				String my_AliasAddress,String myProductCategory,String myProductSelect,String myProductSize,String myProductColour) throws Exception{
			
			Log.startTestMethod("UserSignUp");
			
			PageFactory.initElements(driver,Home.class);
			PageFactory.initElements(driver,LoginPage.class);
			PageFactory.initElements(driver,LoginPage.CreateAccount.class);
			PageFactory.initElements(driver,RegistrationPage.class);
		    
		    PageFactory.initElements(driver,Home.HeaderMenu.class);
			PageFactory.initElements(driver,Home.DressesSubmenu.class);
			PageFactory.initElements(driver,OrderSummaryPage.class);
			PageFactory.initElements(driver,ProductPage.class);
			PageFactory.initElements(driver,MyAccountPage.class);
			PageFactory.initElements(driver,AddressPage.class);
			PageFactory.initElements(driver,ShippingPage.class);
			PageFactory.initElements(driver,PaymentPage.class);
			
			PageFactory.initElements(driver,MyAccountPage.class);	
			
			
			Random rand=new Random();
			String email=rand.nextInt(100)+"@g.com";
			
			Log.info("New user Registration started");
			
			SignUpBeforePurchaseAction.execute_signupUser(email, f_Name, l_Name, pwd, myf_name, myl_name,my_company,myAddressF1, myAddressF2, my_City, my_PostCode, my_Phone, my_AliasAddress,myProductCategory,myProductSelect,myProductSize,myProductColour);
			/*SignUpAction.execute(email,f_Name, l_Name, pwd, myf_name, myl_name, my_company,
					myAddressF1, myAddressF2, my_City, my_PostCode, my_Phone, my_AliasAddress,myProductCategory,myProductSelect,myProductSize,myProductColour);*/
			
			
			
		//Log.endTestMethod("UserSignUp");
		
	    //Log.startTestMethod("PurchaseAfterLogin");
			
			//PurchaseAction.execute(myProductCategory,myProductSelect,myProductSize,myProductColour);
			//Log.endTestMethod("PurchaseAfterLogin");
			
            //Log.startTestMethod("userSignOut");
      
		//SignOut.execute();
		//Log.endTestMethod("userSignOut");
			
		}

		
		@DataProvider(name="SignUpUser")
		public Object[][] getData() throws Exception {
		
			Object[][] celldata=ExcelUtils.getInstance().readData("src/test/resources/SignUp.xls", 0);
			System.out.println("Input data is+++"+celldata);
			return celldata;
		}
		
		
	}


