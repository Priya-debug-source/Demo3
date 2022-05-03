package SeleniumNew2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahoosuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ca.yahoo.com/");
		
		//type canada
		Thread.sleep(2000);
		
		driver.findElement(By.name("p")).sendKeys("canada");
		Thread.sleep(1000);
		
		
		
		//List<WebElement> alltext= driver.findElements(By.xpath("//div[contains(@class,'_yb_iv7i5')]//li"));
		List<WebElement> alltext= driver.findElements(By.xpath("//div[@class='_yb_iv7i5']//li"));
        System.out.println(alltext.size());
        for(WebElement t1:alltext) {
        	System.out.println(t1.getText());
        }
        
        
        //sir no code
        /*driver.findElement(By.name("p")).sendKeys("iphone");
		Thread.sleep(2000);

		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(allOptions.size());
		
		for(WebElement a : allOptions) {
			System.out.println(a.getText());
		}
*/
        
	}

}
