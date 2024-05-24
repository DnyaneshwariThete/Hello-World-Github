import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class AssignmentWebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver = new ChromeDriver();
  System.setProperty("webdriver.chrome.driver", "C://Eclipse//chrome-win64.exe");
  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
  WebElement Table = driver.findElement(By.id("product"));
  System.out.println("Number of rows in table products is "+ Table.findElements(By.tagName("tr")).size());
  System.out.println("Number of columns in table products is "+ Table.findElements(By.tagName("th")).size());
  
 
  
	  List <WebElement> secondRow = Table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("th"));
	  System.out.println(Table.findElement(By.xpath("//table[@name ='courses']/tbody/tr[3]")).getText());
	
  
	}
}
