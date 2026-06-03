package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//load the url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//switch to frame using id value
		driver.switchTo().frame("iframeResult");
		//click on the try it button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//switch to alert and accept it
		driver.switchTo().alert().accept();
		// verify the text based on the action performed
		String text = driver.findElement(By.id("demo")).getText();
		if (text.contains("OK")) {
			System.out.println(text);
		} else {
			System.out.println("not clicked the button");

		}
	}
}
