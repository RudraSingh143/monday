package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectedListbox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/taswi/OneDrive/Desktop/MultiSelectList.html");
		  WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListbox);
		s.selectByIndex(0);
		s.selectByValue("p");
		s.selectByVisibleText("dosa");
		s.deselectAll();

	}

}
