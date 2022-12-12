package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com");
		driver.get("https://www.facebook.com");
		driver.get("https://www.instagram.com");

		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();

		driver.navigate().to("https://www.flipkart.com");
		
		Actions s = new Actions(driver);
		

	}

}
