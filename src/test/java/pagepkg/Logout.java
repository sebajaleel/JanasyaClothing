package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"shopify-section-sections--16255079645354__0551e2c3-4916-467e-a6e9-b0d8594a3ff3\"]/header/div/div/div[3]/div/div/div")
	WebElement account;
	@FindBy(xpath="//*[@id=\"halo-auth-sidebar\"]/div[2]/ul/li[4]/a/span")
	WebElement signout;
	public Logout(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void logout()
	{
		account.click();
		signout.click();
	}
	

}
