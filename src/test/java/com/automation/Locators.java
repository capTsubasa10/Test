package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		//driver.findElement(By.id("email")).sendKeys("Oranium");
		
		 WebElement emailTxtBox = driver.findElement(By.id("email"));
		 emailTxtBox.sendKeys("OraniumTech@gmail.com");
		 
		WebElement pwdTxtBox =  driver.findElement(By.name("pass"));
		pwdTxtBox.sendKeys("12345678");
		Thread.sleep(2000);
		
		//WebElement loginBtn = driver.findElement(By.className("_42ft"));  //type conversion
		//loginBtn.click();
		
		WebElement forgotLink = driver.findElement(By.linkText("Forgotten password?"));  //ctrl + num 2 press & release + Press l
		forgotLink.click();
		Thread.sleep(2000);
		
		WebElement forAccount = driver.findElement(By.partialLinkText("Forgotten"));
		forAccount.click();
		Thread.sleep(3000);
		
		//driver.close();
		driver.quit();
	}

}
