package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		System.out.println(driver.getWindowHandle());
		
		
	}
}
