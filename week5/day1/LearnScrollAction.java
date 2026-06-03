package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrollAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Launch the browser
				ChromeDriver driver = new ChromeDriver();

				// Load the url
				driver.get("https://www.amazon.in/");

				// Maximize the window
				driver.manage().window().maximize();

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				Actions act=new Actions(driver);
				
				WebElement scrollElement = driver.findElement(By.linkText("Conditions of Use & Sale"));

				//action-scrollToElemet
				act.scrollToElement(scrollElement).perform();
				
	}

}
