package SeleniumNew2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementPresentTest1 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//how we can not verify  whether element is present or no
		
		/*if(driver.findElement(By.linkText("Aboutdfgf")).isDisplayed()) {
			System.out.println("element is present");
		}else{
			System.out.println("not present");
		}-->aama agar About ni jagya par biju kai lakhiye like Aboutbdhfb  , to error aavti hati
		-->Aetle error ni aave aena mate list<weblist> use karvanu aetle e 0 answer aapshe not the error
		*/
		
		List<WebElement> alllist=driver.findElements(By.linkText("About"));
		System.out.println(alllist.size());
		
		if(alllist.size()>0) {
			System.out.println("elemnt is present");
		}else {
			System.out.println("not present");
		}
		
		
		
	}

}
