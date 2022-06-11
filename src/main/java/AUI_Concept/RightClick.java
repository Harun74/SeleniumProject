package AUI_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get(" https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Select Right click element and store it in a variable
		WebElement rightclick = driver.findElementByXPath("//span[text()='right click me']");
		
		//Create Actions class object and pass the driver
		Actions action = new Actions(driver);
		
		//Perform Right click
		action.contextClick(rightclick).perform();
		
		//Explicitly wait
		Thread.sleep(3000);
		
		//driver.close();
		driver.quit();
		
		

	}

}
