package package1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
WebElement drop1 = driver.findElement(By.id("checkBoxOption2"));
drop1.click();
String drop1opt = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
System.out.println(drop1opt);

WebElement drop2 = driver.findElement(By.id("dropdown-class-example")) ;
Select option = new Select(drop2);
option.selectByVisibleText(drop1opt);
String one = option.getFirstSelectedOption().getText();
System.out.println("option selected in dropdown is:" + one);
driver.findElement(By.id("name")).sendKeys(one);
driver.findElement(By.id("alertbtn")).click();
String alertText = driver.switchTo().alert().getText();
System.out.println("Text on alert popup is:" +alertText);
if(alertText.contains(drop1opt))
{
	System.out.println("alert message success");
	}
else
{
	System.out.println("alert message does not contain selected options text");
	}
	}
	

}
