package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage {
	public static WebElement element = null;

	/**
	 * Clicks on Continue
	 * 
	 * @param driver
	 */
	public static void clickOnContinue(WebDriver driver) {
		element = driver.findElement(By.xpath(".//div[@class='slide1']//span[text() = 'Continue']"));
		element.click();
	}

	/**
	 * Clicks on remove
	 * 
	 * @param driver
	 */
	public static void clickOnRemove(WebDriver driver) {
		element = driver
				.findElement(By.xpath(".//div[@id='checkout_page_container']//input[contains(@value, 'Remove')]"));
		element.click();
	}

	/**
	 * Gets the empty cart message
	 * @param driver
	 * @return
	 */
	public static String cartMessage(WebDriver driver) {
		element = driver.findElement(By.className("entry-content"));
		String string = element.getText();
		return string;
	}

	/**
	 * Selects A country
	 * 
	 * @param driver
	 */
	public static void SelectCountry(WebDriver driver, String text) {
		element = driver.findElement(By.id("current_country"));
		element.sendKeys(text);
	}

	/**
	 * Enters shippingState
	 * 
	 * @param driver
	 */
	public static void ShippingState(WebDriver driver, String text) {
		element = driver
				.findElement(By.xpath(".//form[@id='change_country']//input[contains(@title, 'shippingstate')]"));
		element.sendKeys(text);
	}

	/**
	 * Clicks on Submit
	 * 
	 * @param driver
	 */
	public static void ClickOnCalculate(WebDriver driver) {
		element = driver.findElement(By.xpath(".//form[@id='change_country']//input[contains(@type, 'submit')]"));
		element.click();
	}

	/**
	 * Gets the total price
	 * 
	 * @param driver
	 */
	public static String totalPrice(WebDriver driver) {
		element = driver.findElement(By.xpath(".//span[@id='checkout_total']/span"));
		String string = element.getText();
		return string;
	}
}
