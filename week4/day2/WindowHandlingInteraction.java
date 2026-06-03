package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingInteraction {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// click on the login link
		driver.findElement(By.className("decorativeSubmit")).click();
		// click on crm/sfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Click on the Contacts button
		driver.findElement(By.linkText("Contacts")).click();
		// Click on Merge Contacts.
		driver.findElement(By.linkText("Merge Contacts")).click();
		// Click on the widget of the "From Contact"
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		// get all the open windows
		Set<String> windowHandle = driver.getWindowHandles();
		// convert to list
		List<String> win = new ArrayList<String>(windowHandle);
		// switch to new window
		driver.switchTo().window(win.get(1));
		// Click on the first resulting contact
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		// switch to main window
		driver.switchTo().window(win.get(0));
		// Click on the widget of the "To Contact"
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		// get all the open windows
		Set<String> windowHandle1 = driver.getWindowHandles();
		// convert to list
		List<String> win1 = new ArrayList<String>(windowHandle1);
		// switch to new window
		driver.switchTo().window(win1.get(1));
		// click on the second resulting contact
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		// switch to main window
		driver.switchTo().window(win1.get(0));
		// Click on the Merge button
		driver.findElement(By.linkText("Merge")).click();
		// Accept the alert
		driver.switchTo().alert().accept();
		// Verify the title of the page.
		String title = driver.getTitle();
		System.out.println(title);

	}

}
