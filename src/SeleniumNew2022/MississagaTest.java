package SeleniumNew2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MississagaTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//mississauga.ca
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.mississauga.ca");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.id("mobileMenuToggle")).click();
		Thread.sleep(2000);
		////ul[@class='main-nav-links']/li[3]//li

		driver.findElement(By.xpath("//li[@class='dropdown nav-link show']/button")).click();
		Thread.sleep(500);
		
		List<WebElement> dp= driver.findElements(By.xpath("//li[@class='dropdown nav-link show']//a"));
		for(WebElement a1: dp) {
			System.out.println(a1.getText());
		}
		
		/*List<WebElement> alltext= driver.findElements(By.xpath("//ul[@class='dropdown-menu nav-dropdown-menu show']/li/a"));
		System.out.println(alltext.size());
		
		for(WebElement a1: alltext) {
			System.out.println(a1.getText());
		}
		*/
		
		
		/*
		 * Sir no code
		 * driver.findElement(By.xpath("//ul[@class='main-nav-links']/li[3]/button")).click();
		Thread.sleep(2000);
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='main-nav-links']/li[3]//li"));
		System.out.println(allOptions.size());
		
		for(WebElement a : allOptions) {
			System.out.println(a.getText());
			if(a.getText().equals("Jobs and volunteer")) {
				a.click();
				Thread.sleep(2000);
				System.out.println(driver.getTitle());
				break;
			}
		}
*/
		

	}

}
