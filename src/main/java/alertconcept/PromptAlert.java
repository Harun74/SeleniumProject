
package alertconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text() = 'Click for JS Prompt']")).click();
		
		//By using Alert class, switching alert and getText
		Alert PromptAlert = driver.switchTo().alert();
		PromptAlert.getText();
		System.out.println(PromptAlert.getText());
		
		//Explicitly wait
		Thread.sleep(3000);
		
		PromptAlert.sendKeys("I am a Robot");
		
		Thread.sleep(3000);
		
		PromptAlert.accept();//accept alert
		
		//OR
		//PromptAlert.dismiss();//dismiss alert
		
		//Get text from the Result, that you entered and print in the console
		
		driver.findElement(By.id("result")).getText();
		System.out.println(driver.findElement(By.id("result")).getText());
		
		//or
		//String text = driver.findElement(By.id("result")).getText();
		//System.out.println(text);
		
		System.out.println(driver.getCurrentUrl());
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		driver.close();

		/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Create object of ChromeDriver Class		
		WebDriver driver = new ChromeDriver();
		
			
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		System.out.println(driver.getTitle());
						
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
				
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		
		//By using Alert class, switching alert and getText
		Alert PromptAlert = driver.switchTo().alert();
		PromptAlert.getText();
		System.out.println(PromptAlert.getText());
		
		//Explicitly wait
		Thread.sleep(3000);
		//PromptAlert.sendKeys("I am a Robot");
		PromptAlert.sendKeys("I am a Robot");
				
		Thread.sleep(3000);
		PromptAlert.accept(); //accept alert
		
		//GetText from the result, that you entered  and print in the console		
		driver.findElement(By.id("result")).getText();
		System.out.println(driver.findElement(By.id("result")).getText());
		
		//Or
		//String text = driver.findElement(By.id("result")).getText();
		//System.out.println(text);
		
		System.out.println(driver.getCurrentUrl());
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		driver.close();*/
}
}

