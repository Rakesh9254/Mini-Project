package Project01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProjectMini {
	WebDriver driver;
	@BeforeMethod
	public void Setup() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Test
	public void VerifyTile() {
		String ActualTile =driver.getTitle();
		String ExpectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(ActualTile, ExpectedTitle);
	}
	@Test
	public void VerifyLogo() {
		Boolean flag =driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	
	
	
	
	
	
	@AfterMethod
	public void teradown() {
		driver.quit();
	}

}
