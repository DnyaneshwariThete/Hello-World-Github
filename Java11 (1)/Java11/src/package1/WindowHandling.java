package package1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windowsurl = driver.getWindowHandles();
		Iterator<String> it = windowsurl.iterator();
		String parentwin = it.next();
		String childwin = it.next();
		driver.switchTo().window(childwin);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		//String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		String[] splitted =driver.findElement(By.cssSelector(".im-para.red")).getText().split("at");
		String split1 = splitted[1].trim();
	System.out.println(split1);
	String[] split2 = split1.split("with");
	String string3 = split2[0].trim();
	System.out.println(string3);
	driver.switchTo().window(parentwin);
	driver.findElement(By.id("username")).sendKeys(string3);
	}

}
