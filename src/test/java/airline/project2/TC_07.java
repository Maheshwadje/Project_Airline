package airline.project2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC_07 
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
		homePage.selectMultiCityTrip();
		
		//source location
		homePage.sourceLocationTextboxForMultiCity();
		homePage.sourceLocationSearchForMultiCity();
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='spnMumbai']")));
		homePage.selectSourceLocationForMultiCity();
		
		//intermediate location
		homePage.intermediateLocationTextboxForMultiCity();
		homePage.intermediateLocationSearchForMultiCity();
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ToMulti1']//div[@class='mflexcol']")));
		homePage.selectIntermediateLocationForMultiCity();
		Thread.sleep(2000);
		homePage.clickDepartureDateForMultiCity();
		
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@alt='Arrow'])[2]")));
		homePage.nextMonth();
		homePage.selectDepartureDate();
		homePage.destinationLocationTextboxForMultiCity();
		homePage.destinationLocationSearchForMultiCity();
		homePage.selectDestinationLocationForMultiCity();
		homePage.clickArrivalDateForMultiCity();
		homePage.selectArrivalDate();
		homePage.searchFlightsForMultiCity();
	}

}
