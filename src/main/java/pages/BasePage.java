package pages;

import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class BasePage extends SeleniumWrappers{
	public BasePage(WebDriver driver) {
		super(driver);
	}
	public MenuPage menu = new MenuPage(driver);
	public CompaniesPage cp= new CompaniesPage(driver);
	public CoinTrackerPage ctp = new CoinTrackerPage(driver);
	public MyAccountPage myAccount= new MyAccountPage(driver);
	public MoonyCandidatePage mcp=new MoonyCandidatePage(driver);
	public JobsPage jp=new JobsPage(driver);
	public TestEngineer te=new TestEngineer(driver);
}
