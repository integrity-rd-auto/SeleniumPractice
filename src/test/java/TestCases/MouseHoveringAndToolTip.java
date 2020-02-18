package TestCases;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class MouseHoveringAndToolTip {

	WebDriver driver;
	WebElement more;
	WebElement FAQ;
	WebElement Companies;
	WebElement ComapniesToolTip;

	@BeforeMethod
	public void initialization() {

		// WebDriverManager.firefoxdriver().setup();
		WebDriverManager.chromedriver().setup();
		// driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");

	}
	
	@Test(priority = 1)
	public void getToolTip() {
		
		Companies=driver.findElement(By.xpath("//div[contains(text(),'Companies')]"));	
		Actions action =new Actions(driver);
		
		action.moveToElement(Companies).build().perform();
		
		ComapniesToolTip = driver.findElement(By.xpath("//a[@title='Jobs Posted By Top Companies']"));
		
		Assert.assertEquals(ComapniesToolTip.getText(),
				"COMPANIES");
	}

	@Test(priority = 2)
	public void getTitle() {

		Assert.assertEquals(driver.getTitle(),
				"Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com");
	}

	@Test(priority = 3)
	public void clickFAQ() {

		more = driver.findElement(By.xpath("//div[contains(text(),'More')]"));

		Actions action = new Actions(driver);

		action.moveToElement(more).build().perform();

		FAQ = driver.findElement(By.linkText("FAQ"));

		FAQ.click();

		Set<String> windowshandlers = driver.getWindowHandles();

		Iterator<String> it = windowshandlers.iterator();
        String HomePage = it.next();
		String FAQPage = it.next();
		driver.switchTo().window(FAQPage);
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(driver.getTitle(), "Frequently Asked Questions- Jobseeker – Naukri.com");

	}

	@AfterMethod
	public void afterMethod() {

		driver.quit();
	}

}
