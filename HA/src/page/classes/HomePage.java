package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
	public static WebElement element = null;
	

	/**
	 * Returns the search box element
	 * @param driver
	 * @return
	 */
	public static WebElement searchBox(WebDriver driver) {
		element = driver.findElement(By.className("search"));
		return element;
	}

	/**
	 * Click on search button
	 * @param driver
	 */
	public static void searchBoxSendKeys(WebDriver driver, String text) {
		element = searchBox(driver);
		element.clear();
		element.sendKeys(text);
	}
		
	/**
	 * Click on search button
	 * @param driver
	 */
	public static void clickOnSearchButton(WebDriver driver) {
		element = searchBox(driver);
		element.sendKeys(Keys.ENTER);
	}
	
	/**
	 * Click on My Account to login
	 * @param driver
	 */
	public static void clickOnMyAccount(WebDriver driver) {
		element = driver.findElement(By.xpath(".//div[@id='account']//span[text() = 'Account']"));
		element.click();
	}
	
	/**
	 * Returns the Profile Element
	 * @param driver
	 * @return
	 */
	public static WebElement profile(WebDriver driver) {
		element = driver.findElement(By.xpath(".//li[@id='wp-admin-bar-my-account']//a[contains(@class,'ab-item') and contains(@href,'wp-admin/profile')]"));
		return element;
	}

	/**
	 * To choose Edit profile
	 * @param driver
	 */
	public static void goToEditProfile(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(profile(driver)).build().perform();
		WebElement subElement = driver.findElement(By.linkText("Edit My Profile"));
		subElement.click();
	}
	
	/**
	 * To choose Log Out
	 * @param driver
	 */
	public static void clickOnLogOut(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(profile(driver)).build().perform();
		WebElement subElement = driver.findElement(By.linkText("Log Out"));
		subElement.click();
	}
	
}