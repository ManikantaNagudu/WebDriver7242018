package AtPar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class CopyOfLogin {
public static  void main(String[] args) throws InterruptedException {
		
System.out.println("Hellow");
System. setProperty("webdriver.chrome.driver", "H:/Srikanth/eclipse/chrome/chromedriver.exe");
// Initialize browser.
WebDriver wd =new ChromeDriver();
wd.get("https://onextrapixel.com/");
wd.findElement(By.xpath("//*[@id='text-4']/div/div/p/a/img")).click();
String Parent_Window = wd.getWindowHandle();
// Switching from parent window to child window
for (String Child_Window : wd.getWindowHandles())
{
wd.switchTo().window(Parent_Window);
Thread.sleep(2000);
wd.findElement(By.xpath("//*[@id='text-4']/div/div/p/a/img")).click();
wd.switchTo().window(Child_Window);  
}
wd.switchTo().window(Parent_Window);  
        	
// Switching from parent window to child window
for (String Child_Window : wd.getWindowHandles())
{	 
String s = wd.switchTo().window(Child_Window).getTitle();
System.out.println(s);
if(s.equals("All the Templates You Can Download")){
wd.switchTo().window(Child_Window).close();
}
}
//  wd.close();
}
}
