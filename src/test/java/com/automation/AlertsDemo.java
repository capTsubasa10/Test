package com.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		WebElement alert1 = driver.findElement(By.xpath("//button[text() = 'Click for JS Alert']"));
		alert1.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();

		WebElement alert2 = driver.findElement(By.xpath("//button[text() = 'Click for JS Confirm']"));

		alert2.click();
		Thread.sleep(2000);
		alert.dismiss();

		WebElement alert3 = driver.findElement(By.xpath("//button[text() = 'Click for JS Prompt']"));
		alert3.click();
		Thread.sleep(2000);
		alert.sendKeys("Oranium");
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
	}

}
