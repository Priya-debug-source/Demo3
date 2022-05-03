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

public class BestBuyTestList {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.bestbuy.ca/en-ca");
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		File scr = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("D:\\New folder\\s1.jpg"));
		
	
		
		List<WebElement> p1= driver.findElements(By.xpath("//ul[@class='linkList_2-L96']/li"));
		System.out.println(p1.size());
		
		driver.findElement(By.xpath("//ul[@class='linkList_2-L96']/li[1]")).click();
		
		
		
		List<WebElement> a1= driver.findElements(By.xpath("//div[@class='container_3hQAz']//a"));
		System.out.println(a1.size());
		
		for(WebElement alllink: a1) {
			System.out.println(alllink.getText());
			
		}
		
		
	}

}
