package com.baseclass;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassCucum {
	
	
	public static WebDriver driver;
	
	public static WebDriver browserlaunch(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			 WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			
			 
		 }
		 
		 else if (browser.equalsIgnoreCase("firefox")) {
			 WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
			

	}
		return driver;	

	
	}
	
	
	public static void websitelaunch	(String url) {
		driver.manage().window().maximize(); 

	}
	
	public static void send_keys(WebElement element,String value) {
		element.sendKeys(value);
	}

	
	public static void element(WebElement element) {
		element.click();
	}
	
	
	public static void click_on_element(WebElement element) {
		element.click();
	}
	
	

	 
	 
	 public static void geturl(String url) {
			try {
				driver.get(url);
				
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
			
			
	public static void waits(long mills) throws InterruptedException {
		Thread.sleep(mills);

	}
	
	public static void getscreenshot(String filename) {
		
		try {
			TakesScreenshot ts= (TakesScreenshot)driver;
			File sourcefile = ts.getScreenshotAs(OutputType.FILE);
				File destinationfile	= new File (System.getProperty("user.dir")+"\\test-output"+filename+".png");
				FileUtils.copyFile(sourcefile, destinationfile);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
	
	public static WebElement elementFinder(String option,String value) {
		 
		 try {
			 if (option.equalsIgnoreCase("name")) {
				 WebElement name = driver.findElement(By.name(value));
                return name;
				
			} else if(option.equalsIgnoreCase("xpath")) {
				WebElement xpath = driver.findElement(By.xpath(value));
				return xpath;

			}else if(option.equalsIgnoreCase("id")) {
				WebElement id = driver.findElement(By.id(value));
		        return id;
				
			}
			 
			
		 }catch (Exception e) {
			e.printStackTrace();
			
		}
		return null;

	}
	 
	
	public static void simple_confirm_alert(String acceptordismiss) {
		if (acceptordismiss.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().accept();
			
		} else {
			
			driver.switchTo().alert().dismiss();

		}

	}
	
	public static void prompt_alert(String text,String acceptordismiss) {
		org.openqa.selenium.Alert a = driver.switchTo().alert();
		a.sendKeys("hai");
		if (acceptordismiss.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().accept();
			
		} else {
			
			driver.switchTo().alert().dismiss();

		}

		

	}
	
	
}




