package WH;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class windows {
	WebDriver d;
	@Test
	public void testlogin() throws Exception
	{
	
		d.get("http://www.ironspider.ca/forms/checkradio.htm");
		//d.get("https://www.google.co.in/preferences?hl=en#languages");
		//Metho1
		/*List<WebElement> elements=d.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(elements.size());
		//System.out.println(Integer.toString(elements.size()));
		Thread.sleep(6000);
		for(WebElement el:elements)
		{
			el.click();
		}*/
		Thread.sleep(6000);
		//Method2
		/*List<WebElement> ele = d.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(ele.size());
		for (int i = 0; i <= ele.size(); i++) {
		ele.get(i).click();
		}*/
		
		//Method3
		//
	    List<WebElement> elements=d.findElements(By.xpath("//input[@type='checkbox']"));
		//System.out.println(elements.size());
		//System.out.println(Integer.toString(elements.size()));
		System.out.println("Total Number of Check box count is : " + elements.size() );
		Thread.sleep(3000);
		elements.get(0).click();
		Thread.sleep(6000);
		elements.get(5).click();
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
