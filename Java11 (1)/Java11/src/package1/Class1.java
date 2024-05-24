package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\Downloads\\\\chromedriver-win64\\\\chromedriver.exe");
//WebDriver driver = new ChromeDriver();
System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();

driver.get("https://rahulshettyacademy.com/");
driver.getTitle();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.close();
}

}
