package ui;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.ConfirmationPage;
import pages.FormPage;

public class Form {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\BrowerDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		
		FormPage formPage=new FormPage();
		FormPage.submitForm(driver);
		ConfirmationPage confirmationPage=new ConfirmationPage();
		ConfirmationPage.waitForAlertBanner(driver);
		assertEquals("The form was successfully submitted!", ConfirmationPage.getAlertBannerText(driver));

		Thread.sleep(2000);
		driver.quit();
	}

//	public static void submitForm(WebDriver driver) {
//		driver.findElement(By.id("first-name")).sendKeys("John");
//		driver.findElement(By.id("last-name")).sendKeys("Doe");
//		driver.findElement(By.id("job-title")).sendKeys("QA Engineer");
//		driver.findElement(By.id("radio-button-2")).click();
//		driver.findElement(By.id("checkbox-2")).click();
//		driver.findElement(By.cssSelector("option[value='1']")).click();
//		driver.findElement(By.id("datepicker")).sendKeys("05/28/2022");
//		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
//		driver.findElement(By.xpath("//*[contains(@class,'btn-primary')]")).click();
//
//	}

//	public static void waitForAlertBanner(WebDriver driver) {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class,'alert-success')]"))));
//
//	}
//	public static String getAlertBannerText(WebDriver driver) {
//		return driver.findElement(By.xpath("//*[contains(@class,'alert-success')]")).getText();
//
//	}
}
