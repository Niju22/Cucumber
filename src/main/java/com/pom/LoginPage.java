package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;






public class LoginPage {
	
	
	public static WebDriver	driver1;
	
	@FindBy(id = "LoginLink") private WebElement signin;
	@FindBy(id = "uid") private WebElement username;
	@FindBy(id = "passw") private WebElement password;
	@FindBy(name = "btnSubmit") private WebElement login;
	
	
	

	@FindBy(id ="MenuHyperLink1")private WebElement menu;
	@FindBy(id ="listAccounts")private WebElement account;
	@FindBy(id ="btnGetAccount")private WebElement go;
	
	
	@FindBy(id ="MenuHyperLink3")private WebElement transferfund;
	@FindBy(id ="toAccount")private WebElement toaccount;
	@FindBy(id ="transferAmount")private WebElement transfamount;
	@FindBy(id ="transfer")private WebElement transfermoney;
	


    
	@FindBy(id ="MenuHyperLink2") private WebElement transaction;
   


	
	@FindBy(id ="HyperLink3") private WebElement contact;
	@FindBy(xpath ="//a[@href='feedback.jsp']") private WebElement onlineform;
	@FindBy(name ="email_addr") private WebElement emailadd;
	@FindBy(name ="subject") private WebElement subject;
	@FindBy(name ="comments") private WebElement comment;
	@FindBy(name ="submit") private WebElement submit;
	@FindBy(id ="LoginLink") private WebElement signout;








	public LoginPage(WebDriver driver) {
    this.driver1=driver;
    PageFactory.initElements( driver,this);
	}
    
    
    
    
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	
	public WebElement getSignin() {
		return signin;
	}
	
	
	
	
	
	public WebElement getMenu() {
		return menu;
	}

	public WebElement getAccount() {
		return account;
	}
	 public WebElement getGo() {
			return go;
		}



	
		public WebElement getTransferfund() {
			return transferfund;
		}
		public WebElement getToaccount() {
			return toaccount;
		}

		public WebElement getTransfamount() {
			return transfamount;
		}

		public WebElement getTransfermoney() {
			return transfermoney;
		}
	

		public WebElement getTransaction() {
			return transaction;
		}

		
		
		
		public WebElement getContact() {
			return contact;
		}
		public WebElement getOnlineform() {
			return onlineform;
		}
		public WebElement getEmailadd() {
			return emailadd;
		}
		public WebElement getSubject() {
			return subject;
		}
		public WebElement getComment() {
			return comment;
		}

		public WebElement getSubmit() {
			return submit;
		}
		public WebElement getSignout() {
			return signout;
		}

    
	
		   

}
