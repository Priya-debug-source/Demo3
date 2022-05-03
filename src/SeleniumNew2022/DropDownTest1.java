package SeleniumNew2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		List<WebElement> alllist = driver.findElements(By.xpath("//div[@id='gh-cat-box']//option"));
	System.out.println(alllist.size());
	
	
	//Bydeafault j select chhe e melvva 
	for(WebElement a1: alllist) {
		System.out.println(a1.getText()+"---->"+a1.isSelected());
	}
	/*now how to select the element from the dropdown
	 aapdi pase inbult class chhe Select-->but jyare inbuilt class use kariye tyare object create karvo pade
	
	 
	 *
	 */
	
	WebElement dp =driver.findElement(By.id("gh-cat"));
	Select s= new Select(dp);
	
	s.selectByIndex(1);
	
	Thread.sleep(2000);
	s.selectByValue("267");
	Thread.sleep(2000);
	
	s.selectByVisibleText("Stamps");
	Thread.sleep(2000);
	System.out.println("---------------------------");
	for(WebElement a1: alllist) {
		if(a1.isSelected()) {
		System.out.println(a1.getText()+"---->"+a1.isSelected());}
	}
	
	}

}
