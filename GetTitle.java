package Manee;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetTitle {
	WebDriver d;
	@Test
	public void testgettitle() throws Exception
	{
		
		d.get("https://www.91mobiles.com/");
		
		/*//Get Page Title
		//Method-1
		System.out.println("title :"+d.getTitle());
		
		//Method-2
		String Actualtitle=d.getTitle();
		System.out.println("Title is" + Actualtitle);
		String Expectedtitle="Mobile Phones | Mobile Prices in India | Online Mobile Shopping | 91mobiles.com";
		assertEquals(Actualtitle, Expectedtitle);
		System.out.println("Test Completed");*/
		
		//Method-3
		Assert.assertEquals("Mobile Phones | Mobile Prices in India | Online Mobile Shopping | 91mobiles.com", d.getTitle());
		System.out.println("Test Completed");
		
		
		
		Thread.sleep(2000);
		
	}

	private void assertTrue(String string, boolean contains) {
		// TODO Auto-generated method stub
		
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
