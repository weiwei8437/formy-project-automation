package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\BrowerDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://formy-project.herokuapp.com/datepicker");
		WebElement dateField=driver.findElement(By.id("datepicker"));
		dateField.sendKeys("03/21/2022");
		dateField.sendKeys(Keys.RETURN);

		
		Thread.sleep(2000);
		driver.quit();
	}

}
