package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("https://leafground.com/frame.xhtml");

		// Maximize the window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Switch to the outer frame
		// driver.switchTo().frame(2);
		WebElement outerFrameEle = driver
				.findElement(By.xpath("//h5[text()=' Click Me (Inside Nested frame)']/following-sibling::iframe"));
		driver.switchTo().frame(outerFrameEle);

		// driver.switchTo().frame(0);
		driver.switchTo().frame("frame2");

		driver.findElement(By.id("Click")).click();

		// To switch to main webpage
		driver.switchTo().defaultContent();

		// To switch to the immediate parent
		driver.switchTo().parentFrame();
	}

}
