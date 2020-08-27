import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Quatarairways {

		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.gecko.driver", "D:\\Eclipse Workspace\\geckodriver.exe");
//		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//		capabilities.setCapability("marionette", true);
			
//		WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nadeesha\\Downloads\\Software\\Sel\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.qatarairways.com/en-lk/homepage.html");
		Thread.sleep(1000);
		//driver.findElement(By.id("T7-from")).click();
		driver.findElement(By.xpath("//input[@id='T7-from']")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("T7-from")).sendKeys("ath");

		Thread.sleep(1000);

		driver.findElement(By.id("T7-from")).sendKeys(Keys.ARROW_DOWN);

		Thread.sleep(1000);

		driver.findElement(By.id("T7-from")).sendKeys(Keys.ENTER);

		Thread.sleep(1000);

		WebElement desti = driver.findElement(By.id("T7-to"));
		desti.sendKeys("can");

		Thread.sleep(1000);

		int i=1;
		while(i<5)
		{
		desti.sendKeys(Keys.ARROW_DOWN);
		i++;

		}
		 
		desti.sendKeys(Keys.ENTER);


		driver.findElement(By.xpath("//td[@data-completedate='24 Jul 2020']")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//td[@data-completedate='21 Aug 2020']")).click();

		Thread.sleep(1000);

		driver.findElement(By.id("T7-passengers")).click();
		
		Select dropdown = new Select(driver.findElement(By.id("T7-passengers")));
		dropdown.selectByVisibleText("4");
		

		Thread.sleep(1000);


		Select adult = new Select(driver.findElement(By.xpath("//span[@class='custom-select-opener selected'][contains(.,'1')]")));

		adult.selectByValue("3");

		Thread.sleep(1000);


		}

		}

