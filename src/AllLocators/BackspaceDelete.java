package AllLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackspaceDelete {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Desktop\\chromedriver file\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
//	  driver.navigate().to("https://demo.actitime.com/login.do");
	  driver.navigate().to("https://www.facebook.com");
	  WebElement sonali =driver.findElement(By.name("email"));
	  sonali.sendKeys("qspiders");
	  Thread.sleep(2000);
	  for(i=5;i>0;i--)
	  {
		  if(i==2)
		  
	  }
//	  sonali.sendKeys(Keys.CONTROL,"a");
	  sonali.sendKeys(Keys.ARROW_LEFT);
//	  sonali.sendKeys(Keys.DELETE);
	  sonali.sendKeys("sonali");
	}

}
