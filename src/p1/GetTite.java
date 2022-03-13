package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTite {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Desktop\\chromedriver file\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
	  driver.navigate().to("https://demo.actitime.com/login.do");
//	  driver.getTitle();
	 System.out.println(driver.getTitle());

	}

}
