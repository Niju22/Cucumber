package Singletondesignpattern_nov28;

//package com.stepdefinition;
//
//import java.io.IOException;
//import java.util.List;
//import java.util.Map;
//
//import org.junit.BeforeClass;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.SendKeysAction;
//
//import com.baseclass.BaseClassCucum;
//import com.baseclass.Baseclass;
//import com.helper.FileReaderManager;
//import com.helper.PageObjectManager;
//import com.pom.LoginPage;
//import com.runner.Runnerclass;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
//import io.cucumber.java.Status;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Stepdefinition extends BaseClassCucum {
//
//	public static WebDriver driver = Runnerclass.driver;
//
//	PageObjectManager pom = new PageObjectManager(driver);
//
//	@Before
//	public static void beforeHooks(Scenario scenario) {
//   String name = scenario.getName();
//   System.out.println(name);
//	}
//
//	@After
//	public static void afterHooks(Scenario scenario) {
//       Status status = scenario.getStatus();
//       System.out.println(status);
//       if (scenario.isFailed()) {
//    	   getscreenshot(scenario.getName());
//		
//	}
//       
//	}
//
//	@Given("Browser launch and url")
//	public void browser_launch_and_url() throws IOException {
//
//		String address = FileReaderManager.getInsance().getCrInsance().getAddress();
//		 geturl(address);
//
//	}
//
//	@When("user enter the loginid {string}")
//	public void user_enter_the_loginid(String Username) {
//		send_keys(pom.getLp().getUsername(), Username);
//		
//
//	}
//
//	@When("user enter the logincode {string}")
//	public void user_enter_the_logincode(String Password) {
//		send_keys(pom.getLp().getPassword(), Password);
//
//	}
//
//	@Then("click login")
//	public void click_login() {
//		click_on_element(pom.getLp().getLogin());
//
//	}
//
//}
