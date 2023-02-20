package Scenariooutlinenov24;

//package com.stepdefinition;
//
//import java.util.List;
//import java.util.Map;
//
//import org.openqa.selenium.WebElement;
//
//import com.baseclass.Baseclass;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Stepdefinition  extends Baseclass{
//	
//	
//	@Given("Browser launch and url")
//	public void browser_launch_and_url() {
//		
//		setDriver("chrome");
//	    getDriver().manage().window().maximize();
//	    geturl("https://www.saucedemo.com/");
//	  
//	}
//	@When("user enter the loginid {string}")
//	public void user_enter_the_loginid(String Username   ) {
//		WebElement elementFinder = elementFinder("id", "user-name");
//		send_keys(elementFinder, Username);
//	    
//	}
//	@When("user enter the logincode {string}")
//	public void user_enter_the_logincode(String Password) {
//		WebElement elementFinder = elementFinder("id", "password");
//		send_keys(elementFinder, Password);
//	    
//	}
//
//
//	@Then("click login")
//	public void click_login() {
//		WebElement login = elementFinder("id", "login-button");
//		login.click();
//	}
//
//
//}
