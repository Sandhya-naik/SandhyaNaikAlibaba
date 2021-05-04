package com.alibaba;

import org.testng.annotations.Test;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import com.qa.utility.ExcelUtility;

public class Alibaba_test extends TestBase {

	@Test(dataProvider = "getData", priority = 1)
	public void signInAlibaba(String Input1, String Input2) throws InterruptedException {

		alibaba.getSigninlink().click();

		alibaba.getUserId().sendKeys(Input1);
		alibaba.getPassword().sendKeys(Input2);
		alibaba.getChechinbox().isSelected();
		alibaba.getSigninbutton().click();
		Thread.sleep(5000);

	}

	@Test(priority = 2)
	public void SearchForBags() throws InterruptedException

	{
		alibaba.getSearchItem().clear();
		alibaba.getSearchItem().sendKeys("Bags");
		alibaba.getSearchItem().submit();
		Thread.sleep(3000);

	}

	@Test(priority = 3)
	public void logOutAlibaba() throws InterruptedException {
		WebElement ele = alibaba.getMyaccountaction();
		action.moveToElement(ele).perform();
		Thread.sleep(2000);
		WebElement ele1 = alibaba.getSignOut();
		action.moveToElement(ele1).perform();
		alibaba.getSignOut().click();

	}

	@DataProvider
	public String[][] getData() throws IOException {
		String xlPath = "E:\\selenuim\\testNG26\\src\\test\\java\\com\\testdata\\TestData.xlsx";

		String xlSheet = "Sheet1";

		int rowCount = ExcelUtility.getRowCount(xlPath, xlSheet);

		int cellCount = ExcelUtility.getCellCount(xlPath, xlSheet, rowCount);

		String[][] data = new String[rowCount][cellCount];

		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				data[i - 1][j] = ExcelUtility.getCellData(xlPath, xlSheet, i, j);

			}
		}

		return data;
	}

}