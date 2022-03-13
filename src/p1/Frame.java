package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Frame {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Desktop\\chromedriver file\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
	  driver.navigate().to("https://www.irctc.co.in/nget/train-search");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button")).click();
	  driver.findElement(By.linkText("ASK DISHA")).click();
	  Thread.sleep(10000);
	 WebElement duna =  driver.findElement(By.id("corover-disha-icon"));
	 duna.click();
//	 JavascriptExecutor sonai= (JavascriptExecutor)(driver);
//	 sonai.executeScript("arguments[0].click()",duna);
	 
	  driver.switchTo().frame("corover-chat-frame");
	//  driver.findElement(By.xpath("//*[@id=\"corover-chatbox\"]"));
	  
	  driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("train to dunna");
	  driver.findElement(By.xpath("//*[@id=\"ask\"]/i")).click();
	}

}
