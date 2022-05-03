package SeleniumNew2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayHeder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		List<WebElement> alllinks= driver.findElements(By.xpath("//ul[@class='hl-cat-nav__container']/li"));
		System.out.println(alllinks.size());
		
		//for(int i=0;i<alllinks.size();i++) {
			//System.out.println(alllinks.get(i).getText());
			
			
			for(WebElement a1 : alllinks) {
				System.out.println(a1.getText());
			}
			
			
		}
		
		
		
		

	}


