package Scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IFrame {
	
	WebDriver d;
	@Test
	public void testiframe() throws Throwable
	{
	
	d.get("http://www.dezlearn.com/testingpage/");
	/*List<WebElement> el=d.findElements(By.tagName("iframe"));
	System.out.println("No of frames are "+el.size());
	Thread.sleep(3000);*/
	//Method1
	d.switchTo().frame("contact-iframe");
	Thread.sleep(3000);
	
	d.findElement(By.id("ninja_forms_field_11")).sendKeys("manee");

	Thread.sleep(3000);
	d.switchTo().parentFrame();
	Thread.sleep(3000);
	d.switchTo().frame("do-it-iframe");
	d.findElement(By.className("search-field")).sendKeys("Test");
	Thread.sleep(3000);
	d.findElement(By.className("search-submit")).click();
	Thread.sleep(3000);
	
	/*//Method2
	WebElement frame1= d.findElement(By.id("contact-iframe"));
	Thread.sleep(3000);
	d.switchTo().frame(frame1);
	Thread.sleep(3000);*/

	
	
		
	}
	@BeforeMethod
	public void setUp()
	{
	System .setProperty("webdriver.chrome.driver","F:\\Project2018\\Lib\\chromedriver.exe");
	d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);	
		
	}
	@AfterMethod
	public void tearDown()
	{
				d.quit();	
	}
	
	

}
