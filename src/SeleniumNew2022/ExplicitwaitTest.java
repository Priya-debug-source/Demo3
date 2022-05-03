package SeleniumNew2022;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitwaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://echoecho.com/javascript4.htm");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//max
		
		
		//explicit wait kem use kariyo?
		//ans : because implicit wait only element find thatu hoi tya j apply thashe
		//to aava alert box and special condition bau badhi chhe jema explicit wait use kari shakiye
		//1 j class ma aapde implicit and explicit wait banne use kari shakiye
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		 driver.findElement(By.name("B2")).click();
		 wait.until(ExpectedConditions.alertIsPresent());
		 Alert a1 = driver.switchTo().alert();
		 
		 System.out.println(a1.getText());
		 
		 a1.accept();
		
		

	}

}
