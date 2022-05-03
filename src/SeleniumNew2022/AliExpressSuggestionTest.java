package SeleniumNew2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AliExpressSuggestionTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		//type Computer
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://best.aliexpress.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@class='btn-close']")).click();
		
		driver.findElement(By.xpath("//img[@class='_24EHh']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='SearchText']")).sendKeys("computer");
		Thread.sleep(2000);
		
		List<WebElement> alltext= driver.findElements(By.xpath("//ul[]"));
		
		System.out.println(alltext.size());
		
/*driver.findElement(By.id("search-key")).sendKeys("computer");
		Thread.sleep(2000);
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@data-role='items']/li"));
		System.out.println(allOptions.size());
		
		for(WebElement a : allOptions) {
			System.out.println(a.getText());*/
		}

	}


