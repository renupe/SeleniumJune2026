package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ErailEasyMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		// Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver(opt);
		// Load the URL
		driver.get("https://erail.in/");
		// Maximize the browser window
		driver.manage().window().maximize();
		// Added implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//Enter "MAS" as the "From" station.
		WebElement element = driver.findElement(By.id("txtStationFrom"));
		element.clear();
		element.sendKeys("MAS",Keys.ENTER);
		//Enter "MDU" as the "To" station
		WebElement element2 = driver.findElement(By.id("txtStationTo"));
		element2.clear();
		element2.sendKeys("MDU",Keys.ENTER);
		//Uncheck the "Sort on Date" checkbox
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		
		
		
		

	}

}
