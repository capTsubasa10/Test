package com.automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Options {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");

		WebElement emailTxtBox = driver.findElement(By.id("email"));
		emailTxtBox.clear();

		boolean txtResult = emailTxtBox.isEnabled();
		System.out.println(txtResult);
		if (txtResult == true) {
			emailTxtBox.sendKeys("Oranium");
			screenShotCode();

		} else {
			System.out.println("The Textbox is not editable ");
			screenShotCode();
		}

		boolean displayMsg = emailTxtBox.isDisplayed();
		System.out.println(displayMsg);

		driver.quit();

	}

	public static void screenShotCode() throws IOException {

		TakesScreenshot tk = (TakesScreenshot) driver;
		File tempSrc = tk.getScreenshotAs(OutputType.FILE);

		File permSrc = new File("./Screenshots/ScreenShot1.png");
		FileUtils.copyFile(tempSrc, permSrc);

	}

}
