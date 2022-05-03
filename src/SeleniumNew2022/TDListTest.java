package SeleniumNew2022;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TDListTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.td.com/");
		
		
		
		File s1= driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(s1, new File("C:\\testing\\Scs\\screenshot.png"));
		
		
		List<WebElement> alllinks= driver.findElements(By.xpath("//div[contains(@class,'td-footer-links td-copy-align')]/a"));
		System.out.println(alllinks.size());
		
		for(int i=0;i<alllinks.size();i++) {
			System.out.println(alllinks.get(i).getText());
		}

	}

}
