package miscellaneousConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class Assertions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//maximeze the window
		driver.manage().window().maximize();
		
		//load URL
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.get("https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go");
		
		//get title of the page
		//System.out.println(driver.getTitle());
        String title = driver.getTitle();
        System.out.println(title);
        
        //Assertion Syntax: Assertion.assertEquals(Actual result,"Expected result","Assert massage");
        Assert.assertEquals(title, "Bank of America | Online Banking | Log In | User ID", "Asserting page title");
        		
        //isDisplayed();-"Bank of America" Logo is displayed (true/false)
        boolean logo = driver.findElement(By.xpath("//img[@alt='Bank of America']")).isDisplayed();
        
        //Assertion
        Assert.assertTrue(logo, "logo is displayed");
        
        //isEnabled()- Get the App link is Enable(true/false)
        
        boolean getTheAppLink = driver.findElement(By.xpath("//a[@id = 'choose-device-get-the-app']/span[1]")).isEnabled();
        if(getTheAppLink==true) {
        	System.out.println("The Get the App link is Enabled");
        }else {
        	System.out.println("The Get the App link is not Enabled");
        }
        
        //isSelected();-to do this validation we can use only- RadioButton,a CheckBox & Drop-down(true/false)
        
        //1st click on the "Save this online id CheckBox"(select) then verify isSelected() otherwise else part will be work
        
        driver.findElement(By.xpath("//div[@class = 'remember-info']/input")).click();
        boolean SaveThisUserID = driver.findElement(By.xpath("//div[@class = 'remember-info']/input")).isSelected(); 
        System.out.println(SaveThisUserID);
        
        //Assertion
        Assert.assertTrue(SaveThisUserID, "SaveThisUserID CheckBox is selected");
        
        //Validation
        if(SaveThisUserID == true) {
        	System.out.println("The checkbox is selected");
        }else {
        	System.out.println("The checkbox is not selected");
        }
        
      // driver.quit();
        
        
	}

}
