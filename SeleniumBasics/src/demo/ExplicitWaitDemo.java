package demo;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class ExplicitWaitDemo {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		driver.findElement(By.cssSelector("#start > button")).click();
		
		String expectedText = "Hello World!";
		
		//WebDriverWait wait = new WebDriverWait(driver,10);//polling peroid = 500 milli seconds
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).
				withTimeout(30, TimeUnit.SECONDS).
				pollingEvery(2, TimeUnit.SECONDS).
				ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4")));
		
		String actualText = driver.findElement(By.cssSelector("#finish > h4")).getText();
		System.out.println(actualText);
		
		if(expectedText.equals(actualText)){
			System.out.println("Test case Passed");
		}
		
		else {
			System.out.println("Test Case Failed");
		}
		
		
	}

}
