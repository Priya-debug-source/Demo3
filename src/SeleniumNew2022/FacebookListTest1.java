package SeleniumNew2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookListTest1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		List<WebElement>  alllinks= driver.findElements(By.xpath("//ul[contains(@class,'uiList pageFooterLinkList')]/li"));
		//div[@id='pageFooterChildren']//li--->//direct child ,/ single slash means 1 pachhi 1 like /ul/li to pela ul malshe and pachhi li and jo directly li jotot hoi to double slash lakhvana
		System.out.println(alllinks.size());
		
         for(int i=0;i<alllinks.size();i++) {
        	 
			
			System.out.println(alllinks.get(i).getText());
		
         }
		
	}

}
