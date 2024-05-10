package testObjectRepository;
//This page is for implementing all the methods of project
//importing libraries
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OnlineMobileSearch {
	public WebDriver driver;
	public Select listbx;
	public String s_option;
	public List<WebElement> countList;
	public int count;
	public String searchText;
	public boolean searchString;
	public boolean noOfPages;
	public boolean numberOfItems;
	public boolean options;
	public boolean countOption;
	public String end="";
	public String start="";
	public String patt="[0-9]+";
	public String[] arr;
	
	//Constructor(for calling main method we have to create constructor).
	public OnlineMobileSearch(WebDriver driver){
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	//Locators
	@FindBy(className="a-section")
	WebElement result;
	@FindBy(name="s")
	WebElement sort_list;
	@FindBy(id="s-result-sort-select_4")
	WebElement option;
	@FindBy(id="p_72-title")
	WebElement visible_option;
//	@FindBy(className="a-dropdown-item")
//	List<WebElement> sortbox;
//	@FindBy(className="a-dropdown-label")
//	WebElement sortlist;
//	@FindBy(className="a-dropdown-prompt")
//	WebElement option1;
	
	
	
	//Action methods
	
	//Application displays the follow message similar to following-
	//1-24 of over 1,000 results for "mobile smartphones under 30000"  
	//(1-24 and 1000 numbers will change according to stock available on site that at the time of execution)
	public void searchResult() {
        searchText = result.getText();
        arr=searchText.split(" ");
        System.out.println("Search Message: "+searchText); 
	}
	
	//Click on “Sort by list” listbox.
	//Application should display four sort by options in the list. Check the count of options displayed.
	//Select option “Newest Arrivals”
	public void sortList(String text) {        
        listbx = new Select(sort_list);
        countList=listbx.getOptions();
		count=countList.size();
		System.out.println("The count of options displayed:" +count);
        listbx.selectByVisibleText(text);
        option.click();
//        sortlist.click();
//        countList=sortbox;
//        count=countList.size();
//		System.out.println("The count of options displayed:" +count);
//        for(int i =0;i<countList.size();i++)
//		{
//			
//			if(countList.get(i).getText().equals(text))
//			{
//				countList.get(i).click();
//			}
//		}
	}
	
	//Using explicit wait so that the page is loaded properly to get a proper screenshot
	public void waitMethod() {
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.visibilityOf(visible_option));
	}
	
	
	
	
	//Validation methods
	// validate the search string
	public boolean validateSearchString(String text) {
		boolean searchString=searchText.contains(text);
		System.out.println("Validate status of Search String:"+searchString);
		return searchString;
	}
	//validate the number of pages
	public boolean validateNoofPages() {
        start=arr[0];
        System.out.println("Number of pages: "+start);
        start=start.replaceAll("-","");
        noOfPages=start.matches(patt);
        System.out.println("Validate status of number of pages: "+noOfPages);
        return noOfPages;
	}
	//validate the number of items
	public boolean validateNoOfItems() {
		if(searchText.contains("over")) {
	        end=arr[3];
	        System.out.println("Number Of Items:"+"over "+end);
	        }
	        else {
	        	 end=arr[2];
	        	 System.out.println("Number Of Items:"+end);
	        }
	    end=end.replaceAll(",","");
	    numberOfItems=end.matches(patt);
	    System.out.println("Validate the status of number of Items: "+numberOfItems);
        return numberOfItems;
	}
	//Verify that  “Newest Arrivals” option got selected correctly or not.
	public boolean verifySelectedOption(String text) {
		s_option=listbx.getFirstSelectedOption().getText();
//		s_option=option1.getText();
		System.out.println("Selected option: "+s_option);
		options=s_option.matches(text);
		System.out.println("Validate the status of selecting 'Newest Arrivals' option: "+options);
		return options;
	}
	//Verify the count of options in the list
	public boolean verifyCountOfOptions() {
		countOption = count == 4;
	    System.out.println("Verify the count of options: " + countOption);
	    return countOption;
	}
	
	
}
