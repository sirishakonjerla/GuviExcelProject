package selenium.Frames;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindow {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows" );
		waitForFixTime(2000);
		driver.findElement(By.xpath(".//a [ text() = 'Click Here']")).click();
		String parentWindow = driver.getWindowHandle(); // Parent Window
		Set<String> allWindows = driver.getWindowHandles(); // All Windows Including Parent Window

		for (String window : allWindows) {
			if (!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				waitForFixTime(2000);
				String headingOnNewWindow = driver.findElement(By.xpath(".//h3")).getText();
				
				System.out.println("Heading on New Window is :: " + headingOnNewWindow);
				waitForFixTime(2000);
				driver.close();
			}
		}
		
		driver.switchTo().window(parentWindow);
		
	}

	public static void waitForFixTime(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
		}

	}

}
