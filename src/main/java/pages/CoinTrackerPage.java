package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class CoinTrackerPage extends SeleniumWrappers{

	public CoinTrackerPage(WebDriver driver) {
		super(driver);
	}
	public By followVisitSend=By.xpath("//div[@class="
			+ "'block-archive-inner company-head-details']");
	public By follow=By.xpath("//a[@data-company-id='2059']");
	public By visitWebsite=By.xpath("//a[@href="
			+ "'https://www.cointracker.io']");
	public By sendMessage=By.xpath("//a[contains(text(),'Send message')]");
	public By followPopup=By.xpath("//div[@class='head-popup']");
	public By inchidereFollowPopup=By.xpath("//i[@class='la la-times large']");
	public By b2bSaas=By.xpath("(//a[contains(text(),'B2B SaaS')])[2]");
	public By webDevelopment=By.xpath("//a[contains(text(),'Web Development')]");
	public By companySize=By.xpath("//div[contains(text(),'200-300')]");
	public By location=By.xpath("//span[contains(text(),'San Francisco')]");
	public By founded=By.xpath("//p[contains(text(),'2017')]");
	
}
