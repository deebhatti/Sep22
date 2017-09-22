package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get("https://facebook.com");
		
		//Adding a comment in line 20 

		driver.findElement(By.id("email")).sendKeys("batman@gmail.com"); //default polling period = 500 milli seconds

		driver.findElement(By.id("pss")).sendKeys("password");

		driver.findElement(By.id("u_0_2")).click();

		String expectedMessage = "The password that you've entered is incorrect. Forgotten password?";		
		
		
		String actualMessage = driver
				.findElement(By.cssSelector(
						"#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer > div > div > div"))
				.getText();

		if (expectedMessage.equals(actualMessage)) {
			System.out.println("Test Case Passed");
		}

		else {
			System.out.println("Test Case Failed");
		}
		
		driver.close();

	}

}
