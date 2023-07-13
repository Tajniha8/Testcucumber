package testautomation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class Hihglights {
	
	WebDriver driver;

	public Hihglights (WebDriver driver) {
		this.driver=driver;
	
	}
	
	public void high() throws IOException {
		WebElement progress=driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice']"));

		if(progress.isDisplayed()){
	    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
	    jsExecutor.executeScript("arguments[0].style.border='2px solid red'",progress);    
		System.out.println("progress image is displayed");
		}
		else {
			System.out.println("progress image is not displayed");
			
	    }
		
		}

}
