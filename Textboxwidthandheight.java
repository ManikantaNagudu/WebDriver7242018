package Scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Textboxwidthandheight {
	WebDriver d;
	@Test
	public void test() throws Exception
	{
		
		d.get("https://www.google.com/");
		//Method:1
		int width = d.findElement(By.xpath(".//*[@id='tsf']/div[2]/div/div[1]/div")).getSize().getWidth();
		System.out.println("width:"+width);
		int height = d.findElement(By.xpath(".//*[@id='tsf']/div[2]/div/div[1]/div")).getSize().getHeight();
		System.out.println("height:"+height);
		//Method:2
		Dimension values=d.findElement(By.xpath(".//*[@id='tsf']/div[2]/div/div[1]/div")).getSize();
		System.out.println("values:"+values);
		int width1=values.getWidth();
		System.out.println("width1:"+width1);
		int height1=values.getHeight();
		System.out.println("height1:"+height1);
				
		

		
		
	}

	@BeforeMethod
	public void setUp()
	{
	System .setProperty("webdriver.chrome.driver","F:\\SeleniumRush2018\\Lib\\chromedriver.exe");
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
