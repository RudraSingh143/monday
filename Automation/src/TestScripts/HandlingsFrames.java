package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingsFrames {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/taswi/OneDrive/Desktop/page1.html");
driver.findElement(By.id("T1")).sendKeys("a");
driver.switchTo().frame("f1");
driver.findElement(By.id("T2")).sendKeys("b");
driver.switchTo().defaultContent();
driver.findElement(By.id("T1")).sendKeys("c");
WebElement f = driver.findElement(By.xpath("//iframe"));
driver.switchTo().frame(f);
driver.findElement(By.id("T2")).sendKeys("d");
	}

}
