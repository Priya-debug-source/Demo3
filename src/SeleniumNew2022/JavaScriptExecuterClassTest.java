package SeleniumNew2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScriptExecuterClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		/*driver.get("https://www.ebay.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		
		
		
		driver.findElement(By.linkText("Registration")).click();*/
		
		driver.get("https://www.adidas.ca/en/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		driver.manage().window().maximize();
		
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		
		WebElement careers= driver.findElement(By.linkText("Careers"));
		//Option 1: Using X and Y cordinate
		//scroll
		//have jo aapde x and y ahi 0,4000 lidhu chhe e guess karine lidhu chhe but jo
		//aekdam chokkas x and y joto hoy to aeni method chhe j element no x and y find karvano chhe e find karva j object banaviyo chhe  e and .getlocation karvanu
		
		
		//System.out.println(careers.getLocation());
		//jse.executeScript("window.scrollBy(0,4000)");
		//careers.click();
		
		
		
		//option 2: Scroll until the element is in view is true
		//jse.executeScript("arguments[0].scrollIntoView(true);", careers);
		//careers.click();
		
		//option 3:Direct click using Javascript executor
		jse.executeScript("arguments[0].click();", careers);
		
		//if we want to type
		//use this-->//jse.executeScript("arguments[0].value='ssdgdfgdgfgsag'", careers); // To type into any input Box

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
