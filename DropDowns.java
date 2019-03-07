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

public class DropDowns {

	WebDriver d;
	@Test
	public void testdropdown() throws Exception
	{
	
		
		d.get("http://hdpopcorns.com/");
		//Get all the data in the Drop down
		WebElement element = d.findElement(By.name("ofcategory"));
		List<WebElement> vs = element.findElements(By.tagName("Option"));
		for(WebElement v:vs) {
		System.out.println("Gener : "+v.getText());}
		
		
		
		
	/*	d.get("https://book2.spicejet.com/");
		Thread.sleep(2000);
		WebElement button =d.findElement(By.cssSelector(".flight_status"));
		button.click();
		//Get all the data in the Drop down
		WebElement element = d.findElement(By.name("originStation"));
		List<WebElement> values = element.findElements(By.tagName("Option"));
		for(WebElement value:values) {
		System.out.println("city : "+value.getText());}*/
		

    
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
