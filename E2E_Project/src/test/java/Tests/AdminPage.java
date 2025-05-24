package Tests;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Pages.Checkout_Your_Information;
import Pages.Loginpage;
import Pages.Products;
import Pages.Yourcart;
import Pages.checkout_complete;
import Pages.checkout_overview;

public class AdminPage {

	WebDriver driver;
	Loginpage loginpage;
	Products products;
	Yourcart yourcart;
	checkout_overview cehckeoutoverview;
	Checkout_Your_Information checkoutyourinformation;
	checkout_complete checkoutcomplete;
	ExtentReports extentreports;
	ExtentSparkReporter extentsparkreporter;
	@BeforeClass
	public void Start() throws IOException
	
	{
		driver= new EdgeDriver();
		loginpage= new Loginpage(driver);
		products= new Products(driver);
		yourcart = new Yourcart(driver);
		checkoutyourinformation = new Checkout_Your_Information(driver);
		cehckeoutoverview = new checkout_overview(driver);
		checkoutcomplete = new checkout_complete(driver);
		driver.navigate().to("https://www.saucedemo.com");
		driver.manage().window().maximize();
		extentreports = new ExtentReports();
		extentsparkreporter = new ExtentSparkReporter("C:\\Users\\Dell\\eclipse-workspace\\E2E_Project\\Reports\\index.html");
		extentreports.attachReporter(extentsparkreporter);
		
	}
	@AfterClass
	public void teardown()
	{
		extentreports.flush();
	}
	
	

	
	public void testcasepass(String description, String title)
	{
		ExtentTest test =extentreports.createTest(title);
		test.pass(description);
		
	}
	public void testcasefail(String description, String title)

	{
		ExtentTest test =extentreports.createTest(title);
		test.fail(description);
		
	}
	@Test

	public void Login() throws IOException
	{
		try {
			
		loginpage.Standad_User_Login();
		testcasepass("Login successful","Login");
		}
		catch(Exception e)
		{
			System.out.println(e);
			testcasefail("Login failed","Login");
			
			
		}
	}
	@Test
	public void AddCart() throws IOException
	{
		loginpage.Standad_User_Login();
		products.Add_To_Cart();
		products.shoppingcartclick();
	}
	@Test
	 public void checkout() throws IOException
	 {
		 loginpage.Standad_User_Login();
		products.Add_To_Cart();
		products.shoppingcartclick();
		yourcart.checkout();
		 
	 }
	@Test
	public void filldetails() throws IOException
	{
		 loginpage.Standad_User_Login();
			products.Add_To_Cart();
			products.shoppingcartclick();
			yourcart.checkout();
			checkoutyourinformation.fillingdetails();
		
	}
	@Test
	public void finish() throws IOException
	{
		 loginpage.Standad_User_Login();
			products.Add_To_Cart();
			products.shoppingcartclick();
			yourcart.checkout();
			checkoutyourinformation.fillingdetails();
			cehckeoutoverview.finish();
			
	}
    @Test(description = "End-End scenario")
	public void returntohome() throws IOException
	{
		
			 loginpage.Standad_User_Login();
				products.Add_To_Cart();
				products.shoppingcartclick();
				yourcart.checkout();
				checkoutyourinformation.fillingdetails();
				cehckeoutoverview.finish();
				checkoutcomplete.Backhome();
		        
	    
	}
	
    }
 
