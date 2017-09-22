package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.barnesandnoble.com/");
		
		driver.findElement(By.cssSelector("body > div.modal.focus > div > div > div.modal__header > a")).click();
		
		WebElement hobbies = driver.findElement(By.linkText("Hobbies & Collectibles"));
		
		Actions action = new Actions(driver);
		action.moveToElement(hobbies).perform();
		
		driver.findElement(By.linkText("Bestsellers")).click();
		
		
		
	}
	
	
	
	
	
	
	

}
