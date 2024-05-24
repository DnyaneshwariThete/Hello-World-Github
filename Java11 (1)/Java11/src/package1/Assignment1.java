package package1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/angularpractice/");
driver.findElement(By.name("name")).sendKeys("Dnyan");
driver.findElement(By.name("email")).sendKeys("test@gmail.com");
driver.findElement(By.id("exampleInputPassword1")).sendKeys("1234");
driver.findElement(By.id("exampleCheck1")).click();

 WebElement gender1 = driver.findElement(By.id("exampleFormControlSelect1"));
 Select gender =new Select(gender1);
 gender.selectByVisibleText("Female");
 gender.selectByIndex(1);
driver.findElement(By.id("inlineRadio1")).click();
driver.findElement(By.name("bday")).sendKeys("1231996");
driver.findElement(By.xpath("//input[@value='Submit']")).click();
System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
	}

}
