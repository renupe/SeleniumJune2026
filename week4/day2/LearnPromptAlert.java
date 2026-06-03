package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch the browser
				ChromeDriver driver=new ChromeDriver();
				
				//Load the url
				driver.get("https://leafground.com/alert.xhtml");
				
				//Maximize the window
				driver.manage().window().maximize();
				
				//Click prompt
				driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
				//click simple alert
				//driver.findElement(By.xpath("//span[text()='Show']")).click();
				
				//Step1: Switch the focus
				Alert promptAlert = driver.switchTo().alert();
				//promptAlert.accept();
				promptAlert.sendKeys("Vineeth");
				
				String text = promptAlert.getText();
				System.out.println(text);
				promptAlert.accept();
				
	}

}
