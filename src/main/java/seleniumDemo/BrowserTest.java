package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
		//enter firstname
		driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
		
		driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
		driver.findElementById("createLeadForm_birthDate").sendKeys("4/5/1978");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Hema");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Mali");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Gali");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Sen");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("9000");
		driver.findElementById("createLeadForm_departmentName").sendKeys("Education");
		driver.findElementById("createLeadForm_sicCode").sendKeys("123456");
		driver.findElementById("createLeadForm_description").sendKeys("Reform the system");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("5000");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("Nul");
		driver.findElementById("createLeadForm_importantNote").sendKeys("care");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("1");
		driver.findElementByClassName("inputBox").sendKeys("30,columbia st.");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Hudson");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("12534");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("1804");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("5188229065");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("5189667321");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("http://leaftaps.com/opentaps/control/login");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("x");
		driver.findElementByClassName("inputBox").sendKeys("same");
		driver.findElementByClassName("smallSubmit").click();
		
		
		//close browser
		driver.close();
	
		
	}


}
