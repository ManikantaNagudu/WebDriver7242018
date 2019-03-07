package Manee;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EnterTextWithoutSendkeys {

	WebDriver d;
	@Test
	public void testdropdown() throws Exception
	{
	
	d.get("https://in.linkedin.com/");
	//Method1
	/*WebElement cssValue= d.findElement(By.xpath(".//*[@id='login-email']"));
	JavascriptExecutor jse = (JavascriptExecutor) d;
	jse.executeScript("document.getElementById('login-email').value='manee'");
    Thread.sleep(3000);*/
    
    //Method2
    JavascriptExecutor js=(JavascriptExecutor)d;
    js.executeScript("document.getElementById('login-email').value='nagudu'");
    Thread.sleep(3000);
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
