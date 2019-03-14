package HandlingIFRAMES;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class frametest2 {
	WebDriver d;
	@Test
		public void frame() throws Exception
		{
			
		d.get("http://demo.guru99.com/test/guru99home/");
	    Thread.sleep(3000);
		// find all your iframes
		List<WebElement>iframes1 = d.findElements(By.tagName("iframe"));
		// print your number of frames
		System.out.println("Number of frames in a page :" + iframes1.size());
		for(WebElement el : iframes1){
			 //Returns the Id of a frame.
			 System.out.println("Frame Id :" + el.getAttribute("id"));
			 //Returns the Name of a frame.
			 System.out.println("Frame name :" + el.getAttribute("name"));
			 }
		
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
