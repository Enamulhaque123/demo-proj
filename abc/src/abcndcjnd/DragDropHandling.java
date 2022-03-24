package abcndcjnd;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropHandling {
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "D:\\software\\selenium\\chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	//driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	driver.get("https://jqueryui.com/droppable/");
	
	Thread.sleep(2000);
	
	WebElement dragele=driver.findElement(By.id("draggable"));
	WebElement dropele=driver.findElement(By.id("droppable"));
	
	Actions act=new Actions(driver);
	act.dragAndDrop(dragele, dropele).perform();
	
	
}

}
