package com.automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");

		String parentwindow = driver.getWindowHandle(); // parent

		WebElement newWindowBtn = driver.findElement(By.xpath("//button[@id= 'windowButton']"));

		newWindowBtn.click();

		Set<String> windowHandles = driver.getWindowHandles();
		for (String newWindow : windowHandles) {
			driver.switchTo().window(newWindow);
			driver.manage().window().maximize();

		}
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parentwindow);
		driver.close();

	}

}
