package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EditProfile {
	public static WebElement element = null;

	/**
	 * To choose Admin color Scheme
	 * @param driver
	 */
	public static void adminColorDefault(WebDriver driver) {
		element = driver.findElement(By.id("admin_color_fresh")); // Default Color
		element.click();
	}
	public static void adminColorLight(WebDriver driver) {
		element = driver.findElement(By.id("admin_color_light")); // Light Color
		element.click();
	}
	public static void adminColorBlue(WebDriver driver) {
		element = driver.findElement(By.id("admin_color_blue")); // Blue Color
		element.click();
	}
	public static void adminColorCoffee(WebDriver driver) {
		element = driver.findElement(By.id("admin_color_coffee")); // Coffee Color
		element.click();
	}
	public static void adminColorEctoplasm(WebDriver driver) {
		element = driver.findElement(By.id("admin_color_ectoplasm")); // Ectoplasm Color
		element.click();
	}
	public static void adminColorMidNight(WebDriver driver) {
		element = driver.findElement(By.id("admin_color_midnight")); // Midnight Color
		element.click();
	}
	public static void adminColorOcean(WebDriver driver) {
		element = driver.findElement(By.id("admin_color_ocean")); // Ocean Color
		element.click();
	}
	public static void adminColorSunrise(WebDriver driver) {
		element = driver.findElement(By.id("admin_color_sunrise")); // Sunrise Color
		element.click();
	}
	
	/**
	 * Returns First Name Element
	 * @param driver
	 * @return
	 */
	public static WebElement firstName(WebDriver driver) {
		element = driver.findElement(By.id("first_name"));
		return element;
	}
	
	/**
	 * Edit First Name
	 * @param driver
	 */
	public static void firstNameSendKeys(WebDriver driver, String text) {
		element = firstName(driver);
		element.clear();
		element.sendKeys(text);
	}
	
	/**
	 * Returns Last Name Element
	 * @param driver
	 * @return
	 */
	public static WebElement lastName(WebDriver driver) {
		element = driver.findElement(By.id("last_name"));
		return element;
	}
	
	/**
	 * Edit Last Name
	 * @param driver
	 */
	public static void lastNameSendKeys(WebDriver driver, String text) {
		element = lastName(driver);
		element.clear();
		element.sendKeys(text);
	}
	
	/**
	 * Returns Nickname Element
	 * @param driver
	 * @return
	 */
	public static WebElement nickName(WebDriver driver) {
		element = driver.findElement(By.id("nickname"));
		return element;
	}
	
	/**
	 * Edit NickName
	 * @param driver
	 */
	public static void nickNameSendKeys(WebDriver driver, String text) {
		element = nickName(driver);
		element.clear();
		element.sendKeys(text);
	}
	
	/**
	 * Returns displayName Element
	 * @param driver
	 * @return
	 */
	public static WebElement displayName(WebDriver driver) {
		element = driver.findElement(By.id("display_name"));
		return element;
	}
	
	/**
	 * Edit Display Name
	 * @param driver
	 */
	public static void displayNameFromDropDown(WebDriver driver, int value) {
		Select sel = new Select(displayName(driver));
		sel.selectByIndex(value);
	}
	
	/**
	 * Returns email Element
	 * @param driver
	 * @return
	 */
	public static WebElement email(WebDriver driver) {
		element = driver.findElement(By.id("email"));
		return element;
	}
	
	/**
	 * Edit email
	 * @param driver
	 */
	public static void emailSendKeys(WebDriver driver, String text) {
		element = email(driver);
		element.clear();
		element.sendKeys(text);
	}
	
	/**
	 * Returns Website Element
	 * @param driver
	 * @return
	 */
	public static WebElement webSite(WebDriver driver) {
		element = driver.findElement(By.id("url"));
		return element;
	}
	
	/**
	 * Edit WebSite
	 * @param driver
	 */
	public static void webSiteSendKeys(WebDriver driver, String text) {
		element = webSite(driver);
		element.clear();
		element.sendKeys(text);
	}
	
	/**
	 * Returns Description Element
	 * @param driver
	 * @return
	 */
	public static WebElement description(WebDriver driver) {
		element = driver.findElement(By.id("description"));
		return element;
	}
	
	
	/**
	 * Edit Description
	 * @param driver
	 */
	public static void descriptionSendKeys(WebDriver driver, String text) {
		element = description(driver);
		element.clear();
		element.sendKeys(text);
	}
	
	/**
	 * Click on Update Profile button
	 * @param driver
	 */
	public static void clickonUpdateProfileButton(WebDriver driver) {
		element = driver.findElement(By.id("submit"));
		element.click();
	}

	/**
	 * Gets the first Name text on the profile
	 * @param driver
	 * @return
	 */
	public static String actualFirstName(WebDriver driver) {
		element = firstName(driver);
		String string = element.getAttribute("value");
		return string;
	}
	
	/**
	 * Gets the last Name text on the profile
	 * @param driver
	 * @return
	 */
	public static String actualLastName(WebDriver driver) {
		element = lastName(driver);
		String string = element.getAttribute("value");
		return string;
	}
	
	/**
	 * Gets the Nickname text on the profile
	 * @param driver
	 * @return
	 */
	public static String actualNickName(WebDriver driver) {
		element = nickName(driver);
		String string = element.getAttribute("value");
		return string;
	}
	
	/**
	 * Gets the Display Name text on the profile
	 * @param driver
	 * @return
	 */
	public static String actualDisplayName(WebDriver driver) {
		element = displayName(driver);
		String string = new Select (element).getFirstSelectedOption().getText();
		return string;
	}
	
	/**
	 * Gets the Website text on the profile
	 * @param driver
	 * @return
	 */
	public static String actualWebsite(WebDriver driver) {
		element = webSite(driver);
		String string = element.getAttribute("value");
		return string;
	}
	
	/**
	 * Gets the description text on the profile
	 * @param driver
	 * @return
	 */
	public static String actualDescription(WebDriver driver) {
		element = description(driver);
		String string = element.getAttribute("value");
		return string;
	}
}
