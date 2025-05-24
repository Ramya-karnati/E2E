package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class checkout_overview{
	WebDriver dr;
	
	
	
	



	public checkout_overview(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		dr=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(how=How.CLASS_NAME,using="title")
     WebElement checkoutcompleteassertion;



	@FindBy(how=How.ID,using="finish")
	WebElement finish;
    public void finish()
    {
    	  finish.click();
    	  Assert.assertTrue(checkoutcompleteassertion.isDisplayed(), "checkoutcomplete verification");
    	
    }

  

}
