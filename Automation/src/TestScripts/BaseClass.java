package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static WebDriver driver;
@BeforeClass
public void openBrowser() {
	Reporter.log("openBrowser",true);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
@AfterClass
public void closeBroswer() {
	Reporter.log("closeBrowser",true);
	driver.close();
}
}
