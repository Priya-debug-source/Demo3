package SeleniumNew2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooHeaderTest1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ca.yahoo.com/?p=us&guccounter=1");
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//ul[@class='_yb_c5z14 _yb_1ufsu']/li"));
System.out.println(alllinks.size());

/*for(int i=0;i<alllinks.size();i++) {
	System.out.println(alllinks.get(i).getText());
}*/

for(WebElement a:alllinks ) {
	System.out.println(a.getText());
}
		
	}

}
