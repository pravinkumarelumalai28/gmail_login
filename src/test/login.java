package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import common.Common;
import object.PageObject;

public class login extends Common {
	
	@Test
	public void loginpage() {
		
		PageFactory.initElements(driver, PageObject.class);
		PageObject.signin.click();
		PageObject.email.sendKeys(properties.getProperty("email") +Keys.ENTER);
		PageObject.password.sendKeys(properties.getProperty("password")+Keys.ENTER);
		
		
	}

}
