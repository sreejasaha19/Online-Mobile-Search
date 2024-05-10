package userDefinedLibraries;
//This page is for driver setup,this allows the driver to accept the as per user and also help us to test the browser.
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


//Initialize the driver
public class DriverSetup {
	public static WebDriver driver;	
	public static String url = "https://www.amazon.in/";
	public static String browsertype;
	public static WebDriver driverInstantiate(String browser) {
		browsertype = browser;
		if (browsertype.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();	
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);		
		//driver.navigate().to(url);
		return driver;
	}
	//Closing the driver
	public static void driverTearDown() {
		driver.quit();
	}


}
