package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInteractions {

	public static void main(String[] args) {
		String text="Hello";
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Click on the "Prompt Box" button to trigger the alert.
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
        //Switch to the alert and type a message in the alert box
		Alert prompt1 = driver.switchTo().alert();
		prompt1.sendKeys(text);
		prompt1.accept();
		//Retrieve the typed text from the alert and verify it.
		String text1 = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(text1);
		String[] value= text1.split(":");
		String trimmedValue = value[1].trim();
		System.out.println(trimmedValue);
		
		if(text.equals(trimmedValue)) {
			System.out.println("input and output matches");
		}
		else {
			System.out.println("input and output doesnt match");
		}
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert alert1 = driver.switchTo().alert();
		// Dismiss the alert.
		alert1.dismiss();
			
	
	}

}
