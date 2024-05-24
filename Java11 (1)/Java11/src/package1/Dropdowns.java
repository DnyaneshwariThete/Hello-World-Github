package package1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

//Static Dropdown Selection
		WebElement currencydropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(currencydropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());

//Dynamic Dropdown Selection
		driver.findElement(By.id("divpaxinfo")).click();

		Thread.sleep(Duration.ofSeconds(5));
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("hrefIncChd")).click();
		driver.findElement(By.id("btnclosepaxoption")).click();
//Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2);
		driver.findElement(By.xpath("//a[@value='JDH']")).click();
		Thread.sleep(Duration.ofSeconds(2));
//Xpath using index when two same xpaths are present
		driver.findElement(By.xpath("(//a[@value='STV'])[2]")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getText());
		System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).getText());

//Parent Child Relationship Xpath(alternate way to index xpaths when two same xpaths are present.
//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']")).click();
		Thread.sleep(Duration.ofSeconds(2));
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
//driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[5]/td[3]/a")).click();
//System.out.println("today's date selected");
		// Auto suggest dropdown
		driver.findElement(By.id("autosuggest")).sendKeys("in");
		Thread.sleep(5000);
		// List<WebElement> options =
		// driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		// List<WebElement> options =
		// driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		List<WebElement> options = driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isEnabled();
		// System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isEnabled());
		// driver.findElements(By.xpath("//input[@type='checkbox']")).size();
//System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

//Calender dropdown

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("Return date dropdown is enabled");
		} else {
			System.out.println("Return date dropdown is disabled");
		}
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		System.out.println("clicked on search button");
	}
}