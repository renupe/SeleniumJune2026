package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHoverAction {
	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("https://www.pvrcinemas.com/");

		// Maximize the window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// step1: Create an object for Actions Class
		Actions act = new Actions(driver);

		// Step2: Find the Element
		WebElement mouseHoverEle = driver.findElement(By.xpath("//span[text()='More']"));

		// Step3: Use the correct method -moveToElement - Actions Class
		act.moveToElement(mouseHoverEle).perform();

	}
}
