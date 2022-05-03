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

public class YahooListTest1 {

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ca.yahoo.com/?p=us&guccounter=1");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   List<WebElement>  ele= driver.findElements(By.xpath("//div[@class='D(b) Bxz(bb) end(12px) Pt(7px) wafer-tabs-target_Pt(8px)']"));
		/*List<WebElement> allList = driver.findElements(By.xpath("//div[contains(@class,'trendingNowTextList')]//a"));--we can use this xpath as well
	System.out.println(allList.size());
	
	for(int i = 0; i<allList.size(); i++) {
		System.out.println(allList.get(i).getText());
	}*/

		System.out.println(ele.size());
		
         for(int i=0;i<ele.size();i++) {
        	 
			
			System.out.println(ele.get(i).getText());
			

	}

         File scr= driver.getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(scr, new File("C:\\testing\\Scs\\s3.jpg")); 
         
         
         
}}
