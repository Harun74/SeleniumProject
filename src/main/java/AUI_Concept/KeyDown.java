package AUI_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();//For Chrome
		
		driver.get("https://jqueryui.com/selectable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Switch to frame
		driver.switchTo().frame(0);
		
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		
		WebElement item2 = driver.findElementByXPath("//li[text()='Item 2']");
		
		WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");
		
		WebElement item4 = driver.findElementByXPath("//li[text()='Item 4']");
		
		WebElement item5 = driver.findElementByXPath("//li[text()='Item 5']");
		
		WebElement item6 = driver.findElementByXPath("//li[text()='Item 6']");
		
		WebElement item7 = driver.findElementByXPath("//li[text()='Item 7']");
		
		Actions action = new Actions(driver);
		
		Thread.sleep(3000);
		action.keyDown(Keys.CONTROL).click(item1).click(item2).click(item3).click(item4).click(item5).click(item6).click(item7).release().perform();
		

	}

}
