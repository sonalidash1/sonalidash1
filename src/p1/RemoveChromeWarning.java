package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class RemoveChromeWarning {

	public static void main(String[] args)
	{
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Desktop\\chromedriver file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://en-gb.facebook.com/");
	}

}
