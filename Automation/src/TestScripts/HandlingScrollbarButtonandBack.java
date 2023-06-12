package TestScripts;

import java.awt.Window;

import javax.swing.Scrollable;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollbarButtonandBack {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeAsyncScript("Window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		j.executeScript("Window.scrollTo(0,0)");

	}

}
