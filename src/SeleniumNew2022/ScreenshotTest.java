package SeleniumNew2022;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.ca/");
		
		
		File scrFile = driver.getScreenshotAs(OutputType.FILE);//This is for firefoxdriver,chomedriver or any class
		//File scrFile=((TakeScreenshot)Driver).getScreenShotAs(OutputType.FILE);//This line is for  webdriver
		
		FileUtils.copyFile(scrFile, new File("C:\\testing\\screenshot.png"));//ahi aapde jpg pan lai shakiye
		

	}

}
