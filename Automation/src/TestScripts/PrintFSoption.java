package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintFSoption {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/taswi/OneDrive/Desktop/MultiSelectList.html");
WebElement CpListbox = driver.findElement(By.id("cp"));
 Select s=new Select(CpListbox);
  WebElement FSoption = s.getFirstSelectedOption();
  String text = FSoption.getText();
  System.out.println(text);
  driver.close();
  }

}
