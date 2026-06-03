package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterface {
	String text;

	public static void main(String[] args) throws InterruptedException {
		
		//initialize driver
	ChromeDriver driver=new ChromeDriver();
	
	//load Url
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//Search for Phones
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	//list all the phone price in a page
	Thread.sleep(2000);
	List<WebElement> elements = driver.findElements(By.className("a-price-whole"));
	
	int sz = elements.size();
	
	// to get individual Phone prices and add into list
	
	List<Integer>price= new ArrayList<Integer>();
	for (int i = 0; i < sz; i++) {
		String text = elements.get(i).getText();
		System.out.println(text);
		if(! text.isEmpty()) {
		String replaceAll1 = text.replaceAll("[^0-9]","");
		
		
		int arg = Integer.parseInt(replaceAll1);
		//String replace1 = text.replace(" ","" );
		//String replace2 = replace1.replace(",","");
		
		price.add(arg);
		
		
	}
	}
	System.out.println(price);
	
	//sort the price
	Collections.sort(price);
	
	//get the first item from the sorted list which is the least price
	int lowPrice = price.get(0);
	System.out.println(lowPrice);
	
	}

	

}
