package SeleniumNew2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		//sortable elemnt present or not
		Thread.sleep(2000);
		List<WebElement> a1= driver.findElements(By.xpath("//aside[@class='widget']"));
		
		if(a1.size()>0) {
			System.out.println("element is present");
		}else{
			System.out.println("element is not present");
		}
		
		
		List<WebElement> draggable=driver.findElements(By.id("draggable"));
		
		if(draggable.size()>0) {
			System.out.println("element is present");
		}else{
			System.out.println("element is not present");
		}
		
		
		System.out.println(".............switching to the frame...........");
		
		Thread.sleep(2000);
		//driver.switchTo().frame(0);//with index
		//driver.switchTo().frame("name");//This option works only with name or id. IN this case we can not use second option
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
 a1= driver.findElements(By.xpath("//aside[@class='widget']"));
		
		if(a1.size()>0) {
			System.out.println("element is present");
		}else{
			System.out.println("element is not present");
		}
		
		
		 draggable=driver.findElements(By.id("draggable"));
		
		if(draggable.size()>0) {
			System.out.println("element is present");
		}else{
			System.out.println("element is not present");
		}
		
		
		System.out.println(".......switching to the main page...........");
		
		driver.switchTo().defaultContent();
		
		
		 a1= driver.findElements(By.xpath("//aside[@class='widget']"));
		
		if(a1.size()>0) {
			System.out.println("element is present");
		}else{
			System.out.println("element is not present");
		}
		
		
		 draggable=driver.findElements(By.id("draggable"));
		
		if(draggable.size()>0) {
			System.out.println("element is present");
		}else{
			System.out.println("element is not present");
		}
		//when we insde and again inside the frame -->use parentFrame
		
	}

}
