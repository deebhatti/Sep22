package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		
		driver.switchTo().frame("classFrame");
		
		driver.findElement(By.linkText("DEPRECATED")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageFrame");
		
		driver.findElement(By.linkText("ChromeOptions")).click();
		
		
		
		
	}

}
