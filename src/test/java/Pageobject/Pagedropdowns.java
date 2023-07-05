package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pagedropdowns {
	
	public WebDriver ldriver;
	public Pagedropdowns(WebDriver rdriver)
	{
		ldriver =rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void clidrop()
	{
		 Select objSelect =new Select(ldriver.findElement(By.id("country")));
			objSelect.selectByVisibleText("Canada");
	}


}
