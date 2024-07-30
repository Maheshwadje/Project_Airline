package airline.project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Airline_Home_Page 
{
	WebDriver driver;
	//click login button
	@FindBy(xpath = "//span[.='Login or Signup']")
	WebElement login_button;
	public void loginbuttonclick()
	{
		login_button.click();
	}
	
	@FindBy(xpath = "//span[.='Login & check bookings']")
	WebElement signup_button;
	public void signupbuttonclick()
	{
		signup_button.click();
	}
	//add valid phone number
	@FindBy(id = "txtEmail")
	WebElement enter_mb;
	public void ValidMobilenumber()
	{
		enter_mb.sendKeys("7507493834");
	}
	//add invalid phone number
	@FindBy(id = "txtEmail")
	WebElement enter_invmb;
	public void InvalidMobilenumber()
	{
		enter_invmb.sendKeys("750749383");
	}
	//click continue
	@FindBy(id = "shwotp")
	WebElement Continuebtn;
	public void continuebuttonclick()
	{
		Continuebtn.click();
	}
	//click on create my account
	@FindBy(name = "btn_Login")
	WebElement create_account;
	public void create_account_click()
	{
		create_account.click();
	}
	//login with valid password
	@FindBy(css = "#shwlgnbx")
	WebElement enter_pwd_click;
	public void pwdclick()
	{
		enter_pwd.click();
	}
	//enter password
	@FindBy(id = "txtEmail2")
	WebElement enter_pwd;
	public void pwd()
	{
		enter_mb.sendKeys("King123#");
	}
	@FindBy(xpath = "(//input[@class='_btnLogin'])[3]")
	WebElement login_click;
	public void Login_btn_click()
	{
		login_click.click();
	}
	@FindBy(id = "RegValidPhone") WebElement message;
	public boolean Assert_TC03()
	{
		return message.isDisplayed();
	}
	
	public Airline_Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}
}
