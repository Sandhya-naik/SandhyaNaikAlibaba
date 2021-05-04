package com.alibaba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

public class TestBase {

	WebDriver driver;
	SoftAssert SAssert;

	PagesAlibaba alibaba;
	Actions action;

	@BeforeClass
	public void setUp() {

		{
			System.setProperty("webdriver.edge.driver", "E:\\selenuim\\msedgedriver.exe");
			driver = new EdgeDriver();

			alibaba = new PagesAlibaba(driver);
			action = new Actions(driver);
			driver.get("http://www.alibaba.com/");
			SAssert = new SoftAssert();
		}
	}

	@AfterClass
	public void TearDown() {
		driver.close();
	}

}
