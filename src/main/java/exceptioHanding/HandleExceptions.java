package exceptioHanding;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleExceptions {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://leaftaps.com/opentaps");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	try {
		driver.findElementById("username1").sendKeys("DemoSalesManager");
	
	System.out.println("The element Username entered");
	
	}
	catch(Exception e) {
		
		System.err.println("The element Username not entered");
		
		//Thread.sleep(2000);
		
		//Create RunTime exception
		//throw new RuntimeException();
	}
		finally {
		System.out.println("The element found");	
		
		System.out.println("Test case is completed");
		}
		
	driver.findElementById("password").sendKeys("crmsfa");
		
	
	//Click login btn	
	try {	
		driver.findElementByClassName("decorativeSubmit").click();
		System.out.println("Click login button successfully");
	}catch(Exception e) {
		System.err.println("Not click on login button");
	}
	//Click CRM/SFA 
	try {
	driver.findElement(By.linkText("CRM/SFA")).click();
	System.out.println("Able to click on CRM/SFA link");
	}catch(Exception e) {
		System.err.println("Not able to click on CRM/SFA");
	}
		
	driver.close();
	
	}
	}
	
		
		
		
						

