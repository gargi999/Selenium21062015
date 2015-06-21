package com.webtek.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.webtek.pages.AddressPage;
import com.webtek.pages.Home;
import com.webtek.pages.LoginPage;
import com.webtek.pages.MyAccountPage;
import com.webtek.pages.OrderSummaryPage;
import com.webtek.pages.PaymentPage;
import com.webtek.pages.ProductPage;
import com.webtek.pages.RegistrationPage;
import com.webtek.pages.ShippingPage;
import com.webtek.testcases.BaseTestCase;
import com.webtek.utils.Log;

public class SignUpBeforePurchaseAction extends BaseTestCase{
	
	public static void execute_signupUser(String email,String firstName, String lastName,
			String password, String myfirstname, String mylastname,
			String mycompany, String myAddressField1, String myAddressField2,
			String myCity, String myPostCode, String myPhone,
			String myAliasAddress,String ProductCategory,String ProductSelect,String ProductSize,String ProductColour) throws Exception{
		
		
	try{
		
	Home.sign_in.click();	
	LoginPage.CreateAccount.email.sendKeys(email);
	LoginPage.CreateAccount.submit.click();

	if (LoginPage.CreateAccount.alertmsg==true)
	{
			Log.info("Invalid Login Attempt");
			System.out.println("Invalid Login Attempt");
		}
	
	else{
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
		
	}

	}catch(Exception e){

		Log.error("SignUpAction not executed successfully--User registration incomplete");
		throw(e);
	}


       
	//purchase Action started//
	
	    String price=null;
		String order_confirmation_msg=null;
		
		try{
		
		MyAccountPage.home.click();
		
		if (ProductCategory.equalsIgnoreCase("DRESSES")){
		WebElement mainmenu=Home.HeaderMenu.Dresses;
		
		if (ProductSelect.equalsIgnoreCase("Summer dress")){
		WebElement submenu=Home.DressesSubmenu.summerdress;
		Actions hover=new Actions(driver);
		hover.moveToElement(mainmenu).moveToElement(submenu).click().build().perform();
		}
		
		if (ProductSelect.equalsIgnoreCase("Evening dress")){
			WebElement submenu=Home.DressesSubmenu.eveningdress;
			Actions hover=new Actions(driver);
			hover.moveToElement(mainmenu).moveToElement(submenu).click().build().perform();
			}
		
		if (ProductSelect.equalsIgnoreCase("Casual dress")){
			WebElement submenu=Home.DressesSubmenu.casualdress;
			Actions hover=new Actions(driver);
			hover.moveToElement(mainmenu).moveToElement(submenu).click().build().perform();
			}
		
		}
		
		
	if (ProductSize.equalsIgnoreCase("S")){
	ProductPage.chkbox_sizeS.click();
	}
	
	if (ProductSize.equalsIgnoreCase("M")){
		ProductPage.chkbox_sizeM.click();
		}
	
	
	if (ProductSize.equalsIgnoreCase("L")){
		ProductPage.chkbox_sizeL.click();
		}

	// Scroll down
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("scroll(0,350)");
			
if(ProductColour.equalsIgnoreCase("White")){
	ProductPage.chkbox_colour_white.click();
}

if(ProductColour.equalsIgnoreCase("Orange")){
	ProductPage.chkbox_colour_orange.click();
}

if(ProductColour.equalsIgnoreCase("Green")){
	ProductPage.chkbox_colour_green.click();
}

if(ProductColour.equalsIgnoreCase("Black")){
	ProductPage.chkbox_colour_black.click();
}


if(ProductColour.equalsIgnoreCase("Yellow")){
	ProductPage.chkbox_colour_yellow.click();
}
	
if(ProductColour.equalsIgnoreCase("Blue")){
	ProductPage.chkbox_colour_blue.click();
}

if(ProductColour.equalsIgnoreCase("Pink")){
	ProductPage.colour_pink.click();
}

Select sort_item=new Select(ProductPage.sort);
		sort_item.selectByValue("quantity:desc");
		
		/*Add an item to shopping cart*/
		
				  Actions hover1=new Actions(driver);
				  hover1.moveToElement(ProductPage.item1).build().perform();
				  ProductPage.additem1.click();
			
		  /*Proceed to checkout*/
		  Actions hover2=new Actions(driver);
		  hover2.moveToElement(ProductPage.product_cart).build().perform();
		  ProductPage.proceedTochkout.click();
		  
		  //OrderSummaryPage.order_price.getAttribute(price);
          OrderSummaryPage.proceedTocheckout.click();
          
          Select delivery_address=new Select(AddressPage.seldeliveryaddr);
          delivery_address.selectByIndex(0);
          
        if (!AddressPage.chkaddress.isSelected())
        {
        	AddressPage.chkaddress.click();
        }
        
        AddressPage.ordermsg.sendKeys("happy birthday");
        AddressPage.proceedTocheckout.click();
        
       ShippingPage.service_terms.click();
       ShippingPage.proceedTocheckout.click();
       
       price = PaymentPage.order_price.getText();
       Log.info("Order price is:        "+price);
       PaymentPage.pay_check.click();
       PaymentPage.confirm_order.click();
       order_confirmation_msg=PaymentPage.order_confirm_msg.getText();
       Log.info("Order Confirmation message is:       "+order_confirmation_msg);
       Log.info("Product Purchase successful");
       
		
		}catch(Exception e){
			Log.error("Product Purchase not successful");
			throw(e);
		
		}
		
		//SignOut action started
		MyAccountPage.signout.click();
		Thread.sleep(100);
		
	}
	
}
