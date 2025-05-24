package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Checkout_Your_Information {
	WebDriver dr;
	
	public Checkout_Your_Information(WebDriver driver)
	{
		dr=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using="first-name")
	WebElement firstname;
	@FindBy(how=How.ID,using="last-name")
	WebElement lastname;
	@FindBy(how=How.ID,using="postal-code")
	WebElement postalcode;
	@FindBy(how=How.ID,using="continue")
	WebElement contiue;
	@FindBy(how=How.CLASS_NAME,using="title")
	WebElement checkoutoverviewasserion;
	public void fillingdetails()
	{
		firstname.sendKeys("ramya");
		lastname.sendKeys("karnati");
		postalcode.sendKeys("521175");
		contiue.click();
		Assert.assertTrue(checkoutoverviewasserion.isDisplayed(), "checkout overview verification ");
	}
}
