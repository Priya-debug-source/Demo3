package SeleniumNew2022;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbaySuggestionTest {

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		
		//for the screenshot
       File s1= driver.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(s1, new File("C:\\testing\\Scs\\s4.jpg"));
		
	
		//type iphone
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("iphone");
		List<WebElement> a1= driver.findElements(By.xpath("//div[@id='gAC']//li"));
		System.out.println(a1.size());
		
		
		for(WebElement p1: a1) {
			System.out.println(p1.getText());
		}
		
		

	}

}
