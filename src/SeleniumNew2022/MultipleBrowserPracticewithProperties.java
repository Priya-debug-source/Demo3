package SeleniumNew2022;

		import java.io.FileInputStream;
		import java.io.IOException;
		import java.util.Properties;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.safari.SafariDriver;


public class MultipleBrowserPracticewithProperties {

	public static void main(String[] args) throws IOException {


		
		
		
				
				
				
				FileInputStream f= new FileInputStream("C:\\testing\\prop.properties");
				Properties p1=new Properties();
				
				p1.load(f);
				
				
				String browser = p1.getProperty("Browser");
				// TODO Auto-generated method stub
				
				//String browser="FireFox";//chrome,firefox,safari...
				//String browser="Chrome"
				System.out.println(browser);
				WebDriver driver;
				if(browser.equals("FireFox")) {
					System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars1\\geckodriver.exe");
					//FirefoxDriver driver=new FirefoxDriver();->aa lakhvathi error aavti hati to me Webdriver driver kariyu but to pan erroe aavti hati to aene globally declared kariyu(webdriver driver;)
					//WebDriver driver=new FirefoxDriver();
					driver=new FirefoxDriver();
					
					
					
				}else if(browser.equals("chrome")) {
					
					System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars1\\chromedriver.exe");
					 driver=new ChromeDriver();
					
					
					
				}else {
					System.setProperty("webdriver.Safari.driver", "C:\\SeleniumJars1\\safari.exe");
					 driver=new SafariDriver();
				}
				
				driver.get("https://www.facebook.com/");
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sfdsdf@gmail.com");
				driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("fhtf");
				
				driver.findElement(By.xpath("//button[@name='login']")).click();

			}

		


	}


