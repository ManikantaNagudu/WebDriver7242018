package MouseHover;

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

public class MouseHover1 {

	
	 WebDriver d;
	    @Test
		public void Test1() throws Exception
		{
		d.get("https://onextrapixel.com/mouse-over-effects-web-design-trend-with-fresh-examples/");
		Thread.sleep(3000);
		WebElement el=d.findElement(By.xpath(".//*[@id='menu-item-38259']/a"));
		Thread.sleep(3000);
		Actions act=new Actions(d);
		Thread.sleep(3000);
		act.moveToElement(el).build().perform();
		
		//Print list count
		List<WebElement> lis1=d.findElements(By.xpath("//ul[@class='sub-menu']//li"));
		Thread.sleep(3000);
		System.out.println("List size = "+ lis1.size()); 
		
		//Print List 
		//Method1
	    for (int i = 0; i<lis1.size(); i++) 
		{
	    System.out.println(lis1.get(i).getText());
		}
	    
	    Thread.sleep(3000);
		d.findElement(By.linkText("Inspiration")).click();
		Thread.sleep(3000);
		
		//Method2
		/*int totalcount=lis1.size();
		for(int i=0; i<totalcount;i++)	
		{
		WebElement element=lis1.get(i);
		String text=element.getAttribute("innerHTML");
		System.out.println("Links name is "+text);
		if(text.equalsIgnoreCase("Inspiration"))
		{
		element.click();
		}}*/
		
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
