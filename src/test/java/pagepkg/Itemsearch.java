package pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itemsearch {
	WebDriver driver;
	@FindBy(id="Layer_1")
	WebElement searchicon;
	@FindBy(id="Search-In-Modal")
	WebElement searchbox;
	public Itemsearch(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void search(String s)
	{
		searchbox.click();
		searchbox.sendKeys(s);
		searchicon.click();
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,300)");
	}
}
