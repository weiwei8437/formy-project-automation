package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\BrowerDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://formy-project.herokuapp.com/fileupload");
		
		WebElement fileUploadField=driver.findElement(By.id("file-upload-field"));
		fileUploadField.sendKeys("unixemea.fdmgroup.com.txt");

		Thread.sleep(2000);

		driver.quit();
	}

}
