package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActionsTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://demoqa.com/droppable/");
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");

		/*
		 * WebElement source = driver.findElement(By.id("draggable")); WebElement target
		 * = driver.findElement(By.id("droppable"));
		 */Thread.sleep(1000);

		WebElement sourceAdd = driver.findElement(By.xpath("//img[@id='drag1' and @alt='W3Schools' ]"));
		WebElement destAdd = driver.findElement(By.xpath("(//div[@id='div2'])[position()='1']"));

		Actions a = new Actions(driver); // a.dragAndDrop(source, target).perform();
		a.dragAndDrop(sourceAdd, destAdd).perform();

	}

}
