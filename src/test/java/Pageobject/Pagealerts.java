package Pageobject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pagealerts {
	public WebDriver ldriver;
	public Pagealerts(WebDriver rdriver)
	{
		ldriver =rdriver;
		PageFactory.initElements(rdriver, this);
	}
	public void alert() {
		ldriver.findElement(By.xpath("//button[normalize-space()='Alert']")).click();

		Alert alert = ldriver.switchTo().alert();
//		Thread.sleep(100);
		alert.accept();

}
}