package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLocatorProgram3 {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Artificial Intelligence");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		waitForFixTime(2000);
		driver.findElement(By.xpath("//span[text()='History']")).click();
		waitForFixTime(2000);
		System.out.println("Title of history link is ::" +driver.findElement(By.xpath("//h2[@id=History]")).getText());
	}
	
	public static void waitForFixTime(int time) {
		try {
			Thread.sleep(time);
			
		}catch(InterruptedException e) {
		e.printStackTrace();
	}

}
}