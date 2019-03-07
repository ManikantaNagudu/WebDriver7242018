package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownList {

	
	WebDriver d;
	@Test
	public void totalNoofvalues() throws InterruptedException
	{

		d.get("http://toolsqa.com/automation-practice-form/");	
		
		Select el=new Select(d.findElement(By.xpath(".//*[@id='continents']")));
		List<WebElement> list=el.getOptions();
	    for(int i=0;i<list.size();i++)          
	    {
	    System.out.println(list.get(i).getText());
	    }
		
		/*WebElement element=d.findElement(By.xpath(".//*[@id='continents']"));
        Select select=new Select(element);
        List<WebElement> list=select.getOptions();
        for(int i=0;i<list.size();i++)          
        {
        System.out.println(list.get(i).getText());
        }*/
        
		
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

