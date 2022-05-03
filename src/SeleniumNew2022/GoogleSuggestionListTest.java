package SeleniumNew2022;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//type canada in search box
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//size - 10
		//text
		driver.findElement(By.name("q")).sendKeys("Canada");
		Thread.sleep(2000);
		
		List<WebElement> alllist=  driver.findElements(By.xpath("//div[@class='aajZCb']//li"));
		System.out.println(alllist.size());
		
		for(WebElement a1: alllist) {
			System.out.println(a1.getText());
			
		}
		
		
		

	}

}
