package p1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KhidkiWindow {

		public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Desktop\\chromedriver file\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.google.com");
		  Thread.sleep(2000);
		  
		  WebElement dunna= driver.findElement(By.linkText("Gmail"));
		  Actions sonali=new Actions(driver);
		  sonali.contextClick(dunna).perform();
		  Robot sunny=new Robot();
		  sunny.keyPress(KeyEvent.VK_DOWN);
		  sunny.keyPress(KeyEvent.VK_ENTER);
		  Set<String> tung= driver.getWindowHandles();
		  ArrayList<String> ting = new ArrayList(tung);
		  System.out.println(driver.getTitle());
		  driver.switchTo().window(ting.get (1));
		  System.out.println(driver.getTitle());
		  
	}
}
