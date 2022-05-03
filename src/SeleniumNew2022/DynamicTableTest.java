package SeleniumNew2022;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableTest {

	public static void main(String[] args) {
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
 
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		
		List<WebElement> a1=driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(a1.size());
		
		
		List<WebElement> a2 = driver.findElements(By.xpath("//table[@id='customers']//tr[2]/td"));
		System.out.println(a2.size());
		
	 	for(int i=2; i<=a1.size(); i++) {
			
			for(int j =1; j<=a2.size(); j++) {
				//System.out.println(i+"---"+j);
				
				
				System.out.print(driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")).getText());
				System.out.print("  |  ");
				
			}
			System.out.println(      );
				
				//sir no code
					
				/**
				 for(int i=2; i<=rows.size(); i++) {
			
			for(int j =1; j<=cols.size(); j++) {
				String first = "//table[@id='customers']//tr[";
				String second = "]/td[";
				String third = "]";
				//System.out.println(driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")).getText());
				System.out.println(driver.findElement(By.xpath(first+i+second+j+third)).getText());
			}
			
		}
* /
				
				
				
				
			}
			
			
	 	}
	 	
	 	/*for(WebElement r1 : a1) {
	 		System.out.println(r1.getText());
	 		
	 		
	 	}*/

	}

	}}
