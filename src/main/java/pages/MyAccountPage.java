package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class MyAccountPage extends SeleniumWrappers{

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	public By logInPopup=By.xpath("//div[@class='head-popup']");
	public By userEmail =By.id("ip_email");
	public By passField =By.id("ip_password");
	public By signButton =By.xpath("(//button"
			+ "[@class='gl-button btn button'])[1]");
	
	public void loginInApp(String user,String pass) {
		sendKeys(userEmail,user);
		sendKeys(passField,pass);
		click(signButton);

}
}