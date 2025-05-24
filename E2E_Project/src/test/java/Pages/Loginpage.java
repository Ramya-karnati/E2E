package Pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.Utilities;

public class Loginpage {

	WebDriver dr;
	Utilities utilities;

	

//em ardam katleokkk will try next
	public Loginpage(WebDriver driver) throws IOException
	{
		dr=driver;
	    utilities = new Utilities(dr);
	    PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="user-name")
	WebElement username;
	@FindBy(how=How.ID,using="password")
	WebElement password;
	@FindBy(how=How.ID,using="login-button")
			WebElement login;
	@FindBy(how=How.XPATH,using="//span[text()='Products']")
	WebElement loginpageassertion;
	@FindBy(how=How.CLASS_NAME,using="title")
	WebElement productspagetitle;
	public void Standad_User_Login() throws IOException
	{

		username.sendKeys(utilities.GetProperits("Username"));
		password.sendKeys("secret_sauce");
		login.click();
		Assert.assertTrue(productspagetitle.isDisplayed(),"products page verification");
		
      	
		}
	
}
