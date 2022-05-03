package SeleniumNew2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultipleBrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser="FireFox";//chrome,firefox,safari...
		//String browser="Chrome"
		
		WebDriver driver;
		if(browser.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars1\\geckodriver.exe");
			//FirefoxDriver driver=new FirefoxDriver();->aa lakhvathi error aavti hati to me Webdriver driver kariyu but to pan erroe aavti hati to aene globally declared kariyu(webdriver driver;)
			//WebDriver driver=new FirefoxDriver();
			driver=new FirefoxDriver();
			
			
			
		}else if(browser.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars1\\chromedriver.exe");
			 driver=new ChromeDriver();
			
			
			
		}else {
			System.setProperty("webdriver.Safari.driver", "C:\\SeleniumJars1\\safari.exe");
			 driver=new SafariDriver();
		}
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sfdsdf@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("fhtf");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}
