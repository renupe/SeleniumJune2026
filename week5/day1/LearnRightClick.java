package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnRightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		// Maximize the window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Actions act = new Actions(driver);

		WebElement rightClickEle = driver.findElement(By.xpath("//span[text()='right click me']"));

		// Right click-contextClick
		act.contextClick(rightClickEle).perform();

	}
}
