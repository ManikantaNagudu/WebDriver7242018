package Tabs;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenanewtabinSelenium1 {
	WebDriver d;
	@Test
	public void test() throws Exception
	{
		
		d.get("https://www.linkedin.com/uas/login");

		//Use robot class to press Ctrl+t keys    		
		Robot robot = new Robot();                          
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_T); 
		robot.keyRelease(KeyEvent.VK_CONTROL); 
		robot.keyRelease(KeyEvent.VK_T);

		//Switch focus to new tab
		ArrayList<String> tabs = new ArrayList<String> (d.getWindowHandles());
		d.switchTo().window(tabs.get(1));

		//Launch URL in the new tab
		d.get("http://google.com");
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
