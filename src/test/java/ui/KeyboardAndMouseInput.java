package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardAndMouseInput {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\BrowerDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/keypress");
		WebElement name=driver.findElement(By.id("name"));
		name.click();
		name.sendKeys("Wei Wei");
		
		WebElement button=driver.findElement(By.id("button"));
		button.click();
		Thread.sleep(2000);
		driver.quit();
	}

}
