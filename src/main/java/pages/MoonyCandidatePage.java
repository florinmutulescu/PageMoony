package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class MoonyCandidatePage extends SeleniumWrappers{

	public MoonyCandidatePage(WebDriver driver) {
		super(driver);
	}
	public By johnnyBravo=By.xpath("(//span[text()='JohnnyBravo'])[2]");
}
