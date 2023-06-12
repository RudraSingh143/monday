package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetion {
	static {
		System.setProperty("wbdriver.chrome.driver","driver.chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("java");
	Thread.sleep(5000);
	List<WebElement> allsugg=driver.findElements(By.xpath("//div[@id='Alh6id']"));
	
	int count=allsugg.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String test=allsugg.get(i).getText();
		System.out.println(test);
		}
		System.out.println(allsugg.get(1).getText());
		//allsugg.get(0).click();
		driver.close();

	}

}
