package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.google.common.io.Files;

import pages.BasePage;

public class BaseTest extends Driver{
	public WebDriver driver;
	public BasePage app;
	
	@Parameters({"browser","url"})
	@BeforeClass(alwaysRun = true)
	public void setUp(String browser,String url) {
		
		driver = initDriver(browser);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();//maximizes the browser
        driver.get(url);//navigates to the specified url
       
        app =  new BasePage(driver);
	}
	
	  @AfterClass(alwaysRun=true)
	public void tearDown() throws InterruptedException  {
		Thread.sleep(4000);// bad practice
		//driver.close();//inchide tabul curent
		driver.quit();//inchide browserul indiferent cate taburi sunt deschise
	}
	  @AfterMethod
		public void recordFailure(ITestResult result) throws IOException {

		if(ITestResult.FAILURE == result.getStatus()) {

			String timestamp = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new Date());
			TakesScreenshot file = (TakesScreenshot)driver;	
			File picture = file.getScreenshotAs(OutputType.FILE);
			Files.copy(picture, new File("poze/"+result.getName() +"-" +timestamp +".png"));
		}		
		}




}
