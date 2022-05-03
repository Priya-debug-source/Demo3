package SeleniumNew2022;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=Ygik_MCZz3Y&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiWWdpa19NQ1p6M1kiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY0NzExNTQxMywiaWF0IjoxNjQ3MTE0MjEzLCJqdGkiOiJiMDc3OWIyMi1jZTEzLTQ0OGMtOGUzMi0yNDM4OWViMGI1MmIiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.K9Urx5SjzSXEBgTxnRYv-LrigAt_6Dw547C2HYQjh1iGRE_o0Tqzetr806nuIi7o8sKP2VBV31uwGBfF4ndQo4HXIHS36L1mYjR9ZaHe_MQVE19YAxpYKyG2cz7TG6vqKdTq0h1V221vzAeNtYMkRtREeGGT3NHtXBn9xjOv87r31qeIArVTH6B3ByyuMyErpKhmCVIMkAWghjJBHNLs7xRS7OFoNjjp9Z1HcDrwYCE_cmBiGB8aZZan1vbGen0WUjaUWSFsvep-XX_Qkp3bM095tCooD8mRwbCLOO4ciruINCoaC2V9Vp8x4GtOSB_d-NGIPy6tIPM5vIXk5SZj7w&preferred_environment=");
		Thread.sleep(4000);
		
		
		driver.findElement(By.name("usernameInput")).sendKeys("dsfsdf");
		driver.findElement(By.name("password")).sendKeys("dasfweaf");
		  
		 driver.findElement(By.id("signIn")).sendKeys(Keys.ENTER);
		
		

	}

}
