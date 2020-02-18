package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CheckBoxPage extends TestBase {

	@FindBy(xpath = "//h2/input[\"@type('checkbox')\"]")
	public	static	WebElement Store_btn;
	@FindBy(xpath = "//h4[contains(text(),'Boxcutter')]/input")
	public	static	WebElement BoxCutter_btn;

	public CheckBoxPage() {
		PageFactory.initElements(driver, this);
	}

	public static void clickStoreBtn() {

		Store_btn.click();
		
	}
	
	public static void boxCutterBtn() {

		BoxCutter_btn.click();
	}
	
	

}
