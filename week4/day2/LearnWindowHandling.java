package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch the browser
				ChromeDriver driver=new ChromeDriver();
				
				//Load the url
				driver.get("https://leafground.com/window.xhtml");
				
				//Maximize the window
				driver.manage().window().maximize();
				
				//Click on the Open button
				driver.findElement(By.xpath("//span[text()='Open']")).click();
				
				String parentAddress = driver.getWindowHandle();
				System.out.println("The parent address is: "+parentAddress);
				//230588F5E8B7BB1D099094031D22B7D8
				//8A7E58C742D9350F2DE3AEDA26BD7FCE
				//Step1:
				Set<String> allAddress = driver.getWindowHandles();
				System.out.println("The address is: "+allAddress);
				//               0                             1
				//[F862BBC93877EBA35D43A522C1047CAB, 0E92EA314F0FC7F8AAC6D0B8593D6C8D]
				
				//Step2: Convert to List
				List<String> address=new ArrayList<String>(allAddress);
				//String string = address.get(1);
				
				String titleBeforeSwitching = driver.getTitle();
				System.out.println(titleBeforeSwitching);
				
				//Switch the driver focus to the Child window
				driver.switchTo().window(address.get(1));
				
				String titleAfterSwitching = driver.getTitle();
				System.out.println(titleAfterSwitching);
				
				driver.switchTo().window(address.get(0));
				
				driver.close();
				//driver.quit();
				
				String title = driver.getTitle();
				System.out.println(title);
				
	}

}
