package SeleniumNew2022;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebListTest {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//WebElement link = driver.findElement(By.tagName("a"));
		//System.out.println(link);
		//WebElement footer = driver.findElement(By.xpath("//div[@class='KxwPGc SSwjIe']"));
		//List<WebElement> alllinks = footer.findElements(By.tagName("a"));
		
		
		//WebElement footer = driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']"));
		//List<WebElement> alllinks = footer.findElements(By.tagName("a"));
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
		
		System.out.println(alllinks.size());
		
		//System.out.println(alllinks.get(0).getText());-->this is for only one link if you want to type the text for all links - use for loop
		
		for(int i=0;i<alllinks.size();i++) {
			
			System.out.println(alllinks.get(i).getText());
		}

	}

}
