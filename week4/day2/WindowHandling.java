package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(opt);
	
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.xpath("(//label[text()='FLIGHTS'])[2]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String>address= new ArrayList<String>(windowHandles);
		driver.switchTo().window(address.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(address.get(0));
		driver.close();
		
		
		
		
		
		
		
		
		

	}

}
