package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
public static void main(String...args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\BrowerDrivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://formy-project.herokuapp.com/scroll");
	//
	WebElement name=driver.findElement(By.id("name"));
	Actions actions = new Actions(driver);
	actions.moveToElement(name);
	name.click();
	name.sendKeys("Wei Wei");
	
	WebElement date=driver.findElement(By.id("date"));
	date.sendKeys("01/01/2022");
	//
	Thread.sleep(2000);
	driver.quit();
}
}
