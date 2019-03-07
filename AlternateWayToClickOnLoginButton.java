package Manee;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlternateWayToClickOnLoginButton {
	WebDriver d;
	@Test
	public void testlogin() throws Exception
	{
	
		d.get("https://www.linkedin.com/uas/login");
		d.findElement(By.id("session_key-login")).sendKeys("xxxxxxxxxxxxxxxxx");
		d.findElement(By.id("session_password-login")).sendKeys("xxxxxxxxxxxxxxx");
		//d.findElement(By.id("btn-primary")).sendKeys("submit");
		WebElement el=d.findElement(By.xpath(".//*[@id='btn-primary']"));
		el.submit();
		Thread.sleep(6000);
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
