package com.webtek.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.webtek.pages.AddressPage;
import com.webtek.pages.Home;
import com.webtek.pages.MyAccountPage;
import com.webtek.pages.OrderSummaryPage;
import com.webtek.pages.PaymentPage;
import com.webtek.pages.ProductPage;
import com.webtek.pages.ShippingPage;
import com.webtek.testcases.BaseTestCase;
import com.webtek.utils.Log;

public class PurchaseAction extends BaseTestCase{

	public static void execute(String ProductCategory,String ProductSelect,String ProductSize,String ProductColour) throws Exception{
		
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
		
		Select sort_item=new Select(ProductPage.sort);
		sort_item.selectByValue("quantity:desc");

		
		/*Add an item to shopping cart*/
		
				  Actions hover1=new Actions(driver);
				  hover1.moveToElement(ProductPage.item1).build().perform();
				  ProductPage.additem1.click();
				

		}

		}
		
		
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
		  
	}
}
