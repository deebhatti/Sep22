package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		driver.findElement(By.id("loginbutton")).click();
		
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept(); //.accept() emulates the action of clicking on OK/YES/Enter button
//		driver.switchTo().alert().dismiss();//.dismiss() emulates the action of clicking on No/Cancel button
		
		
		
		
		
	}

}
