package SeleniumNew2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorTest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
		
		
		//cssselector ---> tagName[attributeName='AttributeValue']
		//css ma anyattribute use kari shakiye
		
		//input[data-testid='royal_email']

		//*[data-testid='royal_email']
		
		//we can use multiple attribute as well-->input[data-testid='royal_email'][id='email]

		//cotains jevo sytax(xpath)-->(cssselector)-->input[data-testid*='yal_emai']

		
		//start with -->input[data-testid^='royal_emai']

		//end with -->input[data-testid$='yal_email']

		
		//* - Contains
		//^ - Starts-with
		//$ - Ends with

		//div[class='_6lux']>input -->agi aapde / ni jagyae > use kariye

		//execute is very faster in cssselecetor compare to xpath
		//few comanies are using cssselectors
		
		
		//#email -->  # means css selector with id attribute
		
		//._6lux   ===> . menas css seelector class attribute
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.cssSelector("#email")).sendKeys("priya");
		driver.findElement(By.cssSelector("#pass")).sendKeys("cghdsgjf");
		
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
		
		
		
		
		

	}

}
