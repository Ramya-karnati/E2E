package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Products {
	WebDriver dr;
	
	public Products(WebDriver driver)
	{
		dr= driver;
	PageFactory.initElements(driver,this);
	}
   @FindBy(how=How.XPATH,using="//button[text()='Add to cart']")
   WebElement Addtocart;
   @FindBy(how=How.XPATH,using="//a[@class='shopping_cart_link']")
   WebElement shopping_cart_link;
   @FindBy(how=How.CLASS_NAME,using="title")
   WebElement yourcartassertion;
   public void Add_To_Cart()
   {
	   for( int i=0; i<3; i++)
	   {
		   Addtocart.click();
	   }
   }
   public void shoppingcartclick()
   {
	 shopping_cart_link.click();
	 Assert.assertTrue(yourcartassertion.isDisplayed(), "yourcart verification");
   }
}
   

