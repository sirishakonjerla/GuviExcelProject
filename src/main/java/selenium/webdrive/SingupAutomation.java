package selenium.webdrive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingupAutomation {
	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guvi.in/");
		waitForFixTime(1000);
		registration();
		loginpage();
	}
	
	public static void registration() {
		
		driver.findElement(By.xpath(".//a[text()='Sign up']")).click();
		waitForFixTime(1000);
		driver.findElement(By.xpath(".//input[@id='name']")).sendKeys("Daksh");
		waitForFixTime(1000);
		driver.findElement(By.xpath(".//input[@id='email']")).sendKeys("sirisha21143srinu@gmail.com");
		waitForFixTime(1000);
		driver.findElement(By.xpath(".//input[@id='password']")).sendKeys("Daksh@123");
		waitForFixTime(1000);
		driver.findElement(By.xpath(".//input[@id='mobileNumber']")).sendKeys("9876432584");
		waitForFixTime(1000);
		driver.findElement(By.xpath(".//a[@id='signup-btn']")).click();
		waitForFixTime(1000);
		driver.findElement(By.xpath(".//select[@id='profileDrpDwn']/option[text()='Student']")).click();
		waitForFixTime(1000);
		driver.findElement(By.xpath(".//select[@id='degreeDrpDwn']/option[text()='Other']")).click();
		waitForFixTime(1000);
		driver.findElement(By.xpath(".//input[@id='year']")).sendKeys("2012");
		waitForFixTime(1000);
		driver.findElement(By.xpath(".//a[@id='details-btn']")).click();
		waitForFixTime(1000);
		//driver.quit();
	}
		public static  void loginpage(){
		driver.manage().window().maximize();
		driver.get("https://www.guvi.in/");
		driver.findElement(By.xpath(".//a[@id='login-btn']")).click();
		waitForFixTime(1000);
		driver.findElement(By.xpath(".//input[@id='email']")).sendKeys("sirisha143srinu@gmail.com");
		waitForFixTime(1000);
		driver.findElement(By.xpath(".//input[@id='password']")).sendKeys("Daksh@123");
		waitForFixTime(1000);
		driver.findElement(By.xpath(".//a[@id='login-btn']")).click();
		

	}
	
	
	public static void waitForFixTime(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
