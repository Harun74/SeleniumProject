package javaTC_WebDriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateLead_WebDriverWait {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//create object of ChromeDriver class
		//ClassName object = new ClassName();

		ChromeDriver driver = new ChromeDriver();
		
		
       //Load URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//verify title of the page
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		//Maximize
		driver.manage().window().maximize();
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Enter username
		//driver.findElementById("username").sendKeys("DemoSalesManager");
		
		try {driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		System.out.println("UserName enter successfully");
		}catch (Exception e) {
		System.err.println("UserName not enter successfully");
		}
		finally {
			System.out.println("username is correct");
		}
		
		//Enter password
		//driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@id = 'password']").sendKeys("crmsfa");
		
		//Click login
		//driver.findElementByClassName("decorativeSubmit").click();
		/*try {driver.findElementByXPath("//input[@value='Login']").click();
		System.out.println("login successfully");
		}catch (Exception e) {
		System.err.println("login not  successfully");
		}
		finally {
			System.out.println("login successful");
		}*/
		driver.findElementByXPath("//input[@value='Login']").click();
		
		
		//Click CRM/SFA
		//Explicitly wait
		Thread.sleep(2000);
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		//click create lead link
		driver.findElementByLinkText("Create Lead").click();

		//enter company name
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");

		//enter FirstName
		driver.findElementById("createLeadForm_firstName").sendKeys("Hema");

		//enter lastName
		driver.findElementById("createLeadForm_lastName").sendKeys("Mali");

		//enter title
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mrs");

		//enter description
		driver.findElementById("createLeadForm_description").sendKeys("It's a Software company");

		//enter department		
		driver.findElementById("createLeadForm_departmentName").sendKeys("mkt");

		//click create lead btn
		driver.findElementByName("submitButton").click();
		
		//WebdriverWait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("submitButton")));
	
		//WebDriverWait
		//WebDriverWait wait = new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.elementToBeClickable(By.name("submitButton")));
		//wait.until(ExpectedConditions.elementToBeClickable(By.name("submitButton")));

		driver.close();

                                                               
	

	}
}