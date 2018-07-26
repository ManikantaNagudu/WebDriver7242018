package WebTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTable {
	WebDriver d;
	@Test
	public void BackOrderScript() throws Exception
	{
		
		 d.get("https://www.w3schools.com/sql/sql_where.asp");
		 //Locate Table
		 WebElement table = d.findElement(By.xpath(".//*[@id='main']/div[5]/table"));
	         //To locate column of table 
		 List <WebElement> rows = d.findElements(By.xpath (".//*[@id='main']/div[5]/table/tbody/tr"));
		 System.out.println("Total No of Rows are : " + rows.size()); 
		 for(int i=0; i<=rows.size(); i++)
		 {
		 System.out.println(rows.get(i).getText()); 
		 }
		 }
		 
	@BeforeMethod
	public void setUp()
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Lib\\chromedriver.exe");
		d=new ChromeDriver();
		//System.setProperty("webdriver.ie.driver", "D:\\Selenium\\Lib\\IEDriverServer.exe");
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
