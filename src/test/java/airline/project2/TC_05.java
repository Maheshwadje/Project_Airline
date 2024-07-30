package airline.project2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_05 
{
	@Test
	public void Search_round_trip() throws InterruptedException
	{
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(o);
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Airline_OneWay_Page homePage = new Airline_OneWay_Page(driver);		
		homePage.selectRoundTrip();
		homePage.sourceLocation();
		homePage.sourceLocationSearch();
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='showOWRT']//div[@class='fss_flex depcity_colm sechver']//li[1]//div[1]//div[1]//p[1]")));
		homePage.selectSourceLocation();
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='To'])[3]")));
		homePage.destinationLocationSearch();
		homePage.selectDestinationLocation();
		
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@alt='Arrow'])[2]")));
		homePage.nextMonth();
		homePage.selectDepartureDate();
		homePage.selectArrivalDate();
		homePage.searchFlights();
		
		Assert.assertEquals(homePage.assertTC05(), true, "TestCase 05 failed!");
		}
}
