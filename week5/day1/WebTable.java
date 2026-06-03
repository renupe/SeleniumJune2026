package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable {
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		// Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver(opt);
		// Added implicit wait to ensure the webpage elements are fully loaded

		// Load the URL
		driver.get("https://erail.in/");
		// Maximize the browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement element = driver
				.findElement(By.xpath("//div[@id='divTopMenu']/table/tbody/tr[2]/td[1]/input[@id='txtStationFrom']"));
		element.clear();
		element.sendKeys("MAS",Keys.ENTER);
		WebElement element2 = driver
				.findElement(By.xpath("//div[@id='divTopMenu']/table/tbody/tr[2]/td[3]/input[@id='txtStationTo']"));
		element2.clear();
		element2.sendKeys("MDU",Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='divTopMenu']/table/tbody/tr[1]/td[6]/input")).click();
		List<WebElement> elements = driver.findElements(By.xpath(
				"//div[@id='divTrainsList']/table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));
		int size1 = elements.size();
		System.out.println(size1);
		List<String> duplicateTrain = new ArrayList<String>();
		int count = 0;
		for (int i = 0; i < size1; i++) {

			for (int j = i + 1; j < size1; j++) {

				String text = elements.get(i).getText();
				String text2 = elements.get(j).getText();

				if (text == text2) {
					duplicateTrain.add(text);
					count++;
					//count = count + 1;
				}

			}
		}

		if (count == 0) {

			System.out.println("no duplicateTrain");
		} else {
			
			System.out.println("There are duplicate trains:"+duplicateTrain);
		}
	}
}
