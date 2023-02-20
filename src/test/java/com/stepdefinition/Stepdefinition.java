package com.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;

import com.baseclass.BaseClassAltoro;
import com.baseclass.BaseClassCucum;
import com.baseclass.Baseclass;
import com.helper.FileReaderManager;
import com.helper.PageObjectManager;
import com.pom.LoginPage;
import com.runner.Runnerclass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends BaseClassAltoro {

	public static WebDriver driver = Runnerclass.driver;

	PageObjectManager pom = new PageObjectManager(driver);

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

	@Given("Browser launch and url")
	public void browser_launch_and_url() throws IOException {
		String address = FileReaderManager.getInsance().getCrInsance().getAddress();
		 geturl(address);
		
		 

	}

	
	@When("Navigate to sigin application")
	public void navigate_to_sigin_application() {
		click_on_element(pom.getLp().getSignin());
	}
	
	
	@When("user enter the loginid {string}")
	public void user_enter_the_loginid(String Username) {
		send_keys(pom.getLp().getUsername(), Username);
		
		

	}

	@When("user enter the logincode {string}")
	public void user_enter_the_logincode(String Password) {
		send_keys(pom.getLp().getPassword(), Password);

	}

	@Then("click login")
	public void click_login() {
		click_on_element(pom.getLp().getLogin());
		
	}




@When("View Account Summary")
public void view_account_summary() {
	click_on_element(pom.getLp().getMenu());
	click_on_element(pom.getLp().getAccount());
    
}
@When("Select the value of {int}")
public void select_the_value_of(Integer int1) {
	send_keys(pom.getLp().getAccount(), "800001");
}
@Then("Click go button")
public void click_go_button() {
	click_on_element(pom.getLp().getGo());
    
}


@When("click on the transfer fund button")
public void click_on_the_transfer_fund_button() {
	click_on_element(pom.getLp().getTransferfund());	
    
}
@When("select the to account")
public void select_the_to_account() {
	click_on_element(pom.getLp().getToaccount());
	send_keys(pom.getLp().getToaccount(), "800001");
   
}
@When("Enter the tranfer amount")
public void enter_the_tranfer_amount() {
	click_on_element(pom.getLp().getTransfamount());
	send_keys(pom.getLp().getTransfamount(), "9876");
    
}
@Then("Click on Transfer money")
public void click_on_transfer_money() {
	click_on_element(pom.getLp().getTransfermoney());
   
}


@When("Click recent view transaction")
public void click_recent_view_transaction() {
	click_on_element(pom.getLp().getTransaction());
   
}



@When("Click the contact button")
public void click_the_contact_button() {
	click_on_element(pom.getLp().getContact());
    
}
@When("Click Online form button")
public void click_online_form_button() {
	click_on_element(pom.getLp().getOnlineform());
   
}
@When("Enter the email address")
public void enter_the_email_address() {
    click_on_element(pom.getLp().getEmailadd());
    send_keys(pom.getLp().getEmailadd(), "sfdavidniju@gmail.com");
    
}
@When("Enter the subject")
public void enter_the_subject() {
	click_on_element(pom.getLp().getSubject());
	send_keys(pom.getLp().getSubject(), "last transacation detils");
    
}
@When("Enter the comment")
public void enter_the_comment() {
	click_on_element(pom.getLp().getComment());
	send_keys(pom.getLp().getComment(),"AltoroMutual");
    
}
@Then("Click submit button")
public void click_submit_button() {
	click_on_element(pom.getLp().getSubmit());
	click_on_element(pom.getLp().getSignout());
    
}


}
