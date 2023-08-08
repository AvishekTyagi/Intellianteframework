package intelliantframework.pageobjects;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TypingObjects 
{
	WebDriver driver;
	Actions act;
	public TypingObjects(WebDriver driver, Actions act) {
		this.driver=driver;
		this.act=act;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css=".col-md-3:nth-child(3) .icon-container")
	public WebElement Score_button;
	
	@FindBy(xpath="//button[contains(.,'Continue')]")
	public WebElement continue_button;
	
	public void type(String number ,String number1, String number2, String number3)
	{
		 act.sendKeys(number).build().perform();
	     act.sendKeys(Keys.RETURN);
	     
	     act.sendKeys(number1).build().perform();
	     act.sendKeys(Keys.RETURN);
	     
	     act.sendKeys(number2).build().perform();
	     act.sendKeys(Keys.RETURN);
	     
	     act.sendKeys(number3).build().perform();
	     act.sendKeys(Keys.RETURN);
	     
	}

}
