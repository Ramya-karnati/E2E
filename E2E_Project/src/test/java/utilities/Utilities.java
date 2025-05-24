package utilities;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Utilities {
	
	WebDriver dr;
	
	public Utilities(WebDriver driver) throws IOException
	{
		dr=driver;
		
	}
	
	public String GetProperits(String s) throws IOException
	{
		Properties p = new Properties();
		FileInputStream reader2 = new FileInputStream("Configfile.properties");
		p.load(reader2);
		return p.getProperty(s);
	}
	
	

}
