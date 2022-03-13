package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Desktop\\chromedriver file\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
	  driver.navigate().to("https://demo.actitime.com/login.do");
	//  driver.navigate().to("https://www.facebook.com");
	//  System.out.println(driver.getCurrentUrl());
//driver.navigate().refresh();
//driver.navigate().back();
//driver.navigate().forward();
//System.out.println(driver.getPageSource());
	}

}
