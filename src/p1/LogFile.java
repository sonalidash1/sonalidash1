package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogFile {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.logfile", "./LogFile/chromelogfile.txt");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Desktop\\chromedriver file\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	  driver.navigate().to("https://www.facebook.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.name("login")).click();
	  WebElement dunna= driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]"));
	  String sonali = dunna.getText();
	  if(sonali.equalsIgnoreCase("The email address or mobile number you entered isn't connected to an account. Find your account and log in."))
	  {
		  System.out.println("text is matching");
	  }
	  
	  else
		  {
		  System.out.println("text is not matching");
		  }
	}

	}


