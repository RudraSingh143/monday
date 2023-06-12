package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	static {
		System.setProperty("webDriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/taswi/OneDrive/Desktop/xpath.html");
		driver.findElement(By.xpath("//input[@type='text']")).click();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
	}

}
