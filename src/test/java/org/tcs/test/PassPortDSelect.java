package org.tcs.test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PassPortDSelect extends BaseClass {
	
	public static void main(String[] args) throws IOException, InterruptedException  {
		
			//browserLaunch();
			
			/*System.out.println("****");
			// Drop Down selection
			getURL("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
			WebElement findElement = driver.findElement(By.id("dcdrLocation"));
			Select s = new Select(findElement);
			getScreenshots();
			List<WebElement> dropDownOptions = s.getOptions();
			for (int i = 0; i < dropDownOptions.size(); i++) {
				System.out.println(dropDownOptions.get(i).getText());	}
			LinkedHashSet<WebElement> newSet = new LinkedHashSet<WebElement>();
			newSet.addAll(dropDownOptions);
			for (WebElement webElement : newSet) {
				System.out.println(webElement.getText());
			}
			System.out.println(dropDownOptions.retainAll(newSet));
			
			driver.quit();*/
			
			
			// Select the last row from dynamic wb table
		
			/*getURL("http://demo.guru99.com/test/web-table-element.php#");
			driver.manage().window().maximize();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(5000);
			List<WebElement> compTable = driver.findElements(By.tagName("table"));
			WebElement table = compTable.get(0);
			List<WebElement> rows = table.findElements(By.tagName("tr"));
			int lastRow = rows.size()-1;
			WebElement row = rows.get(lastRow);	
			List<WebElement> lastRowElements = row.findElements(By.xpath("//table/tbody/tr["+lastRow+"]/td"));
			
			for (WebElement webElement : lastRowElements) {
				
			System.out.println(webElement.getText());
			}
			getScreenshots();
			driver.quit();
			
			WebDriverWait wd = new WebDriverWait(driver, 20);
			wd.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("locator"));
			
			FluentWait<WebDriver> f = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
					.pollingEvery(Duration.ofSeconds(2)).ignoring(Throwable.class);*/
			
			String s1= "Adhiyan";
			String s2= "Rajappa";
			
			
			char[] charArray = s1.toCharArray();
			char[] charArray2 = s2.toCharArray();

			String newString = "";
			// int totalLen= charArray.length + charArray2.length;

			
			Boolean flag = true;
			
			for (int i = 0; i < Math.max(charArray.length, charArray2.length); i++) {
				
			if (flag == true && i < charArray.length) {
					
					newString = newString + charArray[i];
					flag= false;
					if (i >=charArray2.length) { 
						flag= true;
					}

				}

				 if (flag == false && i < charArray2.length) {
					newString = newString + charArray2[i];
						flag = true;
						if (i >= charArray.length) {
							flag= false;
						}

				}
			
			}
			System.out.println(newString);
	}

}
