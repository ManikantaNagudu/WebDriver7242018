package Scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Myntra {
	WebDriver d;
	@Test
	public void test() throws Exception
	{
		
		d.get("https://www.myntra.com/");
		WebElement el=d.findElement(By.xpath(".//*[@id='desktop-header-cnt']/div[2]/div[2]/div/div[1]"));
		Actions act=new Actions(d);
		act.moveToElement(el).perform();
		List<WebElement> lis=d.findElements(By.xpath("//div[@class='desktop-getUserInLinks desktop-getInLinks']//a"));
		System.out.println("List size = "+ lis.size()); 
		
		//Print List 
		//Method1
	    for (int i = 0; i<lis.size(); i++) 
		{
	    System.out.println(lis.get(i).getText());
		}
	    
	    Thread.sleep(3000);
		//d.findElement(By.linkText("login")).click();
		d.findElement(By.xpath("//a[@href='/login?referer=https://www.myntra.com/']")).click();
		Thread.sleep(3000);
		
		
		/*//Method2
		int totalcount=lis.size();
		for(int i=0; i<totalcount;i++)	
		{
		WebElement element=lis.get(i);
		String text=element.getAttribute("innerHTML");
		System.out.println("Links name is "+text);
		if(text.equalsIgnoreCase("login"))
		{	
		element.click();
		Thread.sleep(3000);
		}}*/
		
		Thread.sleep(3000);	
		d.findElement(By.xpath(".//*[@id='mountRoot']/div/div/div/form/fieldset[1]/div[1]/input")).sendKeys("xxxxxxxxxxx");
		Thread.sleep(3000);	
		d.findElement(By.xpath(".//*[@id='mountRoot']/div/div/div/form/fieldset[1]/div[2]/input")).sendKeys("xxxxxxxxxxx");
		Thread.sleep(3000);	
		d.findElement(By.xpath(".//*[@id='mountRoot']/div/div/div/form/fieldset[2]/button")).click();
		Thread.sleep(6000);	
		WebElement el1=d.findElement(By.xpath(".//*[@id='desktop-header-cnt']/div[2]/nav/div/div[1]"));
		Actions act1=new Actions(d);
		act.moveToElement(el1).perform();
		Thread.sleep(6000);	
		List<WebElement> lis1=d.findElements(By.xpath("//div[@class='desktop-paneContent']//ul//li"));
		Thread.sleep(6000);
		System.out.println("List size = "+ lis1.size()); 
		//Method1
	    for (int i = 0; i<lis1.size(); i++) 
		{
	    System.out.println(lis1.get(i).getText());
		}
	    
	    Thread.sleep(3000);
		d.findElement(By.xpath("//a[contains(text(),'Sports Shoes')]")).click();
		Thread.sleep(3000);
	    
		
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
