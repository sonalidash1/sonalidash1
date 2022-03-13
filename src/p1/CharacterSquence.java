package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CharacterSquence {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Desktop\\chromedriver file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		  driver.navigate().to("http://testingpool.com/wp-content/uploads/2015/08/DemoApplication.html");
		  WebElement sona = driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
		  WebElement dunna = driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
		  StringBuffer raobabu = new StringBuffer();
		   raobabu.append("dun");
		   raobabu.append("unna");
		   raobabu.append("jaga");
		   raobabu.append("dish");
		   sona.sendKeys(raobabu);
		   StringBuilder sonababu = new StringBuilder();
		   sonababu.append("a");
		   sonababu.append("b");
		   sonababu.append("c");
		   dunna.sendKeys(sonababu);
	}	
	}


