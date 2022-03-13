package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JaaSeecutor {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Desktop\\chromedriver file\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https:///demo.actitime.com/login.do");
		  Thread.sleep(2000);
		  driver.findElement(By.name("username"));
		  driver.findElement(By.name("pwd"));
		  WebElement tcs= driver.findElement(By.xpath("//div[.='Login ']"));
		  JavascriptExecutor dunna = (JavascriptExecutor)driver;
		  dunna.executeScript("arguments[0].click()",tcs);
	}
}
