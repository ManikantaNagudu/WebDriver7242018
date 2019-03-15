package Snippets;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPrioritizingandSequencing {
	WebDriver d;
		
		    @Test(priority = 1, enabled = false)
		    public void One() 
		    {
		    System.out.println("This is the Test Case number One");
		    }
		    
		    @Test(priority = 2)
		    public void Two() 
		    {
		    System.out.println("This is the Test Case number Two");
		    }
		    
	    	@Test(priority = 3, invocationCount = 2)
			public void frame() throws Exception
			{
				
			d.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html?overview-tree.html");
		
			 // find all your iframes
			 List<WebElement>iframes = d.findElements(By.tagName("frame"));
			 // print your number of frames
			 System.out.println("Number of frames in a page :" + iframes.size());
			 Thread.sleep(3000);
			 for(WebElement el : iframes){
			 //Returns the Id of a frame.
			 System.out.println("Frame Id :" + el.getAttribute("id"));
			 //Returns the Name of a frame.
			 System.out.println("Frame name :" + el.getAttribute("name"));
			 
			 }}        
			     
		
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
