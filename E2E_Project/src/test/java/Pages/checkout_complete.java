package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class checkout_complete {
     WebDriver dr;
     
     public  checkout_complete(WebDriver driver)
     {
    	 dr=driver;
    	 PageFactory.initElements(driver,this);
     }
     
     @FindBy(how=How.XPATH,using="//button[text()='Back Home']")
     WebElement Backhome;
     @FindBy(how=How.CLASS_NAME,using="title")
 	WebElement productspagetitle;
     
     public void Backhome()

{
    	 Backhome.click();
    	 Assert.assertTrue(productspagetitle.isDisplayed(),"products page verification");
    	 }
}


