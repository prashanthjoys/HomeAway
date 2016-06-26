package test;

import page.classes.*;
import org.junit.Test;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import junit.framework.Assert;


@SuppressWarnings("deprecation")
public class HaTest {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://store.demoqa.com";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	/*
	 * Submit an order for an Apple iPhone4s 16GB SIM-Free – Black (known issue with State drop-down, 
	 * selecting Country is adequate) and verify the Total Price: 
	 * given is correct (assume shipping cost is correct based on your choice). 
	 * You may assume prices shown on product pages are the correct price.
	 */
	
	@Test
	public void searchProduct() throws Exception {
		// Goes to Home page
		driver.get(baseUrl);

		// Search for Apple iPhone 4s black and check out
		HomePage.searchBoxSendKeys(driver, "Apple iPhone 4S 16GB SIM-Free Black");
		Thread.sleep(2000);

		HomePage.clickOnSearchButton(driver);
		Thread.sleep(2000);

		ProductPage.clickOnAddToCart(driver);
		Thread.sleep(2000);

		ProductPage.clickOnCheckOutButton(driver);

		CheckOutPage.clickOnContinue(driver);
		Thread.sleep(2000);

		// selects the country and state to calculate total price
		CheckOutPage.SelectCountry(driver, "USA");
		CheckOutPage.ShippingState(driver, "CA");
		Thread.sleep(2000);
		CheckOutPage.ClickOnCalculate(driver);
		Thread.sleep(5000);

		// Asserts total price
		String ActualPrice = CheckOutPage.totalPrice(driver);
		String ExpectedPrice = "$282.00";
		System.out.println("=====================================================");
		System.out.println("Actual price	: " + ActualPrice);
		System.out.println("Expected Price	: " + ExpectedPrice);
		Assert.assertEquals(ExpectedPrice, ActualPrice);
		System.out.println("=====================================================");
	}

	/*
	 * Verify updating your account details is saved and 
	 * retrieved after logging out and back in using the 
	 * My Account link.
	 */
	@Test
	public void manageAccount() throws Exception {
		driver.get(baseUrl);

		// Click on my account to login
		HomePage.clickOnMyAccount(driver);

		LoginPage.LoginSendKeys(driver, "prashanth");
		LoginPage.passwordSendKeys(driver, "HomeAway123456");
		LoginPage.clickonLogInButton(driver);
		Thread.sleep(2000);

		HomePage.goToEditProfile(driver);

		Thread.sleep(2000);

		EditProfile.adminColorBlue(driver);
		;
		EditProfile.firstNameSendKeys(driver, "Prashanth");
		EditProfile.lastNameSendKeys(driver, "Eswarapu");
		EditProfile.nickNameSendKeys(driver, "Shan");
		EditProfile.displayNameFromDropDown(driver, 2);
		EditProfile.emailSendKeys(driver, "peswarapu@gmail.com");
		EditProfile.webSiteSendKeys(driver, "abc.com");
		EditProfile.descriptionSendKeys(driver, "Hello! My Name is Prashanth Eswarapu");

		EditProfile.clickonUpdateProfileButton(driver);
		Thread.sleep(3000);

		HomePage.clickOnLogOut(driver);

		LogOutPage.LoginSendKeys(driver, "prashanth");
		LogOutPage.passwordSendKeys(driver, "HomeAway123456");
		LogOutPage.clickonLogInButton(driver);
		Thread.sleep(2000);

		HomePage.goToEditProfile(driver);
		Thread.sleep(2000);
		
		System.out.println("=====================================================");
		String actualFN = EditProfile.actualFirstName(driver);
		System.out.println("Actual First Name: " + actualFN);
		Assert.assertEquals("Prashanth", actualFN);

		String actualLN = EditProfile.actualLastName(driver);
		System.out.println("Actual Last Name: " + actualLN);
		Assert.assertEquals("Eswarapu", actualLN);

		String actualnickName = EditProfile.actualNickName(driver);
		System.out.println("Actual Nickname: " + actualnickName);
		Assert.assertEquals("Shan", actualnickName);

		String displayName = EditProfile.actualDisplayName(driver);
		System.out.println("Actaul Display: " + displayName);
		Assert.assertEquals("Prashanth", displayName);

		String actualUrl = EditProfile.actualWebsite(driver);
		System.out.println("Actual Website: " + actualUrl);
		Assert.assertEquals("http://abc.com", actualUrl);

		String actualDescription = driver.findElement(By.id("description")).getText();
		System.out.println("Actual Description: " + actualDescription);
		Assert.assertEquals("Hello! My Name is Prashanth Eswarapu", actualDescription);
		System.out.println("=====================================================");

	}

	/*
	 * Verify removing all items from your cart produces an empty cart message.
	 */
	@Test
	public void emptyCartMessage() throws Exception {
		driver.get(baseUrl);
		// Search for Apple iPhone 4s black and check out
		HomePage.searchBoxSendKeys(driver, "Apple iPhone 4S 16GB SIM-Free Black");
		Thread.sleep(2000);

		HomePage.clickOnSearchButton(driver);
		Thread.sleep(2000);

		ProductPage.clickOnAddToCart(driver);
		Thread.sleep(2000);

		ProductPage.clickOnCheckOutButton(driver);
		// Click on Remove product
		CheckOutPage.clickOnRemove(driver);
		String actualMessage = CheckOutPage.cartMessage(driver);
		String expectedMessage = "Oops, there is nothing in your cart.";
		System.out.println("=====================================================");
		System.out.println("Actual Message when cart is empty: "+actualMessage);
		System.out.println("Expected Message when cart is empty: "+expectedMessage);
		System.out.println("=====================================================");
		Assert.assertEquals(actualMessage, expectedMessage);
		
		
	}

	// to quit browser after the test is complete
	@After
	public void afterClass() throws Exception {
		Thread.sleep(8000);
		driver.quit();
	}

}
