package p1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBootstrap {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Desktop\\chromedriver file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/SONALI/Downloads/BootstrapDropDown.html");
		driver.findElement(By.xpath("/html/body/div/div/button")).click();
		List<WebElement> sonali= driver.findElements(By.xpath("//ul//a"));
		int size=sonali.size();
		for(int i= 0; i<size ; i++)
		{
			if (sonali.get(i).getText().equalsIgnoreCase("myntra"))
			{
				sonali.get(i).click();
			}
		}

	}

}
