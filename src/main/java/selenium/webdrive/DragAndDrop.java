package selenium.webdrive;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DragAndDrop {
	public static WebDriver driver;
	
	public static void main (String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		waitForFixTime(1000);
		driver.switchTo().frame(driver.findElement(By.xpath(".//iframe")));
		WebElement mySourceElement = driver.findElement(By.xpath(".//div[@id='draggable']"));
		WebElement myTargetElement = driver.findElement(By.xpath(".//div[@id='droppable']"));
		String colorBefore = driver.findElement(By.xpath(".//div[@id='droppable']/p")).getCssValue("color");
		
		System.out.println("color format before drop " + colorBefore);
		
		Actions myAction =  new Actions(driver);
		myAction.dragAndDrop(mySourceElement, myTargetElement).perform();
		waitForFixTime(2000);
		String color = driver.findElement(By.xpath(".//div[@id='droppable']/p")).getCssValue("color");
		String droppable = driver.findElement(By.xpath(".//div[@id='droppable']/p")).getText();
		System.out.println("color format after drop " + color);
		System.out.println("target element text changed to " +droppable );
		driver.quit();
	}
	
	public static void waitForFixTime(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}





	


