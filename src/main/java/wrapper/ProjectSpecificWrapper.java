package wrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificWrapper {
	
	public ChromeDriver driver;
	
	@BeforeMethod
	public void login() {

	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
	
	 driver = new ChromeDriver();
	//enter URL
	driver.get("http://leaftaps.com/opentaps/control/login");
	//maximize window
	driver.manage().window().maximize();
	//implicitly wait
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//enter Username
	driver.findElementById("username").sendKeys("DemoSalesManager");
	//enter password
	driver.findElementById("password").sendKeys("crmsfa");
	//click login
	driver.findElementByClassName("decorativeSubmit").click();
	//click CRM/SFA
	driver.findElementByLinkText("CRM/SFA").click();
	
}
	
	@AfterMethod
	public void closeDriver() {
	//Close
	driver.close();
	}
	
}