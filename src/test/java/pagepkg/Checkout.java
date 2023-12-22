package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Checkout {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"cart-sidebar-checkout\"]")
	WebElement checkout;
	@FindBy(id="shipping-address1")
	WebElement address;
	@FindBy(id="TextField2")
	WebElement city;
	@FindBy(id="Select1")
	WebElement state;
	@FindBy(id="TextField3")
	WebElement pincode;
	@FindBy(id="TextField4")
	WebElement phone;
	public Checkout(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void checkout(String a,String c,String p,String m)
	{
		checkout.click();
		address.sendKeys(a);
		city.sendKeys(c);
		Select s=new Select(state);
		s.selectByValue("KL");
		pincode.sendKeys(p);
		phone.sendKeys(m);
		driver.navigate().back();
				
	}
	

}
