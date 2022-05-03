package SeleniumNew2022;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.List;

import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Captchahandling {
	
	WebDriver driver;
	@Before
	public void setUp() {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars1\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
	}

//	@Test
	public void test() {
		
		driver.get("http://www.captcha.net/");
		
		String captchaval = JOptionPane.showInputDialog("Please enter the  captcha value");
		
		driver.findElement(By.xpath("//div[@class='normal']/center/a")).sendKeys(captchaval);
		
		
		}
	
	@Test
	public void test2() throws InterruptedException {
		driver.get("https://drivetest.ca/");
		
		
		
		JavascriptExecutor jse=  (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,4000)");
		
		
		driver.findElement(By.linkText("BOOK A ROAD TEST")).click();
		
		//driver.findElement(By.xpath("//div[@id='checkbox']")).click();
		
		
		
		/*driver.findElement(By.id("licenceNumber")).sendKeys("dfgvfdgbdfz");
		driver.findElement(By.id("licenceExpiryDate")).sendKeys("2024-08-01");
		
		driver.findElement(By.xpath("//span[@class='filter-option pull-left'][contains(text(),'G2')]")).click();
		
		driver.findElement(By.xpath("//div[@class='bs-searchbox']/input")).sendKeys("G");
		driver.findElement(By.xpath("//ul[@class='dropdown-menu inner']/li[1]/a")).click();
		
		WebElement dp=driver.findElement(By.xpath("//select[@id='class']/option"));
		Select s=new Select(dp);
		Thread.sleep(3000);
		
		s.selectByIndex(0);*/
		
		
		
		driver.findElement(By.id("email")).sendKeys("priyamavani@gmail.com");
		
	}
	
	@After
	public void t2() {
		
		//driver.close();
		
		
	}

}

