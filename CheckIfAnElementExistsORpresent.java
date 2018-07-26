package Snippets;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckIfAnElementExistsORpresent {
	WebDriver d;
	@Test
		public void frame() throws Exception
		{
			
		d.get("https://www.linkedin.com/uas/login");
		Thread.sleep(3000);
		//Method1
		/*if(d.findElements(By.xpath(".//*[@id='btn-primary']")).size() != 0){
			System.out.println("Element is Present");
			}else{
			System.out.println("Element is Absent");
			}*/
		
		//Method2
		/*WebElement myLink = d.findElement(By.xpath(".//*[@id='btn-primary']"));
		if (myLink.isDisplayed())
		{
		   myLink.click();
		}*/
		
		//Check Visibility
		
		/*if( d.findElement(By.xpath(".//*[@id='btn-primay']")).isDisplayed()){
			System.out.println("Element is Visible");
			}else{
			System.out.println("Element is InVisible");
			}*/
		//Text is present
		
	      if(d.getPageSource().contains("Sign in"))
	      {
	    	  Thread.sleep(3000);
	      System.out.println("Text is present");
	      }else{
		  System.out.println("Text is absent");
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
