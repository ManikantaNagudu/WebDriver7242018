package Tabs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenanewtabinSelenium2 {
	WebDriver d;
	@Test
	public void test() throws Exception
	{
		
		//d.get("http://google.com");
		String URL="http://www.google.com";
		d.get(URL);
		System.out.println("Page Title is : "+d.getTitle());
		WebElement link = d.findElement(By.linkText("Gmail"));
		Actions newTab = new Actions(d); 
		newTab.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();
        Thread.sleep(3000);
	}

	@BeforeMethod
	public void setUp()
	{
	System .setProperty("webdriver.chrome.driver","F:\\SeleniumRush2018\\Lib\\chromedriver.exe");
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
