package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHightAndWidth {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement emailtbx = driver.findElement(By.id("email"));
		int height = emailtbx.getSize().getHeight();
		int width = emailtbx.getSize().getWidth();
System.out.println(emailtbx);
driver.close();
	}

}