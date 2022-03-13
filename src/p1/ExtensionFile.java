package p1;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExtensionFile {

	public static void main(String[] args)
	{
		ChromeOptions dunna= new ChromeOptions();
		dunna.addExtensions(new File("C:\\Users\\SONALI\\Documents\\extension\\extension_3_1_0_0.crx"));
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Desktop\\chromedriver file\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
//	  driver.navigate().to("https://www.google.com/");

	}

}
