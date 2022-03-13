package p1;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListSorting {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Desktop\\chromedriver file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testingpool.com/wp-content/uploads/2015/08/DemoApplication.html");
		Thread.sleep(4000);		
		WebElement dunna =driver.findElement(By.xpath("//select[@name='Week']"));
		Select sonali= new Select(dunna);
		List<WebElement> rao= sonali.getOptions();
//		List<WebElement> sona= new List<WebElement>();
		int x= rao.size();
//		ArrayList<List>
		for (int i=0; i<x ; i++)
		{
			System.out.println(rao.get(i).getText());
		}
		
//	Collections.sort(rao);
	}

}
