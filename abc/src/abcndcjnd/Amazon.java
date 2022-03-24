package abcndcjnd;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.className("icp-nav-link-inner")).click();
		
	
		
		WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'PT')]"));
		WebElement ele1=driver.findElement(By.xpath("//span[@role='button']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(ele).click().build().perform();
		act.moveToElement(ele1).click().build().perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'Hong')]")).click();
		


		

	
	}
}
