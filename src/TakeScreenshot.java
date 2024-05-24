import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		//File src =   ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	
		//FileUtils.copyFile(src,new File("C:\\Users\\scs\\Pictures\\Screenshots\\selenium.png"));
	
	
	//take screenshot of webelement
		WebElement name = driver.findElement(By.id("autocomplete"));
		name.sendKeys("ind");
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File( "C:\\Users\\scs\\Pictures\\Screenshots\\webelement.png"));
	
		
		//get height and width of webelement
		System.out.println(name.getRect().getDimension().getHeight());

		System.out.println(name.getRect().getDimension().getWidth());
	}

}