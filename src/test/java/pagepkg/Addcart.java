package pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addcart {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"main-collection-product-grid\"]/li[1]/div/div/div[1]/div/div[2]/a")
	WebElement item1;
	@FindBy(id="product-add-to-cart")
	WebElement addcart1;
	@FindBy(id="halo-cart-sidebar")
	WebElement viewcart;
	@FindBy(xpath="//*[@id=\"main-cart-items\"]/div/div[2]/form/div/div/a")
	WebElement continueshopping;
	@FindBy(id="main-collection-product-grid")
	WebElement item2;
	@FindBy(id="product-add-to-cart")
	WebElement addcart2;
	public Addcart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void additem1()
	{
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,300)","");
		item1.click();
		addcart1.click();
		Actions a=new Actions(driver);
		a.moveToElement(viewcart);
		viewcart.click();
		continueshopping.click();
		driver.navigate().back();
	}
	public void additem2()
	{
		item2.click();
		addcart2.click();
	}
}
