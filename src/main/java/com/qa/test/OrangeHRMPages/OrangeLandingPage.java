package com.qa.test.OrangeHRMPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeLandingPage {
	
	@FindBy(id="txtUsername")
	private WebElement usernameInput;
	
	@FindBy(id="txtPassword")
	private WebElement passwordInput;
	
	@FindBy(id="btnLogin")
	private WebElement loginButton;
	
	public void login() {
		usernameInput.sendKeys("Admin");
		passwordInput.sendKeys("admin");
		loginButton.click();
	}
}
