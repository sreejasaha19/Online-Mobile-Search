### Online Mobile Search Automation
## Problem Statement
Automate the search for mobile phones on an online shopping website. Specifically, retrieve mobile smartphones from the Amazon online store that meet the following criteria:

Price less than Rs. 30,000.<br>
Newly arrived mobiles.<br>
You are encouraged to use Amazon as the suggested site, but you have the flexibility to choose any other legitimate shopping site.

### Detailed Description
 - Browser Launch and Configuration:<br>
 - Launch the browser using the specified configuration settings (Firefox/Chrome).<br>
 - Read the application URL from the configuration settings (e.g., Amazon India).<br>
 - Open the URL [Click Url](https://www.amazon.in/) and the user will navigate to the home page of the website.<br><br>
**Search for Mobile Smartphones:**<br>
 - Enter the search text in the search box: “mobile smartphones under 30000.”<br>
 - The application will display a message similar to the following:<br>
 - “1-24 of over 1,000 results for ‘mobile smartphones under 30000’” (Note: The numbers may vary based on available stock at the time of execution).<br><br>
**Validation:**<br>
 - Validate the search string to ensure it matches the expected format.<br>
 - Extract the number of pages (e.g., 1-16) and the total number of items (over 90,000) from the displayed message.<br><br>
**Sorting Options:**<br>
 - Click on the “Sort by” listbox.<br>
 - The application should display four sorting options in the list.<br>
 - Verify the count of options displayed.<br>
 - Select “Newest Arrivals”:<br>
 - Choose the option “Newest Arrivals” from the list.<br>
 - Verify that the selection was made correctly.<br><br>
**Close the Browser:**<br>
 - Close the browser session.<br>


### Maven Dependencies
To run this automation script, ensure you have the following Maven dependencies in your project’s pom.xml file:<br>
`<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">`
`  <modelVersion>4.0.0</modelVersion>`
  `<groupId>Mini_Project</groupId>`
  `<artifactId>Mini_Project</artifactId>`
  `<version>0.0.1-SNAPSHOT</version>`
  `<dependencies>`
  `<!-- https://mvnrepository.com/artifact/commons-io/commons-io -->`
`<dependency>`
    `<groupId>commons-io</groupId>`
    `<artifactId>commons-io</artifactId>`
    `<version>2.15.1</version>`<br>
`</dependency>`<br>
`<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->`
`<dependency>`
    `<groupId>org.seleniumhq.selenium</groupId>`
    `<artifactId>selenium-java</artifactId>`
    `<version>4.18.1</version>`<br>
`</dependency>`
  `</dependencies>`<br>
`</project>`


### Output
Search Message: 1-16 of 476 results for "mobile smartphones under 30000"<br>
Validate status of Search String:true<br>
Number of pages: 1-16<br>
Validate status of number of pages: true<br>
Number Of Items:476<br>
Validate the status of number of Items: true<br>
The count of options displayed:5<br>
Verify the count of options: false<br>
Selected option: Newest Arrivals<br>
Validate the status of selecting 'Newest Arrivals' option: true<br>