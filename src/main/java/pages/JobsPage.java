package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class JobsPage extends SeleniumWrappers {

	public JobsPage(WebDriver driver) {
		super(driver);
	}
	public By titleJobs =By.id("jobs_filter_search");
	//public By searchJobs=By.xpath("//button[@class="
			//+ "'btn-top-filter civi-button']");
	public By testEngineerAtKeyTest =By.xpath("//a[text()="
			+ "'Test Engineer at KeyTest']");
	
	
	public void searchTestEngineer() throws InterruptedException {
		
		sendKeys(titleJobs,"Test Engineer");
		//click(searchJobs);
		}
}
