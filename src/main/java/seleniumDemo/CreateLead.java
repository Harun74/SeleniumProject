package seleniumDemo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateLead {

	public static void main(String[] args) throws IOException {   
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
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
		//click CRM/SFa
		driver.findElementByLinkText("CRM/SFA").click();
		//click CreatLead
		driver.findElementByLinkText("Create Lead").click();
		//enter company name
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		//enter first name
		driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
		
		File sr = driver.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\harun\\snap\\image.png");
		//File dest = new File("./snap/image.png");
		
		FileUtils.copyFile(sr, dest);
		
		
		
		//enter last name
		driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
		
		File sour = driver.getScreenshotAs(OutputType.FILE);
		
		File des = new File("./snap/kutub.png");
		
		FileUtils.copyFile(sour, des);
		
		
		//Choose Source
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(src);
		dd.selectByVisibleText("Employee");
		//Enter Title
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Ms");
		//Choose Industry
		WebElement indus = driver.findElementById("createLeadForm_industryEnumId");
		Select dd2 = new Select(indus);
		dd2.selectByVisibleText("Computer Software");
		//Choose Ownership
		WebElement ownr = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dd3 = new Select(ownr);
		dd3.selectByValue("OWN_PARTNERSHIP");
		//Enter Description
		driver.findElementById("createLeadForm_description").sendKeys("TCS");
		//Enter Country Code
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("1");
		//Enter Area Code
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("682");
		//Enter Department
		driver.findElementById("createLeadForm_departmentName").sendKeys("MKT");
		//Enter Number of Employees
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
		//Enter Web URL
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("google.com");
		//Enter City
		driver.findElementById("createLeadForm_generalCity").sendKeys("DEFG");
		//Choose State/Province
		WebElement ste = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select dd4 = new Select(ste);
		dd4.selectByIndex(5);
		//Choose Country
		WebElement cout = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dd5 = new Select(cout);
		dd5.selectByVisibleText("United States");
		//Enter Zip/Postal Code
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("75061");
		//Choose Marketing Campaign
		WebElement mrkc = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd6 = new Select(mrkc);
		dd6.selectByValue("CATRQ_AUTOMOBILE");
		//Enter Phone number
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("1234567890");
		//Enter email address
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@gmail.com");
		//Click Create lead
		driver.findElementByClassName("smallSubmit").click();
		
		
		
		 
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
		
	}

}
