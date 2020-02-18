package TestCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.TestBase;
import Page.CheckBoxPage;

public class CheckBoxValidation extends TestBase {

	static CheckBoxPage checkBoxPage;

	@BeforeMethod
	public static void setUp() {

		initialization();
		checkBoxPage = new CheckBoxPage();

	}

	@Test(priority = 1)
	public void validateStoreBtn() {

		Assert.assertEquals(checkBoxPage.Store_btn.isSelected(), false);
		checkBoxPage.clickStoreBtn();
		Assert.assertEquals(checkBoxPage.Store_btn.isSelected(), true);

	}

	@Test(priority = 2)
	public void validateBoxCutterBtn() {
		// driver.findElement(By.xpath("//h4[contains(text(),'Boxcutter')]/input"));
		Assert.assertEquals(checkBoxPage.BoxCutter_btn.isSelected(), true);
		checkBoxPage.BoxCutter_btn.click();
		Assert.assertEquals(checkBoxPage.BoxCutter_btn.isSelected(), false);

	}

	@AfterMethod

	public void terminate() {

		driver.quit();
	}

}
