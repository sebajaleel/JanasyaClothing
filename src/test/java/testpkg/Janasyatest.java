package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Accountcreation;
//import pagepkg.Accountcreation;
import pagepkg.Addcart;
import pagepkg.Checkout;
import pagepkg.Itemremove;
//import pagepkg.Itemremove;
import pagepkg.Itemsearch;
import pagepkg.Logout;
import pagepkg.Signin;

public class Janasyatest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");
		driver=new ChromeDriver(c);
		driver.get("https://www.janasya.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
	}
	@Test
	public void janasyatest() throws Exception
	{
		Accountcreation ac=new Accountcreation(driver);
		ac.accountcreation("seba", "jaleel", "sebajk@gmail.com", "seba123456");
		Signin s=new Signin(driver);
		s.signin("sebajk@gmail.com","seba123456");
		Itemsearch is=new Itemsearch(driver);
		is.search("womens");
		Addcart a=new Addcart(driver);
		a.additem1();
		a.additem2();
		Itemremove ir=new Itemremove(driver);
		ir.removeitem();
		Checkout c=new Checkout(driver);
		c.checkout("kanampully", "thrissur", "680512", "9947711344");
		Logout l=new Logout(driver);
		l.logout();
	}
}
