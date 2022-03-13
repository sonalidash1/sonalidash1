package p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Desktop\\chromedriver file\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
//	  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		  driver.navigate().to("https://login.yahoo.com/?");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  WebElement dunna=driver.findElement(By.id("persistent"));
		  JavascriptExecutor sona= (JavascriptExecutor)driver;
		  sona.executeScript("arguments[0].click()",dunna);
		  WebElement suvam=  driver.findElement(By.name("signin"));
		  WebElement sonali= driver.findElement(By.xpath("//*[@id=\"login-username\"]"));
		  sona.executeScript("arguments[0].value='kachabadam'",sonali);
		  Thread.sleep(2000);
		  sona.executeScript("window.scrollBy(0,1000)");
		  Thread.sleep(2000);
		  sona.executeScript("window.scrollBy(0,1000)");
		  Thread.sleep(2000);
		  sona.executeScript("window.scrollBy(0,1000)");
		  Thread.sleep(2000);
		  sona.executeScript("window.scrollBy(0,1000)");
		  
		  
//		  sona.executeScript("argument[0].click()",suvam);
	}
	
}
