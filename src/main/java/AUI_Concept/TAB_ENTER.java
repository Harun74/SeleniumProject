package AUI_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TAB_ENTER {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();//For chrome
		
		driver.get(" https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//facebook.com-enter email as abc@yahoo.com
		
		driver.findElementByName("email").sendKeys("abc@yahoo.com");
		
		Actions action = new Actions(driver);
		
		//By using Actions class-enter password as mukul using tab key on facebook.com
		
		Thread.sleep(3000);
		//Hit Tab key from keyboard-Tab action will perform //Enter the password in password field
		action.sendKeys(Keys.TAB).sendKeys("mukul").build().perform();//perform action
		
		//We can use Enter key after Tab-Hit enter facebook.com
		action.sendKeys(Keys.ENTER).perform();
		action.sendKeys(Keys.TAB).perform();
		
		
	

	}

}
