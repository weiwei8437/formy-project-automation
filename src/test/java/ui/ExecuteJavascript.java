package ui;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteJavascript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\BrowerDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://formy-project.herokuapp.com/modal");
		
		WebElement modalButton = driver.findElement(By.id("modal-button"));
		modalButton.click();
		Thread.sleep(2000);

		WebElement closeButton=driver.findElement(By.id("close-button"));
		WebElement okButton=driver.findElement(By.id("ok-button"));
		WebElement list[]= {closeButton,okButton};

		//modalButton.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", list);
		Thread.sleep(2000);
		driver.quit();
	}

}
