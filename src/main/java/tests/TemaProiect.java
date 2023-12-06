package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.BaseTest;
import utils.ScreenShots;

public class TemaProiect extends BaseTest {
	@Parameters({"numeCompanie"})
	@Test(priority = 1)
	public void companySearchValidate(String numeCompanie)throws IOException, InterruptedException {
		app.click(app.menu.companiesLink);
		assertTrue(app.elementIsDisplayed(app.cp.companies));
		ScreenShots.screenshot(driver);
		app.cp.loginCompany(numeCompanie);
		Thread.sleep(2000);
	    app.click(app.cp.coinLink);
		assertTrue(app.elementIsDisplayed(app.ctp.followVisitSend));
		ScreenShots.screenshot(driver);
		Thread.sleep(2000);
		app.click(app.ctp.follow);
		assertTrue(app.elementIsDisplayed(app.ctp.followPopup));
		app.click(app.ctp.inchidereFollowPopup);
		ScreenShots.screenshot(driver);
		app.click(app.ctp.sendMessage);
		assertTrue(app.elementIsDisplayed(app.ctp.followPopup));
		app.click(app.ctp.inchidereFollowPopup);
		ScreenShots.screenshot(driver);
		Thread.sleep(2000);
		app.click(app.ctp.visitWebsite);
		List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(browserTabs.get(1));
		Thread.sleep(1000);
		assertEquals(driver.getCurrentUrl(),"https://www.cointracker.io/");
		ScreenShots.screenshot(driver);
		driver.switchTo().window(browserTabs.get(0));
		assertEquals(driver.getCurrentUrl(),"https://moony.ro/companies/b2b-saas/cointracker/");
		ScreenShots.screenshot(driver);
		assertEquals(app.returnWebElement(app.ctp.b2bSaas).getText(),
				"B2B SaaS");
		assertEquals(app.returnWebElement(app.ctp.webDevelopment).getText(),
				"Web Development");
		assertEquals(app.returnWebElement(app.ctp.companySize).getText(),
				"200-300");
		assertEquals(app.returnWebElement(app.ctp.founded).getText(),
				"2017");
		assertEquals(app.returnWebElement(app.ctp.location).getText(),
				"San Francisco");
		ScreenShots.screenshot(driver);
		
	}
	@Parameters({"user","pass"})
	@Test(priority = 2)
	public void applyJob(String user,String pass)throws IOException, InterruptedException {
		app.click(app.menu.loginButton);
		Thread.sleep(2000);
		assertTrue(app.elementIsDisplayed(app.myAccount.logInPopup));
		ScreenShots.screenshot(driver);
		app.myAccount.loginInApp(user,pass);
		assertTrue(app.elementIsDisplayed(app.mcp.johnnyBravo));
		ScreenShots.screenshot(driver);
		Thread.sleep(2000);
		app.click(app.menu.findJobs);
		app.jp.searchTestEngineer();
		Thread.sleep(3000);
		app.click(app.jp.testEngineerAtKeyTest);
		assertTrue(app.elementIsDisplayed(app.te.applyNowButton));
		assertTrue(app.elementIsDisplayed(app.te.overview));
		ScreenShots.screenshot(driver);
		Thread.sleep(2000);
		app.click(app.te.applyNowButton);
		assertTrue(app.elementIsDisplayed(app.te.applyPopup));
		ScreenShots.screenshot(driver);
		app.click(app.te.phonePopup);
	}
	

}
