package alertconcept;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://leaftaps.com/opentaps/control/login");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
	
	driver.findElementById("password").sendKeys("crmsfa");
	
	driver.findElementByClassName("decorativeSubmit").click();
	
	driver.findElementByLinkText("CRM/SFA").click();
	
	//click Create lead
	driver.findElementByLinkText("Create Lead").click();
	
	//Click Merge leads
	driver.findElementByLinkText("Merge Leads").click();
	
	//Click Merge
	driver.findElementByLinkText("Merge").click();
	
	//Switch control to Alert from HTML page and get the Alert text
	String ComAlert = driver.switchTo().alert().getText();
	
	System.out.println(ComAlert);
	
	Thread.sleep(3000);
	
	//Click on OK or accept alert
	driver.switchTo().alert().accept();
	
	//Click on Cancel or dismiss alert
	//driver.switchTo().alert().dismiss();
	
	//close browser
	driver.close();
	
	
	
	
	
	
	}

}
