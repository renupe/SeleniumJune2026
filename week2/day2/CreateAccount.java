package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");

		// maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Accounts")).click();
        driver.findElement(By.linkText("Create Account")).click();
        driver.findElement(By.id("accountName")).sendKeys("Niranjana");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        
        WebElement element = driver.findElement(By.name("industryEnumId"));
        Select ss=new Select(element);
        ss.selectByIndex(3);
        
        WebElement element2 = driver.findElement(By.name("ownershipEnumId"));
        Select ss1=new Select(element2);
        ss1.selectByVisibleText("S-Corporation");
        
        WebElement element3 = driver.findElement(By.id("dataSourceId"));
        Select ss2=new Select(element3);
        ss2.selectByValue("LEAD_EMPLOYEE");
        
        WebElement element4 = driver.findElement(By.id("marketingCampaignId"));
        Select ss3=new Select(element4);
        ss3.selectByIndex(6);
        
        WebElement element5 = driver.findElement(By.id("generalStateProvinceGeoId"));
        Select ss4=new Select(element5);
        ss4.selectByValue("TX");
        
        driver.findElement(By.className("smallSubmit")).click();
        driver.close();
        
        
        
        
	}

}
