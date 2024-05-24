package package1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub 
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chrome-win64 (1)\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://rahulshettyacademy.com/locatorspractice/");
driver.findElement(By.id("inputUsername")).sendKeys("rahul");
driver.findElement(By.name("inputPassword")).sendKeys("1234");
driver.findElement(By.className("signInBtn")).click();
System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
driver.findElement(By.linkText("Forgot your password?")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john");
driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("a@gmail.com");
driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("john@gmail.com");
driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("1234567890");
driver.findElement(By.xpath("//*[contains(text(), 'Reset Login') ]")).click();
System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
driver.findElement(By.id("inputUsername")).sendKeys("rahul");
driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
driver.findElement(By.name("chkboxOne")).click();
driver.findElement(By.name("chkboxTwo")).click();
driver.findElement(By.xpath("//*[contains(text(), 'Sign In')]")).click();
	}

}
