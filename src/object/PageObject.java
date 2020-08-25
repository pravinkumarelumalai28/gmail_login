package object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObject {

	@FindBy(xpath="//a[@target='_blank']")
	public static WebElement signin;

	@FindBy(name="identifier")
	public static WebElement email;
	
	@FindBy(name="password")
	public static WebElement password;
}
