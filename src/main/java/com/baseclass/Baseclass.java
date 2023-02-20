package com.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
protected	static ThreadLocal<WebDriver> driver=new ThreadLocal<>();
	
	public void setDriver(String browser) {
		
		
		
		if (browser.equalsIgnoreCase("chrome")) {
			 WebDriverManager.chromedriver().setup();
			 driver.set(new ChromeDriver());
			 
		 }
		 
		 else if (browser.equalsIgnoreCase("firefox")) {
			 WebDriverManager.firefoxdriver().setup();
			driver.set(new FirefoxDriver());

	}

}
	
 public static	WebDriver getDriver() {
	return driver.get();
	 
 }
	
 
 public static void geturl(String url) {
		try {
			
			getDriver().get(url);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	 public static WebElement elementFinder(String option,String value) {
		 
		 try {
			 if (option.equalsIgnoreCase("name")) {
				 WebElement name = getDriver().findElement(By.name(value));
                 return name;
				
			} else if(option.equalsIgnoreCase("xpath")) {
				WebElement xpath = getDriver().findElement(By.xpath(value));
				return xpath;

			}else if(option.equalsIgnoreCase("id")) {
				WebElement id = getDriver().findElement(By.id(value));
		        return id;
				
			}
			 
			
		 }catch (Exception e) {
			e.printStackTrace();
			
		}
		return null;

	}
	 
	 public static void send_keys(WebElement element,String value) {
		element.sendKeys(value);

	}
	 
	 public static void click_on_element(WebElement element) {
			element.click();
		}
	

}
