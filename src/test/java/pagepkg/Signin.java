package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"shopify-section-sections--16255079645354__0551e2c3-4916-467e-a6e9-b0d8594a3ff3\"]/header/div/div/div[3]/div/div/div")
	WebElement accounticon;
	@FindBy(id="customer_email")
	WebElement signinemail;
	@FindBy(id="customer_password")
	WebElement signinpassword;
	@FindBy(xpath="//*[@id=\"halo-auth-sidebar\"]/div[2]/form/div[3]/input")
	WebElement signin;
	public Signin(WebDriver driver)

	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void signin(String es,String ep)
	{
		accounticon.click();
		signinemail.sendKeys(es);
		signinpassword.sendKeys(ep);
		signin.click();
		driver.navigate().refresh();
	}
	}



