package AllLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Desktop\\chromedriver file\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();  
		  driver.navigate().to("https://www.facebook.com/");
//		  driver.findElement(By.id("email")).sendKeys("kursehbhai");
//		  driver.findElement(By.id("pass")).sendKeys("tyh");
//		  driver.findElement(By.name("login")).click();
//		  driver.findElement(By.linkText("Forgotten password?")).click();
//		  driver.findElement(By.partialLinkText("Forgotten")).click(); 
		  driver.findElement(By.cssSelector("input[type='text']")).sendKeys("sonali");
		  

	}

}
