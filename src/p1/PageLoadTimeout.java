package p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeout {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Desktop\\chromedriver file\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		 
	       driver.navigate().to("https://demo.actitime.com/login.do");	
	       driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
	}

}
