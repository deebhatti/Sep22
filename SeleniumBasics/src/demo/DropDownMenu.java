package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownMenu {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=6da7af7047a37e6e945e0e9a5f034a6b");
		
		WebElement country =  driver.findElement(By.name("country"));
		
		Select drpDown = new Select(country);
//		drpDown.selectByVisibleText("RUSSIA");
//		drpDown.selectByIndex(4);
		drpDown.selectByValue("9");
		
		
	}

}
