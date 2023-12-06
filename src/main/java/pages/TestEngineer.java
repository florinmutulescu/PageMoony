package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class TestEngineer extends SeleniumWrappers {

	public TestEngineer(WebDriver driver) {
		super(driver);
	}
	public By interestedJob=By.xpath("(//h4[text()='Interested in this job?'])[2]");
	public By applyNowButton=By.xpath("(//a[text()='Apply now'])[2]");
	public By overview=By.xpath("//a[text()='Overview']");
	public By applyPopup =By.xpath("//div[@class='apply-popup']");
	public By phonePopup =By.xpath("//i[@class='fal fa-phone-alt']");
}
