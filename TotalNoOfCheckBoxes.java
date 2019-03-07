package Manee;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TotalNoOfCheckBoxes {
WebDriver d;
@Test
public void checkboxes() throws InterruptedException
{
	d.get("http://www.ironspider.ca/forms/checkradio.htm");
	List <WebElement> checkboxes=d.findElements(By.xpath("//input[@type='checkbox']"));
	System.out.println("Total checkboxes"+checkboxes.size());
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