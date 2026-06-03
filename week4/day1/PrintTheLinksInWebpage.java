package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTheLinksInWebpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch the browser
				ChromeDriver driver =new ChromeDriver();
				
				//Load the url
				driver.get("https://www.facebook.com/");
				
				driver.manage().window().maximize();
				
				
				List<WebElement> allElements = driver.findElements(By.tagName("a"));
				//  0  1    2                               42
				//[WE1,WE2,WE3, ,,,,,,,,,,,,,,,,,,,,,,,,,,WE43]
				int size = allElements.size();
				System.out.println("The size is: "+size);
				
				//To print the links
				WebElement webElement1 = allElements.get(2);
				String text1 = webElement1.getText();
				System.out.println("The link is : "+text1);
				
				//      0   1   2     42
				for (int i = 0; i < size; i++) {
					String text = allElements.get(i).getText();
					//String text = allElements.get(0).getText();
					//String text = allElements.get(1).getText();
					//String text = allElements.get(42).getText();
					System.out.println(text);
				}
				
				
				
				
				
				
				
				

			}
	}


