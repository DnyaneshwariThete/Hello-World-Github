package package1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/windows']")).click();
		Set<String> windowsurl = driver.getWindowHandles();
		Iterator<String>it = windowsurl.iterator();		
		String parentId = it.next();		
		String childId = it.next();		
		driver.switchTo().window(childId);		
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());		
		driver.switchTo().window(parentId);		
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());}}