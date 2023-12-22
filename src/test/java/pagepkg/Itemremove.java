package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itemremove {
	WebDriver driver;
	@FindBy(id="cart-icon-bubble")
	WebElement cart;
	@FindBy(xpath="//*[@id=\"halo-cart-sidebar\"]/div[2]/cart-coupon-discount/div/div[1]/ul/li[1]/button")
	WebElement remove;
	public Itemremove(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void removeitem()
	{
		cart.click();
		remove.click();
	}

}
