package Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Pageobject.Pagealerts;
import Pageobject.Pagecheck;
import Pageobject.Pagedropdowns;
import Pageobject.Pageradio;
import Pageobject.Poclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefclass {
	WebDriver driver= null;
	Poclass pc;
	Pageradio po;
	Pagecheck pk;
	Pagedropdowns pd;
	Pagealerts pa;
	@Given("User luanches the browser")
	public void user_luanches_the_browser() {
		System.setProperty("webdriver.chrome.driver","C://Users//tshaik1//Downloads//chromedriver_win32//chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	    
	}

	@When("user enters the text fields")
	public void user_enters_the_text_fields() {
		pc =new Poclass(driver);
		pc.clibynm();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	@Then("user clicks on radio button")
	public void user_clicks_on_radio_button() {
		po =new Pageradio(driver);
		po.cliradio();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	@Then("user clicks on check boxes")
	public void user_clicks_on_check_boxes() {
		pk =new Pagecheck(driver);	
	    pk.clicheck();
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	    pd =new Pagedropdowns(driver);
	    pd.clidrop();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)", "");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	@Then("user handles the alers")
	public void user_handles_the_alers() {
		pa = new Pagealerts(driver);
		pa.alert();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

}
