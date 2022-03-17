package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\BrowerDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://formy-project.herokuapp.com/dropdown");
		
		WebElement dropDownMenu=driver.findElement(By.id("dropdownMenuButton"));
		dropDownMenu.click();
		WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));
		autocompleteItem.click();
		
//		Select dropDownSelect = new Select(dropDownMenu);//Select cannot use here cause dropDownMenu is not a select but a button. 
//		dropDownSelect.selectByIndex(0);
		
		
		Thread.sleep(2000);

		driver.quit();
	}

}
