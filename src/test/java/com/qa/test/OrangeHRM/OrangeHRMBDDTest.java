package com.qa.test.OrangeHRM;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.test.OrangeHRMPages.Constants;
import com.qa.test.OrangeHRMPages.OrangeLandingPage;

public class OrangeHRMBDDTest {

	private WebDriver driver;
	
	@Before 
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", Constants.CHROME_WEBDRIVER_PATH);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Constants.ORANGE_LANDING_PAGE);
		OrangeLandingPage orangeLandingPage=PageFactory.initElements(driver,OrangeLandingPage.class);
		orangeLandingPage.login();
		
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

	
	//@When("When I fill out the Employee Details correctly")

}
