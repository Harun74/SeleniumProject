package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingPriority {
	
	public ChromeDriver driver;
	
	@BeforeMethod
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		//load URL
		driver.get("http://leaftaps.com/opentaps");
		//maximize
		driver.manage().window().maximize();
		//implicitely wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	  driver.findElementByCssSelector(".top>input").sendKeys("DemoSalesManager");
	 //Enter password
	 driver.findElementByCssSelector("label[for='password']+input").sendKeys("crmsfa");
	 //Click login button
	 driver.findElementByCssSelector("input[type='submit']").click();
	 //Click CRM/SFA link
	 driver.findElementByLinkText("CRM/SFA").click();  
	  Thread.sleep(3000);
	 }
	
	@Test(priority = 1)
	public void editlead() {
		//Click leads link
		driver.findElementByLinkText("Leads").click();
		//click Find leads link
		driver.findElementByLinkText("Find Leads").click();
		//enter first name
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hema");
		//click Find lead button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
	}
	 @Test(priority = 0)
	 public void createLead() throws InterruptedException {
		 
		//Click leads 
		driver.findElementByLinkText("Leads").click();
		//Click create lesd link
		driver.findElementByLinkText("Create Lead").click();
		//enter company name
		driver.findElementByCssSelector("#createLeadForm_companyName").sendKeys("TCS");
		//enter first name
	   driver.findElementByCssSelector("#createLeadForm_firstName").sendKeys("Hema");
	  //enter last name
	   driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("Mali");
	    Thread.sleep(3000);
	  }
	  @Test(priority = 2)
	  public void deleteLead() {
		  
		// click Leads
			driver.findElementByLinkText("Leads").click();
			// click Find lead link
			driver.findElementByLinkText("Find Leads").click();
			// click on phone
			driver.findElementByXPath("//span[text()='Phone']").click();
			
			// enter phone number(areaCode)
			driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("201");
			// enter phone number
			driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("1234567");
			// click on email
			 driver.findElementByXPath("//span[text()='Email']").click();
			// enter email address
		   driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("abc@abc.com");
	  }
	  @Test
	  public void mergeLead() {
		  System.out.println("mergeLead");
	  }
	  
	  @AfterMethod
	  public void closeBrowser() {
		  driver.close();
	  }

}
