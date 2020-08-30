package org.tcs.test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public static WebDriver driver;
	
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJAPPA\\Desktop\\Vanaja\\MavenProjects\\TestNGWoolsWorth\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	
	public static void getURL(String s) {
		driver.get(s);

	}
	
	public static void btnClick(WebElement e) {
		e.click();
	}
	
	public static  void textInput(WebElement e, String text) {
	e.sendKeys(text);

	}
	public static void getScreenshots() throws IOException {
		TakesScreenshot  ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat sd = new SimpleDateFormat("MMDDYYYYHHmmss");
		String dateAndTime = sd.format(new Date());
		System.out.println(dateAndTime);
		String filePath="C:\\Users\\RAJAPPA\\Desktop\\Vanaja\\MavenProjects\\TestNGWoolsWorth\\Screenshots\\Screen_" + dateAndTime +".png";
		
		File desc = new File (filePath);
		FileUtils.copyFile(screenshotAs, desc);	

	}

}
