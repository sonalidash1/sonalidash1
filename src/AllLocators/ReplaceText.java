package AllLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReplaceText {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Desktop\\chromedriver file\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
//	  driver.navigate().to("https://demo.actitime.com/login.do");
	  driver.navigate().to("https://www.facebook.com");
	  WebElement sonali =driver.findElement(By.name("email"));
	  sonali.sendKeys("suv");
	  Thread.sleep(2000);
	  sonali.clear();
	  sonali.sendKeys("punam");
	}

}
