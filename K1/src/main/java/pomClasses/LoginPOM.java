package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	 WebDriver driver;
		@FindBy (xpath="//input[@name='firstname']")  private WebElement Username;
		@FindBy (xpath="//input[@name='lastname']")  private WebElement lastname;
		@FindBy (xpath="")  private WebElement mob;
		@FindBy (xpath="")  private WebElement password;
		@FindBy (xpath="")  private WebElement bday;
		@FindBy (xpath="")  private WebElement bmonth;
		@FindBy (xpath="")  private WebElement byear;
		
		LoginPOM(WebDriver dri){
			driver=dri;
			PageFactory.initElements(dri, this);
		}
}
