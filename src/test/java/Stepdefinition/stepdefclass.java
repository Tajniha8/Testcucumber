package Stepdefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import Pageobject.Pagealerts;
import Pageobject.Pagecheck;
import Pageobject.Pagedropdowns;
import Pageobject.Pageradio;
import Pageobject.Poclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testautomation.Assertionclass;
import testautomation.Hihglights;

public class stepdefclass {
	WebDriver driver= null;
	Poclass pc;
	Pageradio po;
	Pagecheck pk;
	Pagedropdowns pd;
	Pagealerts pa;
	Hihglights hg;
	Assertionclass as;
	@Given("User luanches the browser")
	public void user_luanches_the_browser() {
		System.setProperty("webdriver.chrome.driver","C://Users//tshaik1//Downloads//chromedriver_win32//chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.edge.driver","D://Edgedriver//edgedriver_win64//msedgedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		as =new Assertionclass(driver);
	    as.assertmethod();
	}

	@When("user enters the text fields")
	public void user_enters_the_text_fields() throws IOException, InterruptedException {
		hg =new Hihglights(driver);
		hg.high();
		pc =new Poclass(driver);
		pc.clibynm();
		Thread.sleep(1000);
	}

	@Then("user clicks on radio button")
	public void user_clicks_on_radio_button() throws InterruptedException {
		po =new Pageradio(driver);
		po.cliradio();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(1000);
	}

	@Then("user clicks on check boxes")
	public void user_clicks_on_check_boxes() throws InterruptedException {
		pk =new Pagecheck(driver);	
	    pk.clicheck();
	    Thread.sleep(1000);
	    pd =new Pagedropdowns(driver);
	    pd.clidrop();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(1000);
	}

	@Then("user handles the alers")
	public void user_handles_the_alers() throws InterruptedException {
		pa = new Pagealerts(driver);
		pa.alert();
		Thread.sleep(1000);
	}

}
