package package1;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class AddingItemsToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] itemsneeded = {"cucumber","brocolli"};
		List <WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<products.size();i++)
		{
			String[] name = products.get(i).getText().split("-");
			String formattedstring = name[0].trim();
			Thread.sleep(Duration.ofSeconds(5));
			List itemneededlist = Arrays.asList(itemsneeded);
			if(itemneededlist.contains(name))
			{
				//click on addtocart
				driver.findElement(By.xpath("//button[text(),'ADD TO CART']")).click();
			}
		}
	}

}
