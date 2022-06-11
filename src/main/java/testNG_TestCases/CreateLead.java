package testNG_TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead {

	//public static void main(String[] args) {
	
	@Test
	public void createLead() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		  ChromeDriver driver = new ChromeDriver();
		  //Load URL
		  driver.get("http://leaftaps.com/opentaps/control/login");
		  //Maximize window
		  driver.manage().window().maximize();
		  
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 //Enter username
		 driver.findElementByCssSelector(".top>input").sendKeys("DemoSalesManager");
		 //Enter password
		 driver.findElementByCssSelector("label[for='password']+input").sendKeys("crmsfa");
		 //Click login button
		 driver.findElementByCssSelector("input[type='submit']").click();
		 //Click CRM/SFA link
		 driver.findElementByLinkText("CRM/SFA").click();
		 //Click Leads link
		 driver.findElementByLinkText("Leads").click();
		 //Click create lead link
		 driver.findElementByPartialLinkText("Create ").click();
		 //Company name;
		 driver.findElementByCssSelector("#createLeadForm_companyName").sendKeys("TCS");
		 //Enter first name
		 driver.findElementByCssSelector("#createLeadForm_firstName").sendKeys("Hema");
		 
		 Thread.sleep(2000);
		 
		 //Enter last name
		 driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("Mali");
		 //Enter first name local
		 driver.findElementByCssSelector("input[name='firstNameLocal']").sendKeys("H");
		 //Enter last name local
		 driver.findElementByCssSelector("input[name='lastNameLocal']").sendKeys("M");
		 //Enter salutation
		 driver.findElementByCssSelector("input[name='personalTitle']").sendKeys("Ms");
		 //Enter title
		 driver.findElementByCssSelector("#createLeadForm_generalProfTitle").sendKeys("MS");
		 //Enter Annual revenue
		 driver.findElementByCssSelector("input[name='annualRevenue']").sendKeys("1000");
		 //Enter SIC code
		 driver.findElementByCssSelector("input[name='sicCode']").sendKeys("1010");
		 //Enter description
	    driver.findElementByCssSelector("#createLeadForm_description").sendKeys("It is a software development company");
		//Enter important note 
	    driver.findElementByCssSelector("textarea[name='importantNote']").sendKeys("It's a trusted company");
	    //Enter country code
	    driver.findElementByCssSelector("input[value='1']").sendKeys("0088");
	    //Enter area code
	    driver.findElementByCssSelector("#createLeadForm_primaryPhoneAreaCode").sendKeys("999");
	    //Enter phone number
	    driver.findElementByCssSelector("#createLeadForm_primaryPhoneNumber").sendKeys("9172348765");
	    //Enter extension
	    driver.findElementByCssSelector("input[name='primaryPhoneExtension']").sendKeys("121");
	    //Enter department
	    driver.findElementByCssSelector("#createLeadForm_departmentName").sendKeys("QA");
	    //Enter number of employees
	    driver.findElementByCssSelector("#createLeadForm_numberEmployees").sendKeys("2000");
	    //Enter Ticker symbol
	    driver.findElementByCssSelector("#createLeadForm_tickerSymbol").sendKeys("TK");
	    //Enter person to ask for
	    driver.findElementByCssSelector("#createLeadForm_primaryPhoneAskForName").sendKeys("Hema");
	    //Enter Web URL
	    driver.findElementByCssSelector("input[name='primaryWebUrl']").sendKeys("www.google.com");
	    //Enter To name
	    driver.findElementByCssSelector("#createLeadForm_generalToName").sendKeys("M");
	    //Enter address Line 1 and 2
	    driver.findElementByCssSelector("input[id^=createLeadForm_generalAddress1]").sendKeys("25 Green St");
	    //address Line 2
	    driver.findElementByCssSelector("input[name$=s2]").sendKeys("APT 55");
	    //Enter city
	    driver.findElementByCssSelector("input[id*=createLeadForm_generalCi]").sendKeys("War");
	    //Enter Zip/postal code
	    driver.findElementByCssSelector("#createLeadForm_generalPostalCode").sendKeys("52135");
	    //Enter Zip/postal code extension
	    driver.findElementByCssSelector("input[id^=createLeadForm_generalPostalCodeE]").sendKeys("333");
	    //Enter email address
	    driver.findElementByCssSelector("#createLeadForm_primaryEmail").sendKeys("hema_77@gmail.com");
	    //Chose State/Province
	    WebElement element1 = driver.findElementByCssSelector("#createLeadForm_generalStateProvinceGeoId");
	    Select dd1 = new Select(element1);
	    dd1.selectByVisibleText("Texas");
	    //Choose source
	    WebElement src = driver.findElementByCssSelector("#createLeadForm_dataSourceId");
	             Select dd2 = new Select(src);
	             dd2.selectByVisibleText("Website");
	    //Choose industry
	    WebElement ind = driver.findElementByCssSelector("#createLeadForm_industryEnumId");
	           Select dd3 = new Select(ind);
	           dd3.selectByVisibleText("Health Care");
	     WebElement ownr = driver.findElementByCssSelector("#createLeadForm_ownershipEnumId");
	          Select dd4 = new Select(ownr);
	          dd4.selectByVisibleText("Partnership");
	    //Enter Create lead
	    driver.findElementByCssSelector(".smallSubmit").click();
	    //Verify the first name(for verifying first name, we use getText() and stored the value in firstName and print)
	    String firstName = driver.findElementByCssSelector("#viewLead_firstName_sp").getText();
	    System.out.println(firstName );
	    
	   //System.out.println("Element not found");
	   
	  /* if(firstName.equals("Hema")) {System.out.println("Name is Matched");
	   }else {System.out.println("Not Match");
	   }*/
	   
	   driver.close();
			
		
		
		
		
		
	

	}

}
