package p1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSetSizeofBrowser {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Desktop\\chromedriver file\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
//		  System.out.println(driver.manage().window().getSize());
//		  Dimension duna=new Dimension(600,300);
//		  driver.manage().window().setSize(duna);
//           driver.navigate().to("https://demo.actitime.com/login.do");
		  System.out.println(driver.manage().window().getPosition());
		  Point duna=new Point(30,150);
		  driver.manage().window().setPosition(duna); 

	}

}
