package Scenariowithsingledata_nov24;

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
//	@When("Enter valid  data from Datatable")
//	public void enter_valid_data_from_datatable(DataTable dataTable) {
//		List<Map<String, String>> asMaps = dataTable.asMaps(String.class,String.class);
//		String loginname = asMaps.get(0).get("Username");
//		String loginpassword = asMaps.get(0).get("Password");
//		
//		WebElement login = elementFinder("id", "user-name");
//		send_keys(login, loginname);
//		WebElement logincode = elementFinder("id", "password");
//		send_keys(logincode, loginpassword);
//	  
//	}
//	@Then("click login")
//	public void click_login() {
//		WebElement login = elementFinder("id", "login-button");
//		login.click();
//	}
//
//
//}
