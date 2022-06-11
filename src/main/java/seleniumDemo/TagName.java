package seleniumDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TagName {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//WebDriverManager.firefoxdriver().setup();
		
		//Using Webdriver interface and create object of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://leaftaps.com/opentaps");
		
	  //driver.get("http://www.indeed.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
	    driver.findElement(By.linkText("CRM/SFA")).click();
	   
	   //Find how many a tag in this page
	   List<WebElement>LinkList = driver.findElements(By.tagName("a"));
        System.out.println(LinkList.size());
        
        List<WebElement>divTag = driver.findElements(By.tagName("div"));
        System.out.println(divTag.size());
        
        List<?> elements = driver.findElements(By.tagName("div"));
        int total = elements.size();
        
       // List elements = driver.findElements(By.tagName("h2"));
        //int total = elements.size();
        
        System.out.println(total);
        System.out.println("Total webelements starting with TagName 'div':" + total);
        System.out.println("Total Tagname 'Div':" + total);
        
        Thread.sleep(3000);
        driver.close();
		

	}

}
