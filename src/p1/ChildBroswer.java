package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildBroswer {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Desktop\\chromedriver file\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
	  driver.navigate().to("http://testingpool.com/wp-content/uploads/2015/08/DemoApplication.html");
	  Thread.sleep(2000);
      driver.findElement(By.linkText("Learn Selenium!!")).click();
      driver.findElement(By.linkText("Learn UFT!!")).click();
      driver.findElement(By.linkText("Learn ETL Testing!!")).click();
     Thread.sleep(2000);
      Set<String> sonali= driver.getWindowHandles();
      ArrayList<String> dunna=new ArrayList(sonali);
      int size=dunna.size();
      System.out.println(size);
      Thread.sleep(8000);
      for (int i =size-1; i>=0 ; i--)
      {
    	  driver.switchTo().window(dunna.get(i));
    	  System.out.println(driver.getTitle());
    	  
      }
//      driver.switchTo().window(dunna.get(0));
//      String chuinmuin = driver.getTitle();
//      System.out.println(chuinmuin);
    		  
   //   dunna.get(0);
     // driver.getTitle();
  //    driver.switchTo().window(dunna.get(1));
   //   System.out.println(driver.getTitle());
      
//      driver.switchTo().window(dunna.get(1));
//      Thread.sleep(2000);
//WebElement dounaa=driver.findElement(By.linkText("ETL Testing"));
////    dounaa.sendKeys(Keys.LEFT_CONTROL);
//Actions hui = new Actions(driver);
//hui.sendKeys(Keys.LEFT_CONTROL).click(dounaa).perform();
	}

}
