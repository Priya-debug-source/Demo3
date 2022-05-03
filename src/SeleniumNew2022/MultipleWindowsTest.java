package SeleniumNew2022;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fhl%3Den&ss=1&scc=1&ltmpl=default&ltmplcache=2&hl=en&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		
		
		driver.findElement(By.linkText("Help")).click();
		
		//in selenium new window and new tab both are same
		
		
		
		
		Set<String> allWindows= driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		//set does not have the index
				//String mainWindow =allWindows.get(0);	
		//to aapde value read karvi hoi set mathi to iterator ma convert karvi pade
		
		Iterator<String> itr= allWindows.iterator();
		String mainWindow=itr.next();
		String ChildWindow=itr.next();
	
		
		System.out.println(mainWindow);
		System.out.println(ChildWindow);
		
		
		
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.switchTo().window(ChildWindow);
		
		System.out.println(driver.getTitle());//help page title
		
		
		//driver.close();//child window ma kam pati jay pachhi aene close karva mate
		
		
		driver.switchTo().window(mainWindow);//gmail page title
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
