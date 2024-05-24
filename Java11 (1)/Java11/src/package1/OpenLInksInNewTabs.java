package package1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLInksInNewTabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://pharmeasy.in/online-medicine-order?isSEM=true&utm_source=google&utm_medium=cpc&utm_campaign=GSB_New_CX_FP&utm_adgroup=OTC_Healthcare&gad_source=1&gclid=Cj0KCQjw6PGxBhCVARIsAIumnWbJIMkN0L1cfw73FYH7Q8h9ph32sYuPxZjahOJcQnLrBcwmkt4OTP4aAlF6EALw_wcB");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver = driver.findElement(By.className("FooterV2_columns__dvSyQ")); 
	    System.out.println(footerdriver.findElements(By.tagName("a")).size());
	    WebElement column1driver = driver.findElement(By.xpath("(//div[@class='FooterV2_appFooterLinksColumn__TNXeW'])[1]"));
	    int column1size = column1driver.findElements(By.tagName("a")).size();
	    System.out.println(column1driver.findElements(By.tagName("a")).size());
	//click on each link in columndriver and check whether the links are openeing
	    for(int i =0;i<column1size;i++)
	    {
	    	//open each link in nwe tab
	    	String clickonlinks = Keys.chord(Keys.CONTROL,Keys.ENTER);
	    	column1driver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinks);
	    	Thread.sleep(Duration.ofSeconds(2));
	    	}
	 Set<String> windowsurl = driver.getWindowHandles();
	 Iterator abc = windowsurl.iterator();
	 while(abc.hasNext()) {
		 driver.switchTo().window((String) abc.next());
		 System.out.println(driver.getTitle());
	 }
	}

}
