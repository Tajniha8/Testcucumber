package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pageradio {
	public WebDriver ldriver;
	public Pageradio(WebDriver rdriver)
	{
		ldriver =rdriver;
		PageFactory.initElements(rdriver, this);
	}
	By clbtn = By.id("male");
//	By doubleclick = By.xpath("female");
	public void cliradio()
	{
		ldriver.findElement(clbtn).click();
//		ldriver.findElement(doubleclick).click();
	}
	
	
}
