package package1;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalenderSeclectionWithoutHardcoding {

	public static void main(String[] args) {
		String year = "2027";
		String month = "6";
		String date = "12";
	    String[] expected = {month,date,year};
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.className("react-date-picker__inputGroup")).click();
		driver.findElement(By.className("react-calendar__navigation__label")).click();
		driver.findElement(By.className("react-calendar__navigation__label")).click();
        driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();

driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();

List<WebElement> list1 =driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));

for(int i=0;i<list1.size();i++)
{
	System.out.println(list1.get(i).getAttribute("value"));
	Assert.assertEquals(list1.get(i).getAttribute("value"), expected[i]);
	}

	}
}
