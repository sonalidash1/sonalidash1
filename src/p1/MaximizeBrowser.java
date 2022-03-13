package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowser {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Desktop\\chromedriver file\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
	  driver.navigate().to("https://demo.actitime.com/login.do");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  driver.manage().window().minimize();
	}

}
