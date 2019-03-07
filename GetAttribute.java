package Manee;

import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetAttribute {
	
	WebDriver d;
	@Test
	public void testgetattribute() throws Exception
	{
		
		d.get("https://www.91mobiles.com/");
		d.findElement(By.id("mobile")).getAttribute("more than 35,000");
		
		String Actualtitle=d.getTitle();
		System.out.println("Title is" + Actualtitle);
		String Expectedtitle="Mobile Phones | Mobile Prices in India | Online Mobile Shopping | 91mobiles.com";
		assertEquals(Actualtitle, Expectedtitle);
		System.out.println("Test Completed");
		Thread.sleep(2000);
	}

	@BeforeMethod
	public void setUp()
	{
	System .setProperty("webdriver.chrome.driver","E:\\Selenium\\Lib\\chromedriver.exe");
	d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);	
		
	}
	@AfterMethod
	public void tearDown()
	{
				d.quit();
		
		
	}
	
	
}
