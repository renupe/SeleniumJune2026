package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://leafground.com/table.xhtml");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Count the number of rows
		//Count the number of columns
		//Retrieve a particular data
		//Retrieve a particular row
		//Retrieve a particular column
		//Retrieve a entire data
		
		//Count the number of rows
		WebElement table = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody"));
		List<WebElement> allRowElements = table.findElements(By.tagName("tr"));
		
		int rowCount = allRowElements.size();
		System.out.println("The row count is: "+rowCount);
		
		//Count the column count
		List<WebElement> allColumnEle = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[1]/td"));
		
		int columnCount = allColumnEle.size();
		System.out.println("The column count is: "+columnCount);
		
		//Row2 Data
		List<WebElement> row2Data = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[2]/td"));
		//    0    1   2        5
		//   [WE1,WE2,WE3,,,,,WE6]
		for (int i = 0; i <row2Data.size() ; i++) {
			String row2Text = row2Data.get(i).getText();
			System.out.println("The data are: "+row2Text);
		}
		
		List<WebElement> allData = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr/td"));
		for (int i = 0; i <allData.size() ; i++) {
			String allDataText = allData.get(i).getText();
			System.out.println("The all data are: "+allDataText);
		}
	}

}
