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

public class TC_04 
{
	@Test
	public void Search_Oneway_trip() throws InterruptedException
	{
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(o);
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Airline_OneWay_Page a1 = new Airline_OneWay_Page(driver);
		a1.sourceLocation();
		a1.sourceLocationSearch();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='showOWRT']//div[@class='fss_flex depcity_colm sechver']//li[1]//div[1]//div[1]//p[1]")));
		a1.selectSourceLocation();
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='To'])[3]")));
		a1.destinationLocationSearch();
		a1.selectDestinationLocation();
		a1.nextMonth();
		a1.selectDepartureDate();
		a1.searchFlights();
		
		Assert.assertEquals(a1.assertTC04(), true, "TestCase 04 failed!");
	}

}
