package SeleniumNew2022;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		List<WebElement> a1= driver.findElements(By.xpath("//input[@name='group1']"));
		System.out.println(a1.size());
		
		for(WebElement radio: a1 ) {
			System.out.println(radio.getAttribute("value")+"....."+radio.isSelected());
		}
		

		List<WebElement> a2= driver.findElements(By.xpath("//input[@name='group2']"));
		System.out.println(a1.size());
		
		for(WebElement radio: a2 ) {
			System.out.println(radio.getAttribute("value")+"....."+radio.isSelected());
		}
		System.out.println(".....................");
		
		
		
		//radio button select karva mate
		
		
		
		a1.get(1).click();
		for(WebElement radio: a1 ) {
			System.out.println(radio.getAttribute("value")+"....."+radio.isSelected());
		}
	
		a2.get(2).click();
		
		for(WebElement radio: a2 ) {
			System.out.println(radio.getAttribute("value")+"....."+radio.isSelected());
		}
		
		
	File s3=driver.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(s3, new File("C:\\testing\\Scs\\screenshot1.png"));
		
		
	}

}
