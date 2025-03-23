package selenium.Frames;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class NestedFrames{
	public static WebDriver driver;
	public static void main (String[] args) {
	openurl("https://the-internet.herokuapp.com/nested_frames ");
	}
private static void openurl(String myUrl) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(myUrl);
	waitForTime(1000);
	switchToFrameByIdOrName("frame-top");
	int numberofFrames=driver.findElements(By.tagName("frame")).size();
	System.out.println("Total number of frames inTopFrame are::"+ numberofFrames);
	waitForTime(1000);
	switchToFrameByIdOrName("frame-left");
	waitForTime(1000);
	System.out.println("text in left frame is::" +getTextInFrame());
	waitForTime(1000);
	driver.switchTo().defaultContent();
	switchToFrameByIdOrName("frame-top");
	waitForTime(1000);
	switchToFrameByIdOrName("frame-middle");
	waitForTime(1000);
	System.out.println("text in middle frame is::" +getTextInFrame());
	waitForTime(1000);
	driver.switchTo().defaultContent();
	switchToFrameByIdOrName("frame-top");
	waitForTime(1000);
	switchToFrameByIdOrName("frame-right");
	waitForTime(1000);
	System.out.println("text in right frame is::" +getTextInFrame());
	waitForTime(1000);
	driver.switchTo().defaultContent();
	switchToFrameByIdOrName("frame-bottom");
	waitForTime(1000);
	System.out.println("text in  bottom frame is::" +getTextInFrame());
	waitForTime(1000);
	driver.switchTo().defaultContent();
	waitForTime(1000);
	switchToFrameByIdOrName("frame-top");
}		

public static void switchToFrameByIdOrName(String nameorID) {
	driver.switchTo().frame(nameorID);
}
public static void switchToFrameByIndex(int  indexNumber) {
	driver.switchTo().frame(indexNumber);
}
public static void switchToFrameByWebElement(WebElement WebElementFrame) {
	driver.switchTo().frame(WebElementFrame);
}

private static void waitForTime(int time) {
	try {
		Thread.sleep(time);
	}catch(InterruptedException e) {
	}
	}
	
	private static String getTextInFrame() {
		String textinFrame=driver.findElement(By.xpath(".//html/body")).getText();
		return textinFrame;
	}
	
	
}

		