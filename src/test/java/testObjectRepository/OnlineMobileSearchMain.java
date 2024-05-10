//This is the main method of the project
package testObjectRepository;
//importing libraries
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import userDefinedLibraries.DriverSetup;
import userDefinedLibraries.ScreenShot;

public class OnlineMobileSearchMain {
	static WebDriver driver;
	OnlineMobileSearch on;
	HomePage hp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=DriverSetup.driverInstantiate("chrome");
		OnlineMobileSearch on=new OnlineMobileSearch(driver);
		HomePage hp=new HomePage(driver);
		hp.search("mobile smartphones under 30000");
		on.searchResult();
		on.validateSearchString("mobile smartphones under 30000");
		on.validateNoofPages();
		on.validateNoOfItems();
		 try {
			ScreenShot.screenShotTC(driver, "ScreenShot1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		on.sortList("Newest Arrivals");
		on.verifyCountOfOptions();
		on.verifySelectedOption("Newest Arrivals");
		on.waitMethod();
		try {
			ScreenShot.screenShotTC(driver, "ScreenShot2");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		DriverSetup.driverTearDown();
	}

}
