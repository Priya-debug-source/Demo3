package SeleniumNew2022;





import org.openqa.selenium.By;


import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeTest1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.youtube.com/");
//Dimension dem =new Dimension(650, 650);
//driver.manage().window().setSize(dem);
Thread.sleep(3000);

driver.findElement(By.xpath("//input[@id='search']")).sendKeys("golmal");;
driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
Thread.sleep(3000);

driver.findElement(By.xpath("//yt-icon[@id='guide-icon']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//yt-formatted-stringg[@class='title style-scope ytd-guide-entry-renderer']")).click();



	}

}






