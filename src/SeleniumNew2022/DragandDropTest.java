package SeleniumNew2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		
		
		
		WebElement droppable = driver.findElement(By.id("droppable"));
		WebElement draggable = driver.findElement(By.id("draggable"));
		System.out.println(droppable.getText());
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(draggable, droppable).build().perform();
		
		
		
		System.out.println(droppable.getText());
		
		if(droppable.getText().equals("Dropped!")) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Fail");
		}

			
		
	
	}

}
