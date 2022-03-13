package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Desktop\\chromedriver file\\chromedriver.exe");
		ChromeOptions hy=new ChromeOptions();
		hy.addArguments("--disable-notifications");
		  WebDriver driver = new ChromeDriver();
	  driver.navigate().to("");

	}

}
