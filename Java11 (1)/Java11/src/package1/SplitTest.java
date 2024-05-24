package package1;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SplitTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String Name = "rahul";
System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
String password = getpassword(driver);

driver.get("https://rahulshettyacademy.com/locatorspractice/");
driver.findElement(By.id("inputUsername")).sendKeys(Name);
driver.findElement(By.name("inputPassword")).sendKeys(password);
driver.findElement(By.className("signInBtn")).click();
	}
	public static String getpassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class = 'reset-pwd-btn']")).click();
		String passwordtext = driver.findElement(By.cssSelector("form p")).getText();
		String[] password1 = passwordtext.split("'");
		String password = password1[1].split("'")[0];
		return password;
	}

}




