package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("renu");
		driver.findElement(By.name("lastname")).sendKeys("E");
		driver.findElement(By.name("reg_email__")).sendKeys("renupriya31895@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Riya");
		
		WebElement date = driver.findElement(By.name("birthday_day"));
		Select dd = new Select(date);
		dd.selectByValue("31");
		
		WebElement mon = driver.findElement(By.id("month"));
		Select mo = new Select(mon);
		mo.selectByVisibleText("Aug");

		WebElement yea = driver.findElement(By.id("year"));
		Select yy = new Select(yea);
		yy.selectByVisibleText("1995");
		
		driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']")).click();
          




	}

}
