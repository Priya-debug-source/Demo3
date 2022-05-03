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
import org.openqa.selenium.interactions.Actions;

public class EbayHoverTest {



	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		 driver.get("https://www.ebay.ca/");
		 
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 
		//Hover code 
		 
		 WebElement a1= driver.findElement(By.linkText("Electronics"));
		 Actions build=new Actions(driver);
		 
		
		build.moveToElement(a1).build().perform();
		
		//now when you hover and you can see the whole list of links , we can see all text 
		
			
		List<WebElement> alllinks= driver.findElements(By.xpath("//div[@class='hl-cat-nav__sub-cats']//ul"));
		System.out.println(alllinks.size());
		
		
		for(WebElement a: alllinks){
			System.out.println(a.getText());
			
			
		}
		
		//screenshot
		File scr=driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("D:\\New folder\\s1.jpg"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.interactions.Actions;

		public class EbeyHoverTest {

		        public static void main(String[] args) throws InterruptedException {
		                // TODO Auto-generated method stub
		        System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		                FirefoxDriver driver =new FirefoxDriver();

		                driver.get("https://www.ebay.ca/");

		                WebElement abc =driver.findElement(By.linkText("Electronics"));
		                Actions build =new Actions(driver);
		                build.moveToElement(abc).build().perform();

		                Thread.sleep(2000);

		                List<WebElement> allLinks =driver.findElements(By.xpath("//body[@class='desktop gh-flex']/div[@id='mainContent']/div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[6]/div[2]/div[1]/nav[1]/ul/li"));
		                System.out.println(allLinks.size());

		                for(WebElement s: allLinks) {
		                        System.out.println(s.getText());
		                }
		        }*/


		

	}

}
