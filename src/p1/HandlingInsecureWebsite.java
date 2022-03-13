package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingInsecureWebsite {

	public static void main(String[] args)
	{
ChromeOptions dunna= new ChromeOptions ();
//dunna.setAcceptInsecureCerts(true);
//DesiredCapabilities dp= DesiredCapabilities.();

System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Desktop\\chromedriver file\\chromedriver.exe");
    WebDriver driver = new ChromeDriver(dunna);
  driver.navigate().to("https://entaxy.io/");
	}

}
