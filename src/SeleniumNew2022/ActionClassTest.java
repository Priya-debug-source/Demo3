package SeleniumNew2022;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTest {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.ca/");
		
		
		//Actions class inbuilt chhe ..hover perform karva
		//and jyare pan action class use kariye tyare build().perform() lakhvu pade
		
		
		/*WebElement electronics = driver.findElement(By.linkText("Electronics"));
		Actions builder = new Actions(driver);
		builder.moveToElement(electronics).build().perform();
		
		Thread.sleep(3000);
		
		List<WebElement> allList = driver.findElements(By.xpath("(//nav[@aria-label='Top Categories']/ul)[3]/li"));
		System.out.println(allList.size());
		
		for(int i = 0; i<allList.size(); i++) {
			System.out.println(allList.get(i).getText());
		}
*/
		
		WebElement electonics= driver.findElement(By.linkText("Electronics"));
		Actions builder=new Actions(driver);
		builder.moveToElement(electonics).build().perform();
		Thread.sleep(3000);
		
		List<WebElement> alllist = driver.findElements(By.xpath("//nav[@aria-label='Top Categories']//a"));
		System.out.println(alllist.size());
		
		for(WebElement a1: alllist) {
			System.out.println(a1.getText());
		}
		
		

	}

}
