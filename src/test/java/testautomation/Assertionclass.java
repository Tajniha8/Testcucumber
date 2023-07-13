package testautomation;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Assertionclass {
	
	WebDriver driver;

	public Assertionclass(WebDriver driver) {
		this.driver=driver;
	
	}
	public void assertmethod() {
	String expectedtitle=  "Automation Testing Practice";
	String actualtitle= driver.getTitle();
	Assert.assertEquals(actualtitle,expectedtitle);
	System.out.println("Alert is displayed");
	System.out.println("I am tajniha");
}
}