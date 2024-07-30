package airline.project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Airline_OneWay_Page
{
	WebDriver driver;
	//click login button
	@FindBy(id = "oway")
	WebElement oneway;
	public void onew_option()
	{
		oneway.click();
	}
	
	@FindBy(xpath = "//input[@id='FromSector_show']")
	WebElement sourceLocation;

	public void sourceLocation() {
		sourceLocation.click();
	}
	@FindBy(xpath = "//li[@id='rtrip']")
	WebElement roundTrip;

	public void selectRoundTrip() {
		roundTrip.click();
	}	
	@FindBy(xpath = "(//input[@placeholder='From'])[3]")
	WebElement sourceLocationSearch;

	public void sourceLocationSearch() {
		sourceLocationSearch.sendKeys("bom");
	}
	@FindBy(xpath = "//div[@id='showOWRT']//div[@class='fss_flex depcity_colm sechver']//li[1]//div[1]//div[1]//p[1]")
	WebElement selectSourceLocation;

	public void selectSourceLocation() {
		selectSourceLocation.click();
	}
	@FindBy(xpath = "(//input[@placeholder='To'])[3]")
	WebElement destinationLocationSearch;

	public void destinationLocationSearch() {
		destinationLocationSearch.sendKeys("BLR");
	}
	
	@FindBy(xpath = "//div[@id='toautoFill']//div[@class='mflexcol']")
	WebElement selectDestinationLocation;

	public void selectDestinationLocation() {
		selectDestinationLocation.click();
	}
	
	@FindBy(id = "FromSector-mul1_show")
	WebElement sourceLocationForMultiCityTextBox;

	public void sourceLocationTextboxForMultiCity() {
		sourceLocationForMultiCityTextBox.click();
	}
	
	@FindBy(xpath = "//input[@id='a_FromSector-mul1_show']")
	WebElement sourceLocationSearchForMultiCity;
	
	public void sourceLocationSearchForMultiCity() {
		sourceLocationSearchForMultiCity.sendKeys("bom");
	}
	
	@FindBy(xpath = "//span[@id='spnMumbai']")
	WebElement selectSourceLocationForMultiCity;

	public void selectSourceLocationForMultiCity() {
		selectSourceLocationForMultiCity.click();
	}
	
	@FindBy(xpath = "//div[@id='multocity1']")
	WebElement intermediateLocationForMultiCityTextBox;
	public void intermediateLocationTextboxForMultiCity() {
		intermediateLocationForMultiCityTextBox.click();
	}
	@FindBy(xpath = "//li[@id='mcity']")
	WebElement multiCityTrip;

	public void selectMultiCityTrip() {
		multiCityTrip.click();
	}
	@FindBy(xpath = "//input[@id='a_ToSector-mul1_show']")
	WebElement intermediateLocationSearchForMultiCity;
	
	public void intermediateLocationSearchForMultiCity() {
		intermediateLocationSearchForMultiCity.click();
		intermediateLocationSearchForMultiCity.sendKeys("dxb");
	}
	
	@FindBy(xpath = "//div[@id='ToMulti1']//div[@class='mflexcol']")
	WebElement selectIntermediateLocationForMultiCity;

	public void selectIntermediateLocationForMultiCity() {
		selectIntermediateLocationForMultiCity.click();
	}
	
	@FindBy(xpath = "(//input[@placeholder='Choose Date'])[1]")
	WebElement departureDateForMultiCity;

	public void clickDepartureDateForMultiCity() {
		departureDateForMultiCity.click();
	}
	
	@FindBy(xpath = "//input[@id='ddateMul2']")
	WebElement arrivalDateForMultiCity;

	public void clickArrivalDateForMultiCity() {
		arrivalDateForMultiCity.click();
	}
	
	@FindBy(xpath = "//input[@id='ToSector-mul2_show']")
	WebElement destinationLocationForMultiCityTextBox;

	public void destinationLocationTextboxForMultiCity() {
		destinationLocationForMultiCityTextBox.click();
	}
	
	@FindBy(xpath = "//input[@id='a_ToSector-mul2_show']")
	WebElement destinationLocationSearchForMultiCity;
	
	public void destinationLocationSearchForMultiCity() {
		destinationLocationSearchForMultiCity.sendKeys("CCU");
	}
	
	@FindBy(xpath = "//div[@id='ToMulti2']//li[@onchange='ChangeCabin();']")
	WebElement selectDestinationLocationForMultiCity;

	public void selectDestinationLocationForMultiCity() {
		selectDestinationLocationForMultiCity.click();
	}
	
	@FindBy(xpath = "(//*[@alt='Arrow'])[2]")
	WebElement goToNextMonthIcon;

	public void nextMonth() {
		goToNextMonthIcon.click();
	}
	
	@FindBy(xpath = "(//li[@onclick='SelectDate(this.id)'])[15]")
	WebElement selectDepartureDate1;

	public void selectDepartureDate() {
		selectDepartureDate1.click();
	}
	
	@FindBy(xpath = "(//li[@onclick='SelectDate(this.id)'])[25]")
	WebElement selectArrivalDate1;

	public void selectArrivalDate() {
		selectArrivalDate1.click();
	}
	
	@FindBy(xpath = "//button[normalize-space()='Search']")
	WebElement searchButton;

	public void searchFlights() {
		searchButton.click();
	}
	
	@FindBy(xpath = "//div[@id='addmul2']//input[@value='Search']")
	WebElement searchButtonForMultiCityFlight;

	public void searchFlightsForMultiCity() {
		searchButtonForMultiCityFlight.click();
	}
	
	@FindBy(xpath = "(//span[normalize-space()='Cheapest'])[1]")
	WebElement cheapestSortIcon;

	public boolean assertTC04() {
		return cheapestSortIcon.isDisplayed();
	}
	
	public boolean assertTC05() {
		return cheapestSortIcon.isDisplayed();
	}
	
	public boolean assertTC06() {
		return cheapestSortIcon.isDisplayed();
	}
	
	@FindBy(xpath = "//p[@id='ptravlrNo']")
	WebElement travellersAndClassDropdown;

	public void travellersAndClass() {
		travellersAndClassDropdown.click();
	}
	
	@FindBy(xpath = "//label[@id='lbpEconomy']")
	WebElement premiumClass;

	public void premiumClass() {
		premiumClass.click();
	}
	
	@FindBy(xpath = "//label[@id='lbBusiness']")
	WebElement businessClass;

	public void businessClass() {
		businessClass.click();
	}
	
	@FindBy(xpath = "//label[@id='lbFirst']")
	WebElement firstClass;

	public void firstClass() {
		firstClass.click();
	}
	
	@FindBy(xpath = "//a[@id='traveLer']")
	WebElement doneButton;

	public void done() {
		doneButton.click();
	}
	
	public Airline_OneWay_Page(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}

}
