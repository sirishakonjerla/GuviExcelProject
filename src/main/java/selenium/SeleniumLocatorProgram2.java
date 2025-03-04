package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLocatorProgram2 {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		if(title.equals(title)) {
			System.out.println("page landed on correct website");
		}
		else {
			System.out.println("page not landed on correct website");
		}
	}
	

}
