package login_nov22;

//package com.stepdefinition;
//
//import org.openqa.selenium.WebElement;
//
//import com.baseclass.Baseclass;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Stepdefinition  extends Baseclass{
//	
//	
//	@Given("Brwoser launch and url")
//	public void brwoser_launch_and_url() {
//	    setDriver("chrome");
//	    getDriver().manage().window().maximize();
//	    geturl("https://www.saucedemo.com/");
//	}
//	@When("Enter The Username")
//	public void enter_the_username() {
//		WebElement username = elementFinder("id", "user-name");
//		username.sendKeys("standard_user");
//	}
//	@And("Enter The Password")
//	public void enter_the_password() {
//		WebElement password = elementFinder("id", "password");
//		password.sendKeys("secret_sauce");
//	    
//	}
//	@Then("Click login")
//	public void click_login() {
//		WebElement login = elementFinder("id", "login-button");
//		login.click();
//	    
//	}
//
//
//}
