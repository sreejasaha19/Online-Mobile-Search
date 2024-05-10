package testObjectRepository;
//This page is for searching “mobile smartphones under 30000”
//importing libraries
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	
	//Constructor
	HomePage(WebDriver driver){
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	//Locators
	@FindBy(id="twotabsearchtextbox")
	WebElement searchtxbox;
	
	
	
	//Action methods
	//Enter the search text in search box “mobile smartphones under 30000”
		public void search(String text) {
			searchtxbox.sendKeys(text);
			searchtxbox.submit();
		}

}
