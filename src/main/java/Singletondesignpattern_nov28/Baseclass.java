package Singletondesignpattern_nov28;

//package com.baseclass;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class BaseClassCucum {
//	
//	
//	static WebDriver driver;
//	
//	public static WebDriver browserlaunch(String browser) {
//		
//		if (browser.equalsIgnoreCase("chrome")) {
//			 WebDriverManager.chromedriver().setup();
//			 driver=new ChromeDriver();
//			
//			 
//		 }
//		 
//		 else if (browser.equalsIgnoreCase("firefox")) {
//			 WebDriverManager.firefoxdriver().setup();
//			 driver=new FirefoxDriver();
//			
//
//	}
//		return driver;	
//
//	
//	}
//	
//	
//	public static void websitelaunch	(String url) {
//		driver.manage().window().maximize(); 
//
//	}
//	
//	public static void send_keys(WebElement element,String value) {
//		element.sendKeys(value);
//	}
//
//	
//	public static void element(WebElement element) {
//		element.click();
//	}
//	
//	
//	public static void click_on_element(WebElement element) {
//		element.click();
//	}
//	
//	
//
//	 
//	 
//	 public static void geturl(String url) {
//			try {
//				driver.get(url);
//				
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//
//		}
//			
//			
//	public static void waits(long mills) throws InterruptedException {
//		Thread.sleep(mills);
//
//	}
//	
//	public static void simple_confirm_alert(String acceptordismiss) {
//		if (acceptordismiss.equalsIgnoreCase("ok")) {
//			driver.switchTo().alert().accept();
//			
//		} else {
//			
//			driver.switchTo().alert().dismiss();
//
//		}
//
//	}
//	
//	public static void prompt_alert(String text,String acceptordismiss) {
//		org.openqa.selenium.Alert a = driver.switchTo().alert();
//		a.sendKeys("hai");
//		if (acceptordismiss.equalsIgnoreCase("ok")) {
//			driver.switchTo().alert().accept();
//			
//		} else {
//			
//			driver.switchTo().alert().dismiss();
//
//		}
//
//		
//
//	}
//	
//	
//}
//
//
