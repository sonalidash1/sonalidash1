package p1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	
		public static void main(String[] args) throws InterruptedException, AWTException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Desktop\\chromedriver file\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://smallpdf.com/pdf-to-word");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[2]/button/div/span")).click();
Thread.sleep(2000);
		  WebElement dunna = driver.findElement(By.xpath("//*[@id=\"__cond-30\"]/div/div/div/div/div/div/form/label/div/div[2]/div/button[1]/span"));
		  dunna.click();
		  StringSelection File = new StringSelection("\"C:\\Users\\SONALI\\Downloads\\Selenium Online.pdf\"");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(File,null) ;
		 Robot thu = new Robot();
		
	 thu.keyPress(KeyEvent.VK_CONTROL);
//		 Thread.sleep(2000);
		 thu.keyPress(KeyEvent.VK_V);
//		 Thread.sleep(2000);
		 thu.keyPress(KeyEvent.VK_TAB);
		 thu.keyPress(KeyEvent.VK_ENTER);
		 
		  
	}

}
