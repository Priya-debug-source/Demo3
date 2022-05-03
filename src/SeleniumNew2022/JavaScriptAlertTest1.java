package SeleniumNew2022;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptAlertTest1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://echoecho.com/javascript4.htm");
		
		/*how you can handle the alret
	when you can not able to inspect in menas it's javascript alret
	aene handle karva mate pela obj banavvano inbuil alret class use karine
	--and switch to alret karvanu and jo selected button click karvu hoi to accept and cancel karvu hoi to dismiss.
	
	 */
		
	    driver.findElement(By.name("B2")).click();
		
	    
	WebDriverWait wait=new WebDriverWait(driver , Ofseconds(20));
	
	wait.until(ExpectedConditions.alertIsPresent());
	
		Alert a1= driver.switchTo().alert();
		System.out.println(a1.getText());
		
		a1.accept();
		//a1.dismiss();
		
		
		
		
		
		
		

	}

	private static Duration Ofseconds(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
