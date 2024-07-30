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

public class TC_06 
{
	@Test
	public void Validate_search_classes() throws InterruptedException
	{
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(o);
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Airline_OneWay_Page homePage = new Airline_OneWay_Page(driver);
		homePage.sourceLocation();
		homePage.sourceLocationSearch();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[@id='showOWRT']//div[@class='fss_flex depcity_colm sechver']//li[1]//div[1]//div[1]//p[1]")));
		homePage.selectSourceLocation();
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='To'])[3]")));
	
		homePage.destinationLocationSearch();
		homePage.selectDestinationLocation();
		homePage.nextMonth();
		homePage.selectDepartureDate();
		
		//economy class
		homePage.searchFlights();
		driver.navigate().back();
	
		//Premium Economy
		homePage.travellersAndClass();
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lbpEconomy']")));
		homePage.premiumClass();
		homePage.done();
		homePage.searchFlights();
		driver.navigate().back();
		
		//business class
		homePage.travellersAndClass();
		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lbBusiness']")));
		homePage.businessClass();
		homePage.done();
		homePage.searchFlights();
		driver.navigate().back();
		
		//first class
		homePage.travellersAndClass();
		WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lbFirst']")));
		homePage.firstClass();
		homePage.done();
		homePage.searchFlights();
		
		Assert.assertEquals(homePage.assertTC06(), true, "TestCase 06 failed!");
	}
}
