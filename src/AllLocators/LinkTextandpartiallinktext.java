package AllLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextandpartiallinktext {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Desktop\\chromedriver file\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
//	  driver.navigate().to("https://demo.actitime.com/login.do");
	  driver.navigate().to("https://www.facebook.com");
//	  driver.findElement(By.partialLinkText("Forgotten")).click();
//	  driver.findElement(By.cssSelector("input[type='text']")).sendKeys("ajk");        - cssselector
	  

	}

}
