package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogOutPage {
	public static WebElement element = null;
	
	/**
	 * Returns the login element of logout page
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement login(WebDriver driver) {
		element = driver.findElement(By.id("user_login"));
		return element;
	}
	
	/**
	 * Sending keys to login field on logout page
	 * 
	 * @param driver
	 */
	public static void LoginSendKeys(WebDriver driver, String text) {
		element = login(driver);
		element.sendKeys(text);
	}

	/**
	 * Returns the password element on logout page
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement password(WebDriver driver) {
		element = driver.findElement(By.id("user_pass"));
		return element;
	}

	/**
	 * Sending keys to password field on logout page
	 * @param driver
	 */
	public static void passwordSendKeys(WebDriver driver, String text) {
		element = password(driver);
		element.sendKeys(text);
	}

	/**
	 * Click on Login button of logout page
	 * @param driver
	 */
	public static void clickonLogInButton(WebDriver driver) {
		element = driver.findElement(By.id("wp-submit"));
		element.click();
	}
}
