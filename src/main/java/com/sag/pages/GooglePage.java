package com.sag.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

	@FindBy(name="q")
	private WebElement textbx;
	
	private WebDriver driver;

	public GooglePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchGoogle(String search) {
        this.driver.get("http://www.google.com");
		this.textbx.sendKeys(search);
		this.textbx.submit();
	}
	
	
	
	
}
