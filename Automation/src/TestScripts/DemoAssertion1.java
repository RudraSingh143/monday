package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoAssertion1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
@Test
public void VerifyTitle() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	String eTitle = "Soogle";
	String aTitle = driver.getTitle();
	if(aTitle.equals(aTitle)) {
		System.out.println("Title is matching and pass");
	}
	else {
		System.out.println("Title is not matching and fail");
	}
driver.close();
}
}
