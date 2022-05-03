package SeleniumNew2022;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpTest {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.aliexpress.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//if you get the popUp -->close popup-->type computer in the search box
		//f you don't get this pop up -->type computer in the search box
		
		
		List<WebElement> popup= driver.findElements(By.xpath("//img[@class='close-btn']"));
        System.out.println(popup.size());
 
       
 
 if(popup.size()>0)
 {
	 driver.findElement(By.className("close-btn")).click();
	 //driver.findElement(By.className("btn-close")).click();
 }else {
 
	 driver.findElement(By.id("search-key")).sendKeys("Computer");
 
 }
 
	}
//needs to solve the error in this page
	
}
