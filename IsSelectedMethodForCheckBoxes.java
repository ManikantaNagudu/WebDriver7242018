package CheckBoxes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IsSelectedMethodForCheckBoxes {

	
	
	WebDriver d;
	@Test
	public void testlogin() throws Exception
	{
	
		d.get("http://www.ironspider.ca/forms/checkradio.htm");
		// Store all the elements of the same category in the list of WebLements.
		List<WebElement> list = d.findElements(By.xpath(".//*[@id='Content']/div[1]/blockquote[1]/form/input[1]"));
        Thread.sleep(3000);
		// Create a boolean variable to store true/false.
	    Boolean is_selected = list.get(0).isSelected();
        Thread.sleep(3000);
		// If 'is_selected' is true that means the first radio button is
		// selected.
		if (is_selected == true) {
			Thread.sleep(3000);
		// If the first radio button is selected by default then,
		// select the second radio button.
		list.get(1).click();
		Thread.sleep(3000);
		}
		else 
		{

		// If the first radio button is not selected then, click the first
		// radio button.
		list.get(0).click();
		Thread.sleep(3000);
	}
	
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
