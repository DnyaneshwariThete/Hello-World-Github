import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentAutocompleteDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		  System.setProperty("webdriver.chrome.driver", "C://Eclipse//chrome-win64.exe");
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		  driver.findElement(By.id("autocomplete")).sendKeys("in");
		  Thread.sleep(5000);
		  List <WebElement> options = driver.findElements(By.xpath("//div[@class='ui-menu-item-wrapper']"));
		  for(WebElement option:options)
		  {
			  if(option.getText().equalsIgnoreCase("India"))
			  {
				  option.click();
				  break;
			  }
			  
		  }
		  System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
	}

}
