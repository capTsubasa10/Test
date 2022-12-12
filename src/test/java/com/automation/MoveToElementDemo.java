package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tnpsc.gov.in/");

		WebElement target = driver.findElement(By.xpath(" //a[contains(text(),'Recruitment')] "));

		WebElement moveEle = driver.findElement(By.xpath("//a[text()='Online Application Services']"));
		Actions ac = new Actions(driver);
		ac.click(target).perform();
		// Thread.sleep(2000);
		ac.moveToElement(moveEle).perform();

	}

}
