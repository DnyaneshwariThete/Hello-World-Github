package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
driver.findElement(By.id("checkBoxOption1")).click();
System.out.println(driver.findElement(By.id("checkBoxOption1")).isEnabled());
driver.findElement(By.id("checkBoxOption1")).click();
System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	}

}
