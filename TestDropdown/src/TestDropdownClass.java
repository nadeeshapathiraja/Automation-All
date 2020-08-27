//Using Select class for selecting value from dropdown  
//Select dropdown = new Select(driver.findElement(By.id("testingDropdown")))
//dropdown.selectByVisibleText("Database Testing")

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropdownClass {

	public static void main(String[] args) throws Exception {
		
		 // System Property for Chrome Driver   
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nadeesha\\Downloads\\Software\\Sel\\chromedriver_win32\\chromedriver.exe");

		// open chrome
		WebDriver driver = new ChromeDriver();

		// Launch Website
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		Thread.sleep(1000);
		
		//Maximize the browser  
        driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Using Select class for selecting value from dropdown  
		Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
		
	//for Dropdown list test
		//dropdown.selectByVisibleText("Database Testing");
		dropdown.selectByValue("Manual");
		Thread.sleep(5000);
		
	//Button Click	
		driver.findElement(By.id("idOfButton")).click();
		Thread.sleep(5000);
		
	//Radio Button
		int a = driver.findElements(By.xpath("//input [@name='gender']")).size();
		for(int i=1;i<=a;i++)  
        {  
            driver.findElements(By.xpath("//input[@name='gender']")).get(0).click();  
        } 
		Thread.sleep(5000);
		
		
		

		// Close the Browser
		driver.close();

	}
}
