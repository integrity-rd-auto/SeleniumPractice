// Author : Subhendu C

package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;

	public static void initialization() {

		// WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.chromedriver().setup();
		// driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.way2automation.com/angularjs-protractor/checkboxes/");

	}

}
