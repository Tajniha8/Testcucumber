package Pageobject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Poclass {
	public WebDriver ldriver;
	Properties p= new Properties();
	public Poclass(WebDriver rdriver)
	{
		ldriver =rdriver;
		PageFactory.initElements(rdriver, this);
		try {
			FileInputStream fileInputStream = new FileInputStream("C://Users//tshaik1//eclipse-workspace//Testsamplecucumberproject//src//main//resources//config.properties");
			p.load(fileInputStream);
			} catch (IOException e) {
			e.printStackTrace();
			}

	}
	By clbtn = By.xpath("//input[@id='name']");
	By cliemail = By.xpath("//input[@id='email']");
	By cliphone = By.xpath("//input[@id='phone']");
	By cliadd = By.xpath("//textarea[@id='textarea']");
	public void clibynm()
	{
		String ndata = p.getProperty("name");
		ldriver.findElement(clbtn).sendKeys(ndata);
		String edata = p.getProperty("email");
		ldriver.findElement(cliemail).sendKeys(edata);
		String pdata = p.getProperty("phone");
		ldriver.findElement(cliphone).sendKeys(pdata);
		String adata = p.getProperty("address");
		ldriver.findElement(cliadd).sendKeys(adata);
		
	}
}
