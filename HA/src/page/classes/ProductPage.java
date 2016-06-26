package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
	public static WebElement element = null;

	/**
	 * Returns the buy button element
	 * @param driver
	 * @return
	 */
	public static WebElement buyButton(WebDriver driver) {
		element = driver.findElement(By.className("wpsc_buy_button"));
		return element;
	}
	
	/**
	 * Clicks on buy button
	 * @param driver
	 */
	public static void clickOnAddToCart(WebDriver driver) {
		element = buyButton(driver);
		element.click();
	}
	
	/**
	 * Returns the PopUp element
	 * @param driver
	 * @return
	 */
	public static WebElement popUp(WebDriver driver) {
		element = driver.findElement(By.className("wpsc_buy_button"));
		return element;
	}
	
	/**
	 * Clicks on go to check out
	 * @param driver
	 */
	public static void clickOnCheckOutButton(WebDriver driver) {
		element = driver.findElement(By.className("go_to_checkout"));
		element.click();
	}
	
}
