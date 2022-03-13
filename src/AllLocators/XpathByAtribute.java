package AllLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAtribute {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Desktop\\chromedriver file\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
	  driver.navigate().to("https://www.facebook.com");
//	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("suvam");
//	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("a");
//	  driver.findElement(By.xpath("//button[@value='1']")).click();
driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();

	}

}
