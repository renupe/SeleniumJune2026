package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSimpleAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://leafground.com/alert.xhtml");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//Step1: Switch the driver focus
		Alert simpleAlert = driver.switchTo().alert();
		
		simpleAlert.accept();
	}

}
