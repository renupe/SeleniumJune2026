package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		
		
		// Launch Chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		// Load the URL
		driver.get("https://www.facebook.com/");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//enter invalid username
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		
		//enter invalid password
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		//Click on Login
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.linkText("Find your account and log in.")).click();
		
		//Print the title
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		

	}

}
