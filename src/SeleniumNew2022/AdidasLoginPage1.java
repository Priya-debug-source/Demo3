package SeleniumNew2022;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class AdidasLoginPage1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.adidas.ca/en/account-login");
		 Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("dfgdsj@gmail.com");
		driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("ddfhbdsjf");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
       Thread.sleep(3000);
        
        String expected ="Incorrect email/password – please check and retry";
        String actual= driver.findElement(By.xpath("//div[contains(@class,'errorMessage___')]")).getText();
        
        System.out.println(expected);
        System.out.println(actual);
        
        if(expected.equals(actual)) {
        	System.out.println("test pass");
        }else {
        	System.out.println("test fail");
        }
	}

}
