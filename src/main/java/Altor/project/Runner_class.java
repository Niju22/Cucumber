//package com.runner;
//
//import java.io.IOException;
//
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.runner.RunWith;
//import org.openqa.selenium.WebDriver;
//
//import com.baseclass.BaseClassAltoro;
//import com.baseclass.BaseClassCucum;
//import com.baseclass.Baseclass;
//import com.helper.FileReaderManager;
//
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//
//
//@RunWith(Cucumber.class)
//@CucumberOptions(
//		
//		features ="src\\test\\java\\com\\featurefile",
//		glue="com\\stepdefinition",
//		stepNotifications = true,
//		monochrome = true,
//		publish = true
//		
//		
//		
//		)	
//
//public class Runnerclass {
//	
//	public static	WebDriver driver;
//	@BeforeClass
//	public static void launchBrowser() throws IOException {
//		String launch = FileReaderManager.getInsance().getCrInsance().getLauch();
//		driver=BaseClassAltoro.browserlaunch(launch);
//
//
//	}
////	@AfterClass
////	public static void tearDown() {
////		driver.quit();
////
////	}
//	
//
//}
