package SeleniumNew2022;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUP1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sfdsdf@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("");
		
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
		
		driver.findElement(By.linkText("Create new account")).click();
		
		
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("pridsff");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("dscfsdf");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8785621205");
		driver.findElement(By.id("password_step_input")).sendKeys("dffdvzsf");
		
		
		WebElement dp =driver.findElement(By.xpath("//select[@id='month']"));
		Select s= new Select(dp);
		s.selectByIndex(6);
		
		
		
		WebElement dp1=driver.findElement(By.id("day"));
		Select day=new Select(dp1);
		
		day.selectByIndex(1);
		
		WebElement dp2=driver.findElement(By.id("year"));
		Select year= new Select(dp2);
		
		
		year.selectByValue("2000");
		
	List<WebElement>	radiolist= driver.findElements(By.xpath("//label[@class='_58mt']"));
	System.out.println(radiolist.size());
	//System.out.println(radiolist.get(0).getText());
	
	for(WebElement radio:radiolist) {
		System.out.println(radio.getText()+"...."+radio.isSelected());
	}
	
	
	System.out.println("................");
		radiolist.get(2).click();
		
		
		
		for(WebElement radio:radiolist) {
			System.out.println(radio.getText()+"......"+radio.isSelected()); 
		}
		

	}

}
