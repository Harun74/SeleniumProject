package integrateExcelDataProvider;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils_integrateExcelWDatapro.ReadExcel;

public class PSWrapper {
	
public ChromeDriver driver;
	
	@Parameters({"url","uname","pwd"})
	
	@BeforeMethod
	public void login(String url,String uname,String pwd)  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		//load URL
		driver.get(url);
		//maximize
		driver.manage().window().maximize();
		//implicitely wait
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	  driver.findElementByCssSelector(".top>input").sendKeys(uname);
	 //Enter password
	 driver.findElementByCssSelector("label[for='password']+input").sendKeys(pwd);
	 //Click login button
	 driver.findElementByCssSelector("input[type='submit']").click();
	 //Click CRM/SFA link
	 driver.findElementByLinkText("CRM/SFA").click();  
   
}

	 @AfterMethod
	  public void closeBrowser() {
		  driver.close();
	  }
	 
	 @DataProvider
	 public String[][] getData() throws IOException{
		 
		 ReadExcel r1 = new ReadExcel();
		 return r1.readExcel();
		 
		 //Create Object of two dimension array with size of array (i.e row and column number)
		/* String [][] data = new String[3][3];
		 
		 data[0][0] = "TCS";
		 data[0][1] = "Harun";
		 data[0][2]	= "Chowdhury";
		// data[0][3] = "1234567";
		// data[0][4] = "abc@gmail.com";
		 
		 data[1][0] = "ABC";
		 data[1][1] = "Kutub";
		 data[1][2] = "Uddin";
		 
		 data[2][0] = "CTS";
		 data[2][1] = "Hema";
		 data[2][2] = "Mali";*/
		 
		// return data;

	 }
}
