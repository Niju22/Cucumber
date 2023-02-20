package com.altoro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClassAltoro;
import com.baseclass.BaseClassCucum;

public class Altoro extends BaseClassAltoro {
	
	public static void main(String[] args) {
		


		
		browserlaunch("chrome");
		geturl("http://testfire.net/");
		driver.manage().window().maximize();
		WebElement signin = driver.findElement(By.id("LoginLink"));
		signin.click();
//		WebElement signin = driver.findElement(By.xpath("(//a[@href='/login.jsp'])[1]"));
//		signin.click();
		WebElement login = driver.findElement(By.id("uid"));
		login.sendKeys("admin");
		WebElement passsword = driver.findElement(By.id("passw"));
		passsword.sendKeys("admin");
		WebElement submit = driver.findElement(By.name("btnSubmit"));
		submit.click();
		
		///view account
	
		WebElement menu = driver.findElement(By.id("MenuHyperLink1"));
		menu.click();

		WebElement account = driver.findElement(By.id("listAccounts"));
		account.sendKeys("800001");
		driver.findElement(By.id("btnGetAccount")).click();
	    
	    
	    
	    
	    //Transfer fund
		
		driver.findElement(By.id("MenuHyperLink3")).click();
		WebElement toaccount = driver.findElement(By.id("toAccount"));
		toaccount.sendKeys("800001");
		WebElement transferamount = driver.findElement(By.id("transferAmount"));
		transferamount.sendKeys("9876");
		driver.findElement(By.id("transfer")).click();
		
		//Transacation
		
		driver.findElement(By.id("MenuHyperLink2")).click();
		
		
		//contactus
		
		driver.findElement(By.id("HyperLink3")).click();
		driver.findElement(By.xpath("//a[@href='feedback.jsp']")).click();
		
		//onlineform
		
		WebElement emailid = driver.findElement(By.name("email_addr"));
		emailid.sendKeys("sfdavidniju@gmail.com");
		WebElement subject = driver.findElement(By.name("subject"));
		subject.sendKeys("last transacation detils");
		WebElement comments = driver.findElement(By.name("comments"));
		comments.sendKeys("project");
		driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.id("LoginLink")).click();
		
		
		
	}

}


