package SeleniumNew2022;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class AtributeTest1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		Thread.sleep(-1000);
		
		String s=driver.findElement(By.xpath("//input[@id='gh-ac']")).getAttribute("placeholder");//-->.gettext use ni kariyu because aapdi pase text nathi aa to placeholder hatu
		System.out.println(s);
		
		driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		//==>aapde search box ma kai type kariyu chhe and if you want to know what you have type in taxbox
		//==>always get attribut ma "value" aavshe , 
		String p = driver.findElement(By.id("gh-ac")).getAttribute("value");
		System.out.println(p);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
