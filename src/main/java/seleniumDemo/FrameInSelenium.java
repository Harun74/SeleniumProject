package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class FrameInSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		//driver.get("https://jqueryui.com/selectable/");
		
		//driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Enter into the frame way-1
		//driver.switchTo().frame("iframeResult");
		
		//way-2
		//driver.switchTo().frame(0);
		
		//way-3 webelement
	  driver.switchTo().frame(driver.findElementByXPath("//iframe[@id='iframeResult']"));
	  
		//OR(we can do it other way)
		//WebElement iframe = driver.findElementByXPath("//iframe[@id='iframeResult']");
		//driver.switchTo().frame(iframe);
	 // System.out.println("successfully enter into the frame");
	  
	  driver.findElementByXPath("//input[@value='John']").clear();
	  //Enter first name
	  driver.findElementByXPath("//input[@value='John']").sendKeys("Tushar");
	  
	  Thread.sleep(3000);
	  driver.findElementByXPath("//input[@id='lname']").clear();
	  driver.findElementByXPath("//input[@id='lname']").sendKeys("Hasan");
	  
	  //Click submit
	  driver.findElementByXPath("//input[@value='Submit']").click();
	  
	  //Back to main/parent page
	  driver.switchTo().parentFrame();
	  
	  Thread.sleep(3000);
	  driver.close();
		
		

	}

}
