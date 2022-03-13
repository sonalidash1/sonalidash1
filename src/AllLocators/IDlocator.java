package AllLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDlocator {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Desktop\\chromedriver file\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
	  driver.navigate().to("https://demo.actitime.com/login.do");
//	  driver.findElement(By.id("username")).sendKeys("admin");
//	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  WebElement sonali =driver.findElement(By.id("username"));
	  sonali.sendKeys("admin");
	  WebElement sona =driver.findElement(By.name("pwd"));
	  sona.sendKeys("manager");
	  driver.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
	}

}
