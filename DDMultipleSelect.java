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

public class DDMultipleSelect {
	WebDriver d;
	@Test
	public void DDMS() throws InterruptedException
	{

		d.get("http://toolsqa.com/automation-practice-form/");	
		//Select 'Selenium Commands' Multiple select box ( Use Name locator to identify the element)
		Select s =new Select (d.findElement(By.xpath(".//*[@id='selenium_commands']")));
		s.selectByIndex(0); 
		Thread.sleep(4000);
		s.deselectByIndex(0);
		Thread.sleep(2000);
		//Select option 'Navigation Commands'  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
		s.selectByVisibleText("Navigation Commands");
		Thread.sleep(3000);
		s.deselectByVisibleText("Navigation Commands");
		Thread.sleep(2000);
		
		//Method 1
		/*//Print and select all the options for the selected Multiple selection list.
		List<WebElement> oSize = s.getOptions();
		int iListSize = oSize.size();
		
		// Setting up the loop to print all the options
		for(int i =0; i < iListSize ; i++){
			
		// Storing the value of the option
		String sValue = s.getOptions().get(i).getText();
		
        // Printing the stored value
		System.out.println(sValue);
		
        // Selecting all the elements one by one
		s.selectByIndex(i);
		Thread.sleep(2000);
		}
		*/
		
		//Method 2
		
		//Print and select all the options for the selected Multiple selection list.
		List<WebElement> list=s.getOptions();
	    for(int i=0;i<list.size();i++)          
	    {
	    System.out.println(list.get(i).getText());
	    }
	    Thread.sleep(6000);
	    // Selecting all the elements one by one
		int i  = 0;
		int i1 = 1;
		int i2 = 2;
		int i3 = 3;
		int i4 = 4;
		s.selectByIndex(i);
		Thread.sleep(6000);
		s.selectByIndex(i1);
		Thread.sleep(6000);
		s.selectByIndex(i2);
		Thread.sleep(6000);
		s.selectByIndex(i3);
		Thread.sleep(6000);
		s.selectByIndex(i4);
		Thread.sleep(6000);
		// De select all
		s.deselectAll();
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
