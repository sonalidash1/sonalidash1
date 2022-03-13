package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Desktop\\chromedriver file\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
	  driver.navigate().to("https://www.google.com");
	  Thread.sleep(2000);
	  System.out.println(driver.getTitle());
	  String sonali= driver.getTitle();
	  System.out.println(sonali);
	  
	  

	}

}
