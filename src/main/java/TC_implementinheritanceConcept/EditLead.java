package TC_implementinheritanceConcept;

import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper;

public class EditLead extends ProjectSpecificWrapper {

	//public static void main(String[] args) {
	
	
    @Test
    public void editLead() {
    	
    	//Click leads link
    	driver.findElementByLinkText("Leads").click();
    	//click Find leads link
    	driver.findElementByLinkText("Find Leads").click();
    	//enter first name
    	driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hema");
    	//click Find lead button
    	driver.findElementByXPath("//button[text()='Find Leads']").click();	
    	
  
    	
    	
	}

}
