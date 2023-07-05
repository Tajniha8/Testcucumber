package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pagecheck {
	
	public WebDriver ldriver;
	public Pagecheck(WebDriver rdriver)
	{
		ldriver =rdriver;
		PageFactory.initElements(rdriver, this);
	}
	By clisunday = By.id("sunday");
	By clitueday = By.id("tuesday");
	By clisatday = By.id("saturday");
	
	
	public void clicheck()
	{
		ldriver.findElement(clisunday).click();
		ldriver.findElement(clitueday).click();
		ldriver.findElement(clisatday).click();
	}

}
