package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public static WebElement element = null;

	/**
	 * Returns the login element
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement login(WebDriver driver) {
		element = driver.findElement(By.id("log"));
		return element;
	}

	/**
	 * Sending keys to login field
	 * 
	 * @param driver
	 */
	public static void LoginSendKeys(WebDriver driver, String text) {
		element = login(driver);
		element.sendKeys(text);
	}

	/**
	 * Returns the password element
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement password(WebDriver driver) {
		element = driver.findElement(By.id("pwd"));
		return element;
	}

	/**
	 * Sending keys to password field
	 * @param driver
	 */
	public static void passwordSendKeys(WebDriver driver, String text) {
		element = password(driver);
		element.sendKeys(text);
	}

	/**
	 * Click on Login button
	 * @param driver
	 */
	public static void clickonLogInButton(WebDriver driver) {
		element = driver.findElement(By.id("login"));
		element.click();
	}

}
