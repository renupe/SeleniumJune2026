package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch the browser
				ChromeDriver driver=new ChromeDriver();
				
				//Load the url
				driver.get("https://leafground.com/frame.xhtml");
				
				//Maximize the window
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//Switch to frame
				driver.switchTo().frame(0);
				
				//Click the button
				driver.findElement(By.id("Click")).click();
	}

}
