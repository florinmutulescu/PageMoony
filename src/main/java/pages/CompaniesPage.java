package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.SeleniumWrappers;

public class CompaniesPage extends SeleniumWrappers{

	public CompaniesPage(WebDriver driver) {
		super(driver);
		
	}
	public By companies=By.xpath("//h2[text()="
			+ "'Companies Hiring Internationally']");
	public By companySearch=By.xpath("//input[@name="
			+ "'company_filter_search']");
	
	public By search=By.xpath("//button[@name='company-top-filter']");
	public By coinLink=By.xpath("//img[@src='https://civi.uxper.co/"
			+ "wp-content/uploads/2022/10/cointracker-logo.webp']");
	
	
	public void loginCompany(String numeCompanie) throws InterruptedException {
	    sendKeys(companySearch,numeCompanie);
		Thread.sleep(2000);
		click(search);	
	}

}
