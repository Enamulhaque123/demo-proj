package abcndcjnd;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHandling1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		Actions act=new Actions(driver);
		
		WebElement fashion=driver.findElement(By.xpath("//div[text()='Fashion']"));
		act.moveToElement(fashion).perform();;
	
		
		
	
	}
}
