package airline.project2;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TC_03 
{
	@Test
	public void login_invalid_cred() throws InterruptedException
	{
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(o);
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		
		Airline_Home_Page homepage = new Airline_Home_Page(driver);
		homepage.loginbuttonclick();
		Thread.sleep(500);
		homepage.signupbuttonclick();
		Thread.sleep(500);
		homepage.InvalidMobilenumber();
		Thread.sleep(500);
		homepage.continuebuttonclick();
		Assert.assertEquals(homepage.Assert_TC03(), true);
	}

}
