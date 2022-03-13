package p1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Kachabadam {

	public static void main(String[] args) throws AWTException, InterruptedException
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Desktop\\chromedriver file\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
	  driver.navigate().to("https://demo.actitime.com/login.do");
	//	  driver.navigate().to("http://www.google.com");
		  Thread.sleep(2000);
		  Actions act = new Actions(driver);
		  WebElement sonali = driver.findElement(By.xpath("//body[@jsmodel='hspDDf']"));
		  Thread.sleep(1000);
		  act.sendKeys(Keys.LEFT_CONTROL).click(sonali).perform();
	}
}



