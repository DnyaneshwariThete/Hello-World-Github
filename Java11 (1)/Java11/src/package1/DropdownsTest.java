package package1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		/*WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select currencydrop = new Select(dropdown);
		currencydrop.selectByIndex(2);
		System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText());
		*/
		
		/*driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(Duration.ofSeconds(2));
		for(int i=1;i<3;i++) {
		driver.findElement(By.id("hrefIncChd")).click();
		driver.findElement(By.id("hrefIncInf")).click();
		}
		Thread.sleep(Duration.ofSeconds(2));
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		*/
		
		/*driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();	
	driver.findElement(By.xpath("//a[@value = 'HBX']")).click();
	Thread.sleep(Duration.ofSeconds(2));
	//driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
	driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']")).click();
	*/
		driver.findElement(By.id("autosuggest")).sendKeys("in");
		Thread.sleep(Duration.ofSeconds(5));
		List<WebElement> options = driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
		System.out.println(driver.findElement(By.id("autosuggest")).getText());
	}
}
