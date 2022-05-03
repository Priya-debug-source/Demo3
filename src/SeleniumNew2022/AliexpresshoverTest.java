package SeleniumNew2022;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AliexpresshoverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://best.aliexpress.com/");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		List<WebElement> popup1= driver.findElements(By.xpath("//img[@class='btn-close']"));
		
		
		
		if(popup1.size()>0) {
			driver.findElement(By.xpath("//img[@class='btn-close']")).click();
			
		}
		
    List<WebElement> popup2= driver.findElements(By.xpath("//img[@class='_24EHh']"));
		
		
		
		if(popup2.size()>0) {
			driver.findElement(By.xpath("//img[@class='_24EHh']")).click();
			
		}
		
		
		
	List<WebElement> cat = driver.findElements(By.xpath("//div[@class='categories-list-box']//a"));
		System.out.println(cat.size());
		
		for(WebElement a2: cat) {
			System.out.println(a2.getText());
		}
		
		System.out.println(".....................................................................................");
		
		WebElement w1= driver.findElement(By.linkText("Women's Fashion"));
		Actions build= new Actions(driver);
		
		build.moveToElement(w1).build().perform();
		
		List<WebElement> woman= driver.findElements(By.xpath("//d1[@class='sub-cate-items']//a"));
		System.out.println(woman.size());
		
		for(WebElement a3: woman) {
			System.out.println(a3.getText());
		}
		

	}

}
