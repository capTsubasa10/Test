package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollUpAndDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/ref=nav_logo");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,5000)");

		Thread.sleep(2000);

		jse.executeScript("window.scrollTo(0,-5000)");

		Thread.sleep(2000);

		WebElement downMark = driver.findElement(By.xpath("//div[@class='navFooterLine navFooterLogoLine']"));

		jse.executeScript("arguments[0].scrollIntoView(true)", downMark);

	}

}
