package xPathPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadXpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Load URL
		driver.get("http://leaftaps.com/opentaps");
		
		
		
		//Enter Username-(Element level)
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		
		//Enter password
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		
		//Click login Button
		driver.findElementByXPath("//input[@value='Login']").click();
		
		//Click crm/sfa link
		driver.findElementByLinkText("CRM/SFA").click();
		
		//Click leads
		driver.findElementByXPath("//a[text()='Leads']").click();
		
		//Click create lead link
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		
		//Company name
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("TC");
		
		//Enter first name
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hema");
		
		Thread.sleep(2000);
		//throw new Exeption();
		
		//Enter last name
		driver.findElementByXPath("(//input[@class='inputBox'])[4]").sendKeys("Mali");
		
		//Enter parent account
		driver.findElementByXPath("//input[@ id='createLeadForm_parentPartyId']").sendKeys("518");
		
		//Choose source
		WebElement src = driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']");
		Select dd = new Select(src);
	    dd.selectByVisibleText("Employee");
	    
	    //Choose Marketing campaign
	    WebElement Marcamp = driver.findElementByXPath("//select[@id='createLeadForm_marketingCampaignId']");
	    Select dd1 = new Select(Marcamp);
	    dd1.selectByIndex(2);
	    
	    //Enter first name(local)
	     driver.findElementByXPath("//input[@id='createLeadForm_firstNameLocal']").sendKeys("H");
	   
		//Enter last name(local)
	     driver.findElementByXPath("//input[@name='lastNameLocal']").sendKeys("M");
	     
	  //Enter salutation
	   driver.findElementByXPath("//input[@id='createLeadForm_personalTitle']").sendKeys("Ms");
	   
	   //Enter date of birth
	   driver.findElementByXPath("//input[@id='createLeadForm_birthDate']").sendKeys("5/3/70");
	   
	   //Enter Title
	   driver.findElementByXPath("//input[@name='generalProfTitle']").sendKeys("MS");
	   
	   //Enter Department
	   driver.findElementByXPath("//input[@name='departmentName']").sendKeys("QA");
	   
	   //Enter Annual revenue
	   driver.findElementByXPath("//input[@name = 'annualRevenue']").sendKeys("50000");
	   
	   //Choose industry
	   WebElement indust = driver.findElementByXPath("//select[@name = 'industryEnumId']");
	   Select dd2 = new Select(indust);
	   dd2.selectByValue("IND_SOFTWARE");
	   
	   //Enter number employee
	   driver.findElementByXPath("//input[@name = 'numberEmployees']").sendKeys("5000");
	   
	   //Select ownership
	   WebElement ownrsp = driver.findElementByXPath("//select[@name = 'ownershipEnumId']");
       Select dd3 = new Select(ownrsp);
       dd3.selectByIndex(3);
       
       //Enter SIC code
       driver.findElementByXPath("//input[@name = 'sicCode']").sendKeys("521");
       
       //Enter description
       driver.findElementByXPath("//textarea[@id = 'createLeadForm_description']").sendKeys("It is a software development company");
       
       //Important note
       driver.findElementByXPath("//textarea[@id =  'createLeadForm_importantNote']").sendKeys("It's a trusted company");
       
       //Enter ticket symbol
       driver.findElementByXPath("//input[@id = 'createLeadForm_tickerSymbol']").sendKeys("t");
       
       //Select State/Province
       WebElement state = driver.findElementByXPath("//select[@id = 'createLeadForm_generalStateProvinceGeoId']");
       Select dd4 = new Select(state);
       dd4.selectByVisibleText("Arizona");
       
       //Select country
       WebElement country = driver.findElementByXPath("//td[@id = 'ext-gen620']/select");
       Select dd5 = new Select(country);
       dd5.selectByIndex(1);
	}

}
