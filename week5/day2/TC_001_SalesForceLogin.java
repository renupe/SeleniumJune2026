package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_001_SalesForceLogin extends ProjectSpecificMethod {
	@Test
	public void Sales() throws InterruptedException {
		
		// Click on the toggle menu button from the left corner
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(3000);
		// Click View All
		driver.findElement(By.xpath("//button[text()='View All']")).click();
	
		Actions act = new Actions(driver);
		// click Legal Entities from App Launcher
		WebElement element = driver.findElement(By.xpath("//p[text()='Legal Entities']"));

		
		act.scrollToElement(element).perform();
		element.click();

		Thread.sleep(2000);
		// Click on the Drop down icon in the legal Entities tab
		driver.findElement(By.xpath("//button[@title='Select a List View: Legal Entities']")).click();
		
		// click on my legal entities in the drop down options
		driver.findElement(By.xpath("//span[text()='My Legal Entities']")).click();
		
		// Click on New Legal Entity
		driver.findElement(By.xpath("//div[text()='New']")).click();
		
		// Enter the company name
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Testleaf");
		
		//Enter Description as 'Salesforces'. 
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
		
		//Click on status
		WebElement element2 = driver.findElement(By.xpath("//button[@aria-label = 'Status']"));
		act.scrollToElement(element2).perform();
		driver.executeScript("arguments[0].click();",element2);
		
		//click on active
		driver.findElement(By.xpath("//span[text()='Active']")).click();
		
		//click on save
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		//get the text of the complete this field error message
		WebElement element3 = driver.findElement(By.xpath("//span[text()='Close error dialog']"));
		driver.executeScript("arguments[0].click();",element3);
		
		driver.findElement(By.xpath("//div[text()='Complete this field.']")).getText();
				


	}

}