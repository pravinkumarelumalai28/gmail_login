package common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;


public class Common {
	public static Properties properties=null ;
	public static WebDriver driver;
	String urllink;

	public Properties load_properties() throws IOException {

		FileInputStream file = new FileInputStream("C:\\Users\\Mike\\eclipse-workspace\\SimpleGmail\\config.properties");
        Properties properties = new Properties();
        properties.load(file);
        return properties;

	}
	
	@BeforeSuite
	
	public void open_browser() throws Throwable {
		
		
		load_properties();
		try {		
	String urllink = properties.getProperty("url");
		}catch(NullPointerException e) {
			
		}
	String driverlocation = properties.getProperty("driverloaction");
	String browser = properties.getProperty("browser");
	
	if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", driverlocation);
	}else {
		driver.quit();
		
	}
		
		driver = new ChromeDriver();
		driver.navigate().to(urllink);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
		
	/*public static void main(String[] args) throws IOException {
		Common obj = new Common();
		obj.open_browser();
	}*/

}
