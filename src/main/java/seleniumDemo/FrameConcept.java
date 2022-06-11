package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/selectable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByLinkText("Selectable").click();
		
		driver.switchTo().frame(0);
	/*	//Click selectable(outside frame)
		driver.findElementByLinkText("Selectable").click();
		
		//Using index number-if your frame has no id or name locator then go to index number
		
		//Switching to frame-way 2
		driver.switchTo().frame(0);//using index number-(Note:in java index starts from zero[0])
		
		
		//Click item-2
		//driver.findElementByXPath("//ol[@id='selectable']/li[2]").click();
		
		//Click item-7
		//driver.findElementByXPath("//ol[@id='selectable']/li[7]").click();
		
		//Switching to frame way-3
	   //driver.switchTo().frame(driver.findElementByClassName("demo-frame"));//Select WebElement by className
	   
	   //OR(we can do it other way)
	  // WebElement iframe = driver.findElementByClassName("demo-frame");
	   //driver.switchTo().frame(iframe);
	   
	 //Clicking item-1,3 element
	  driver.findElementByXPath("//ol[@id='selectable']/li[1]").click();
	  driver.findElementByXPath("//ol[@id='selectable']/li[3]").click();
	  
	  //Clicking item-4,5,6
	  driver.findElementByXPath("//ol[@id='selectable']/li[4]").click();
	  driver.findElementByXPath("//ol[@id='selectable']/li[5]").click();
	  driver.findElementByXPath("//ol[@id='selectable']/li[5]").click();
	  
	  //Switch to main HTML page
	  driver.switchTo().defaultContent();
	  driver.switchTo().parentFrame();
	  
	  //Click Demos (outside frame)
	  Thread.sleep(3000);
	  driver.findElementByLinkText("Demos").click();
	  
	  Thread.sleep(3000);
	  driver.close();*/
	  
	  
		
		
		
		

	}

}
