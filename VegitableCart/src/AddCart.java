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
		
//		WebElement VegName = driver
//				.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
//		
//		WebElement AddBtn = driver
//				.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]"));
//		
//		Thread.sleep(1000);
//		
//		WebElement VegName2 = driver
//				.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[4]"));
//		
//		WebElement AddBtn2 = driver
//				.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[3]/button[1]"));
//		
//		Thread.sleep(1000);
//		
//		Actions actions = new Actions(driver);
//		actions.moveToElement(VegName).moveToElement(AddBtn).click().perform();
//		actions.moveToElement(VegName2).moveToElement(AddBtn2).click().perform();
//		
		String[] vegitables = {"1", "5","15","20"};
		for (int i = 1; i < vegitables.length; i++) {
			WebElement btn = driver
					.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div["+vegitables[i]+"]/div[3]/button[1]"));
			Actions actions = new Actions(driver);
			actions.moveToElement(btn).click().perform();
			Thread.sleep(500);
		}
//		List<WebElement> VegNames = driver.findElements(By.className("products"));
//		int VegNameSize = VegNames.size();
//		System.out.println(VegNameSize);
//		
//		for(int i=0;i<VegNameSize;i++) {
//			
//			Point vegiproductName = VegNames.get(i).getLocation();
//			System.out.print(vegiproductName);
//			WebElement VegName = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[i]"));
//			Thread.sleep(1000);
//			
//			WebElement AddBtn = driver
//					.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]"));
//			
//			Actions actions = new Actions(driver);
//			actions.moveToElement(VegName).moveToElement(AddBtn).click().perform();
//		}
//		
//		String[] vegitables = {"Brocolli", "Beans"};
//		for(int i=0;i<VegNameSize;i++) {
////			System.out.println(VegNames.get(i).getText());
//			for(int j=0;j<vegitables.length;j++) {
//				if(VegNames.get(i).getText().equals(vegitables[j])) {
//					System.out.println("Yes");
////					System.out.println(VegNames.get(i).getText());
//					
//					WebElement AddBtn = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[i]/div[3]/button[1]"));
//					Actions actions = new Actions(driver);
//					actions.moveToElement(AddBtn).click().perform();
//					Thread.sleep(5000);
//				}
//			}
			
			
		}
		
		
		
//		Thread.sleep(10000);
//		// Close the Browser
//		driver.close();

	}


