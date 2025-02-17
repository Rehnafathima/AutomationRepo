package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public void handlingLocators()
	{
	WebElement showMessageButton = driver.findElement(By.id("button-one"));
	driver.findElement(By.id("single-input-field"));
	driver.findElement(By.className("form-control"));
	driver.findElement(By.name("viewport"));
	driver.findElement(By.tagName("description"));
	driver.findElement(By.linkText("Simple Form Demo"));
	driver.findElement(By.partialLinkText("Simple Form"));
	driver.findElement(By.cssSelector("button[id='button-one']"));
	driver.findElement(By.cssSelector("div[class='header-top']"));
	
	driver.findElement(By.xpath("//button[@id='button-one']"));
	driver.findElement(By.xpath("//input[@id='value-a']"));
	driver.findElement(By.xpath("//button[text()='Show Message']"));
	driver.findElement(By.xpath("//button[starts-with(text(),'Show')]"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locators locator = new Locators();
		locator.initialiseBrowser();
		locator.handlingLocators();
		locator.closeandQuit();

	}

}
