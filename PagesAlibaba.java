package com.alibaba;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PagesAlibaba {
	WebDriver driver;

	public PagesAlibaba(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Sign In")
	WebElement Signinlink;

	@FindBy(id = "fm-login-id")
	WebElement userid;

	@FindBy(id = "fm-login-password")
	WebElement password;

	@FindBy(id = "fm-keep-login")
	WebElement chechinbox;

	@FindBy(id = "fm-login-submit")
	WebElement signinbutton;

	@FindBy(name = "SearchText")
	WebElement searchItem;
	
	@FindAll(@FindBy(className = "elements-title-normal__content medium"))
	List<WebElement> itemNames;

	@FindAll(@FindBy(className = "elements-offer-price-normal__price"))
	List<WebElement> itemPrices;

	@FindBy(linkText = "Sign Out")
	WebElement signOut;

	public WebElement getSigninlink() {
		return Signinlink;
	}

	public WebElement getUserId() {
		return userid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getChechinbox() {
		return chechinbox;
	}
	
	@FindBy(xpath = "/html/body/div[1]/header/div[2]/div[4]/div[1]/div[1]/div[1]/a/div")
	WebElement myAccountAction;

	public WebElement getMyaccountaction() {
		return myAccountAction;
	}

	public WebElement getSigninbutton() {
		return signinbutton;
	}


	public WebElement getSearchItem() {
		return searchItem;
	}

	

	public List<WebElement> getItemNames() {
		return itemNames;
	}

	public List<WebElement> getItemprices() {
		return itemPrices;
	}

	public WebElement getSignOut() {
		return signOut;
	}



	

}
