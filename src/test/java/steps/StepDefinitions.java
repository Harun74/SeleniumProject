package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	ChromeDriver driver;
	
	@Given("Launch ChromeBrowser and load URL")
	public void launchChromeBrowserAndLoadURL() {
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		//enter URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//maximize window
		driver.manage().window().maximize();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Given("Enter username as DemoSalesManager")
	public void enterUsernameAsDemoSalesManager() {
	driver.findElementById("username").sendKeys("DemoSalesManager");  
	}

	@Given("Enter Password as crmsfa")
	public void enterPasswordAsCrmsfa() {
	driver.findElementById("password").sendKeys("crmsfa");
	}

	@When("Click the login button")
	public void ClickTheLoginButton() {
	driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("It's navigated Homepage")
	public void itSNavigatedHomepage() {
	 System.out.println(driver.getTitle());   
	}

	@Then("Click the logout button")
	public void clickTheLogoutButton() {
	driver.findElementByClassName("decorativeSubmit").click();  
	}

	@Then("Close browser")
	public void closeBrowser() {
	driver.close();
	}

	@Given("Enter username as harun")
	public void enterUsernameAsHarun() {
    driver.findElementById("username").sendKeys("harun");
	}

	@Then("It's navigated same page")
	public void itSNavigatedSamePage() {
	System.out.println(driver.getTitle());
	}

	@Then("Verify error massage")
	public void verifyErrorMassage() {
	String text = driver.findElementById("errorDiv").getText(); 
	System.out.println(text);
	if(text.contains("following error occured during login")) {
		System.out.println("Error massage is contains");
	}else {System.out.println("Error massage not contains");
	}
	}
		@Given("Click CRMSFA")
	public void clickCRMSFA() {
	driver.findElementByLinkText("CRM/SFA").click();   
	}

	@Given("Click leads link")
	public void clickLeadsLink() {
	driver.findElementByLinkText("Leads").click();   
	}

	@When("Click createLead")
	public void clickCreateLead() {
	driver.findElementByLinkText("Create Lead").click();
	}

	@When("Enter the company  as ABC")
	public void enterTheCompanyAsABC() {
	driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
	}

	@When("Enter the firstname as Hema")
	public void enterTheFirstnameAsHema() {
	driver.findElementById("createLeadForm_firstName").sendKeys("Hema");   
	}

	@When("Enter the lastname as Mali")
	public void enterTheLastnameAsMali() {
	driver.findElementById("createLeadForm_lastName").sendKeys("Mali");   
	}

	@When("Choose source as Website")
	public void chooseSourceAsWebsite() {
	WebElement src = driver.findElementById("createLeadForm_dataSourceId"); 
	Select dd1 = new Select(src);
	dd1.selectByVisibleText("Website");   
	}

	@When("Click the create lead button")
	public void clickTheCreateLeadButton() {
	driver.findElementByClassName("smallSubmit").click();
	}

	@Then("It's navigated ViewLeadPage")
	public void itSNavigatedViewLeadPage() {
	System.out.println(driver.getTitle());
	}

	@Then("Verify the firstname")
	public void verifyTheFirstname() {
	 String fName = driver.findElementById("viewLead_firstName_sp").getText();
	System.out.println(fName);
	 if(fName.equals("Hema")) {System.out.println("First name is matched");
	}else {System.out.println("First name is not matched");
		  
	}

	 	}
}


