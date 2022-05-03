package SeleniumNew2022;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com/");
		//insted of get we can use driver.navigate.to
		driver.navigate().to("https://www.google.com/");
		
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		

	}

}
