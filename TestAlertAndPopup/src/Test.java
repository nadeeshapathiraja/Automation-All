import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Alert;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		String path = System.setProperty("webdriver.gecko.driver", "D:\\Eclipse Workspace\\geckodriver.exe");
		/*
		 * DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		 * capabilities.setCapability("marionette", true);
		 */

		WebDriver driver = new FirefoxDriver();
		

		// WebDriver driver= new FirefoxDriver(capabilities);

		// Launch Website
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		Thread.sleep(5000);
		// Handling alert boxes
		// Click on generate alert button
		driver.findElement(By.xpath("//button[contains(text(),'Generate Alert Box')]")).click();
		
		Thread.sleep(5000);

		// Using Alert class to first switch to or focus to the alert box
		Alert alert = (Alert) driver.switchTo().alert();
		System.out.println(driver.switchTo().alert().getText());
		

		// Using accept() method to accept the alert box
		alert.accept();
		Thread.sleep(5000);
		
		
		// Handling confirm box
		// Click on Generate Confirm Box
		driver.findElement(By.xpath("//button[contains(text(),'Generate Confirm Box')]")).click();
		Thread.sleep(5000);

		Alert confirmBox = (Alert) driver.switchTo().alert();
		System.out.println(driver.switchTo().alert().getText());
		String text = driver.switchTo().alert().getText();
		String realtext = "Press a button!";
		if(realtext.equals(text)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		// Using dismiss() command to dismiss the confirm box
		// Similarly accept can be used to accept the confirm box
		((Alert) confirmBox).dismiss();
		
		//Wait 10 Seconds & Close the Browser
		Thread.sleep(50000);
		driver.close();

	}

}
