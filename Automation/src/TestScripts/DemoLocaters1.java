package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class DemoLocaters1 {

	static {
	       System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/taswi/OneDrive/Desktop/xpath.html");
		List<WebElement> allLink=driver.findElements(By.tagName("a"));
		int count = allLinks.size();
		 System.out.println(count);
		 
		
	}

}
