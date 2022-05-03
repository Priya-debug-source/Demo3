package SeleniumNew2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement email= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]"));
		email.sendKeys("sdfsfgtg");
		
		/*relative - 1)tagname[@attributename='attributevalue']
		             //input[@id='email']
		             //input[@placeholder='Email or phone number']-->this is not show any matching element , so we will not use this,because 1 to matching element hovo joiye, 
		             //*[@id='email']-->star pan muki shakiye istead of tagname , but aapdne khbar hoi k aa uniq id chhe to tag name lakhvani jarur nathi
		             2)*[@id='email' or name='email']-->you can use multiple attribute name and value, for or one element should present , jo aapde and use kariye to both element present hova joiye
		             3)when aapdi pase 1 karta vadhare matching note hoi to ,or if you don't have an unique attribute
		              (//div[@class='_6lux'])[2]-->jo aapde bijo element joiye tyare
	                  
	                 4) ul[contains(@class,'ulListPageFooterLinkList')]-->Partial link text, aa aetle use kavama aave k pachhad ni id change thati hoi to aapde partial link text use kariye and aeno syntax thodo different chhe
	                  5)jo aapde element search karvano chhe and aena aekpan attribute nathi k jene use karine aapde tya pahochi shakiye to aapde parent class ni id use kari shakiye
	                   //div[@id='pageFooter']/ul-->agar ul ma koi id nathi and ul sudhi pahochvu chhe
	                  6)xpath using text
	                  //*[text()='Sign Up']
	                  
	                  */
	
	
	
	}
	
	
	

}
