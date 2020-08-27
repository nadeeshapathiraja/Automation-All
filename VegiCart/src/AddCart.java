import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nadeesha\\Downloads\\Software\\Sel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		

		String[] vegitables = {"1", "5","15","20"};
		for (int i = 0; i < vegitables.length; i++) {
			
				WebElement text = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div["+vegitables[i]+"]/h4"));
				String value1 =text.getText();
				if(value1.equals("Brocolli - 1 Kg")) {
					System.out.println("Pass For Brocolli");
				}
				else if(value1.equals("Carrot - 1 Kg")) {
					System.out.println("Pass For Carrot");
				}
				else if(value1.equals("Appleaaa - 1 Kg")) {
					System.out.println("Pass For Apple");
				}
				else if(value1.equals("Orange - 1 Kg")) {
					System.out.println("Pass For Orange");
				}
				else {
					System.out.println("Somting Wrong in Id "+vegitables[i]+" for "+text.getText());
				}
			
			WebElement btn = driver			
					.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div["+vegitables[i]+"]/div[3]/button[1]"));
			
			Actions actions = new Actions(driver);
			actions.moveToElement(btn).click().perform();
			Thread.sleep(500);
		}
		
		Thread.sleep(10000);
		// Close the Browser
		driver.close();

			
		}

	}


