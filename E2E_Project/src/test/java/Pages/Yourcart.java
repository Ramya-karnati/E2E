package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Yourcart {
	WebDriver dr;
	
	
	public Yourcart(WebDriver driver)
	{
		dr=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using="checkout")
	WebElement checkout;
	@FindBy(how=How.CLASS_NAME,using="title")
	WebElement checoutyouinformationasserion;
	
	public void checkout()
	{
		checkout.click();
		Assert.assertTrue(checoutyouinformationasserion.isDisplayed(), "checkout your infromation verification");
	}
			
}
