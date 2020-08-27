import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class test {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "D:\\Eclipse Workspace\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();//id not correct
		
		//driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		driver.findElement(By.xpath("//a[@value='CMB']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
	}

}
