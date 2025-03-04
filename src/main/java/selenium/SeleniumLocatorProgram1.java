package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLocatorProgram1 {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		
		System.out.println("current page:" +driver.getCurrentUrl());
		driver.navigate().refresh();
		driver.close();
		
	}
	
	public static void waitForFixTime(int time) {
		try {
			Thread.sleep(time);
			
		}catch(InterruptedException e) {
		e.printStackTrace();
	}

}
}
