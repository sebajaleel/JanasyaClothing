package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accountcreation {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"shopify-section-sections--16255079645354__0551e2c3-4916-467e-a6e9-b0d8594a3ff3\"]/header/div/div/div[3]/div/div/div")
	WebElement accounticon;
	@FindBy(xpath="//*[@id=\"halo-auth-sidebar\"]/div[2]/form/div[3]/a[2]")
	WebElement create;
	@FindBy(id="RegisterForm-FirstName")
	WebElement fname;
	@FindBy(id="RegisterForm-LastName")
	WebElement lname;
	@FindBy(id="RegisterForm-email")
	WebElement email;
	@FindBy(id="RegisterForm-password")
	WebElement password;
	@FindBy(xpath="//*[@id=\"create_customer\"]/div[6]/input")
	WebElement submit;
	public Accountcreation(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void accountcreation(String f,String l,String e,String p)
	{
		accounticon.click();
		create.click();
		fname.sendKeys(f);
		lname.sendKeys(l);
		email.sendKeys(e);
		password.sendKeys(p);
		submit.click();
	}
}
