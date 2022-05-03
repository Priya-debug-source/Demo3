package SeleniumNew2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BackAndForwardButtonTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebDriverWait wait= new WebDriverWait(driver , Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("About")).click();
		//Thread.sleep(3000);//ahi aapde title male e pela error aavi jashe because elemnt malvama time lage chhe
		//to aapde explicit wait mukishu
		
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		
		System.out.println(driver.getTitle());//About Page
		
		driver.navigate().back();//Google page
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.titleIs("Google"));
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();//About Page
		//Thread.sleep(3000);
		
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		System.out.println(driver.getTitle());
		
		/*driver.navigate().refresh();
		Thread.sleep(2000);*/

	}

}
