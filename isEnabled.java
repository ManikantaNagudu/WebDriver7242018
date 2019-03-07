package Manee;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class isEnabled {
	WebDriver d;
	@Test
	public void testlogin() throws Exception
	{
	
		d.get("https://www.facebook.com/");
		
		WebElement firstname=d.findElement(By.id("u_0_g"));
		if(!firstname.isEnabled())
		{
			System.out.println("Firstname is not enabled");
		
		}
		else
		{
			System.out.println("Firstname is enabled");
		
		}
	
		WebElement Surname=d.findElement(By.id("u_0_i"));
	
		if(!Surname.isEnabled())
		{
			System.out.println("Surname is not enabled");
		
		}
		else
		{
			System.out.println("Surname is enabled");
		
		}
		
	//Method2
	//boolean fname = d.findElement(By.id("u_0_g")).isEnabled();
	//System.out.print(fname);
	
	
	
	}

	@BeforeMethod
	public void setUp()
	{
		//WebDriver d =new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Lib\\chromedriver.exe");
		d=new ChromeDriver();
		//System.setProperty("webdriver.ie.driver", "F:\\Selenium_Scripts_Nov15\\Lib\\IEDriverServer.exe");
     	//	d=new InternetExplorerDriver();
		//Maximize window
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	}
	@AfterMethod
	public void tearDown()
	{
		//Close window
		d.quit();
	}
}
