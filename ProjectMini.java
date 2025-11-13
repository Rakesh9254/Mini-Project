package Project01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Mini Project - Amazon India Website Testing
 *
 * This test class contains automated test cases for verifying basic functionality
 * of the Amazon India website using Selenium WebDriver and TestNG.
 *
 * @author Rakesh Kumar Roshan
 * @date 08/12/2023
 * @version 1.0
 */
public class ProjectMini {

	WebDriver driver;

	/**
	 * Setup method that runs before each test method.
	 * Initializes the ChromeDriver, navigates to Amazon India website,
	 * maximizes the browser window, and sets implicit wait timeout.
	 */
	@BeforeMethod
	public void Setup() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	/**
	 * Test Case: TC_VerifyTitle_01
	 * Test Scenario: Verify that the Amazon India website title matches the expected title.
	 *
	 * Steps:
	 * 1. Open the Amazon India website using the provided URL
	 * 2. Get the actual title of the web page
	 * 3. Assert that the actual title and expected title are equal
	 *
	 * Expected Result: The test case should pass and confirm that the title is correct.
	 */
	@Test
	public void VerifyTitle() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(ActualTitle, ExpectedTitle, "Title verification failed!");
	}

	/**
	 * Test Case: TC_VerifyTitle_02
	 * Test Scenario: Verify that the Amazon logo is displayed on the homepage.
	 *
	 * Steps:
	 * 1. Open the Amazon India website using the provided URL
	 * 2. Locate the element with the ID 'nav-logo-sprites'
	 * 3. Use the isDisplayed() method to check if the element is visible
	 * 4. Assert that the element is displayed (True)
	 *
	 * Expected Result: The test case should pass and confirm that the logo is visible.
	 */
	@Test
	public void VerifyLogo() {
		Boolean flag = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();
		Assert.assertTrue(flag, "Amazon logo is not displayed!");
	}

	/**
	 * Teardown method that runs after each test method.
	 * Closes the browser and cleans up the WebDriver instance.
	 */
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
