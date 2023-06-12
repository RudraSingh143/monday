package TestScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnPsActitimeHW {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement check=driver.findElement(By.name("username"));
		int height = check.getSize().getHeight();
		int width=check.getSize().getWidth();
		if(height==width) {
			System.out.println("eaual");
		}
	
		}
	}

