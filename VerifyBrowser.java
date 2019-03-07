package CrossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyBrowser {
	WebDriver d;
	@Test
	@Parameters("browser")
	public void BrowserTest(String browserName)
	{
	
				
if(browserName.equalsIgnoreCase("Firefox"))
{
	d =new FirefoxDriver();   
}

else if(browserName.equalsIgnoreCase("Chrome"))
{
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Lib\\chromedriver.exe");
	d=new ChromeDriver();
}

else if(browserName.equalsIgnoreCase("IE"))
{
	System.setProperty("webdriver.ie.driver", "E:\\Selenium\\Lib\\IEDriverServer.exe");
 	d=new InternetExplorerDriver();
}	
	
     d.get("https://www.myntra.com/");
	//Maximize window
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
    d.quit();
    
}
	
}

