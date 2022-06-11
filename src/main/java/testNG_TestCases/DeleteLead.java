package testNG_TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteLead {

		
    @Test
    public void deleteLead() {
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
    
   // driver.close();
    	
	}

}
