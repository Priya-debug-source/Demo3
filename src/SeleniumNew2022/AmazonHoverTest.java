package SeleniumNew2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHoverTest {

	public static void main(String[] args) throws InterruptedException {

		//Click on sign in after hover
  //size and text from the your list
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		
		WebElement amazonhover = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
		 Actions build=new Actions(driver);
		 build.moveToElement(amazonhover).build().perform();
		 
	List<WebElement> a1=driver.findElements(By.xpath("//div[@id='nav-al-container']//a"));
	System.out.println(a1.size());
	
	for(WebElement alllink: a1) {
		System.out.println(alllink.getText());
	}
		
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
