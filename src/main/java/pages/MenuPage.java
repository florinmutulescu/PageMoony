package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class MenuPage extends SeleniumWrappers{

	public MenuPage(WebDriver driver) {
		super(driver);
	}
	public By companiesLink=By.xpath("(//span[@class="
			+ "'menu-item-title'])[3]");
	
	public By loginButton =By.xpath("(//a[@class='btn-login'])[2]");
	public By findJobs =By.xpath("//span[text()='Find jobs']");
	
}
