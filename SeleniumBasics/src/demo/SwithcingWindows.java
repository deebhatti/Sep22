package demo;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwithcingWindows {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/");

		driver.findElement(By.cssSelector("#cee_closeBtn > img")).click();

		// driver.findElement(By.id("loginsubmit")).click();

		Thread.sleep(5000);

		ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());

		driver.switchTo().window(windows.get(1));

		driver.findElement(By.linkText("CONTINUE TO NETBANKING")).click();

		driver.switchTo().window(windows.get(0));

	}

	//

}
