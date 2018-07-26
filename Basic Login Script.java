package Snippets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class newtest {
	WebDriver d;
	@Test
		public void frame() throws Exception
		{
			
		d.get("https://www.linkedin.com/uas/login");
		Thread.sleep(3000);
		d.findElement(By.id("session_key-login")).sendKeys("sdcfsdf@gmail.com");
		Thread.sleep(3000);
		d.findElement(By.id("session_password-login")).sendKeys("sdfsdfsdf");
		Thread.sleep(3000);
		d.findElement(By.id("btn-primary")).click();
		Thread.sleep(3000);
		}
		
		@BeforeMethod
		public void setUp()
		{
			//System.setProperty("webdriver.gecko.driver", "D:\\SeleniumTest\\Lib\\geckodriver");
			//WebDriver d= new FirefoxDriver();
			
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Lib\\chromedriver.exe");
			d=new ChromeDriver();
			//System.setProperty("webdriver.ie.driver", "D:\\SeleniumTest\\Lib\\IEDriverServer.exe");
	     	//d=new InternetExplorerDriver();
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
