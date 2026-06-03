package week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAssign {

	public static void main(String[] args) throws IOException {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement element1 = driver.findElement(By.linkText("Conditions of Use & Sale"));
		Actions act = new Actions(driver);
		act.scrollToElement(element1).perform();
		System.out.println(element1.getText());
		
		File sourceElement = driver.getScreenshotAs(OutputType.FILE);
		File targetElement = new File("./Data/Amazonwebpage.png");
		FileUtils.copyFile(sourceElement, targetElement);
		
		
		File source = element1.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Data/conditions.png");
		FileUtils.copyFile(source, destination);	
		
		
		
	}

}
