package selenium.webdrive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {
	
	static WebDriver driver;
	public static void main(String[] args) {
		openUrl("https://jqueryui.com/datepicker/");
		waitForFixTime(2000);
		switchToFrameByUsingXpath(driver.findElement(By.xpath(".//iframe")));
		clickDatepicker();
		driver.close();
	}
	
	public static void switchToFrameByUsingXpath(WebElement myElement) {
		driver.switchTo().frame(myElement);
	}
	
	public static void clickDatepicker(){
		driver.findElement(By.xpath(".//input[@id='datepicker']")).click();
		driver.findElement(By.xpath(".//a[@title='Next']")).click();
		driver.findElement(By.xpath(".//a[@class='ui-state-default'][text()='22']")).click();
		System.out.println("selected date: " + driver.findElement(By.xpath(".//input[@type='text']")).getAttribute("value"));
	}
	
	public static void openUrl(String myUrl) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(myUrl);
	}
	
	public static void waitForFixTime(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
		}
	}

}
