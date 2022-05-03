package SeleniumNew2022;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nike.com/ca/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		
		WebElement m1=driver.findElement(By.xpath("//nav[@class='pre-l-nav']/div[2]/ul/li[2]/a"));
		Actions build=new Actions(driver);
		build.moveToElement(m1).build().perform();
		
		
		List<WebElement> a1=driver.findElements(By.xpath("//div[@id='DesktopMenu-0-1-0']/div/div[2]/a"));
		System.out.println(a1.size());
		
		
		
		for(WebElement t:a1) {
			System.out.println(t.getText());
		}
		
		
		
		
		
		
		
		/*
		if(popUp.size()>0) {
			driver.findElement(By.xpath("//div[@class='pre-modal']/button")).click();
		}
		*/

		
		/*//a[contains(@aria-label,'main-menu, Men, Shoes')]
*/
		
		
		
		/*WebElement wb=driver.findElement(By.cssSelector(""));
		Actions build = new Actions(wb);*/
		
	}

}
