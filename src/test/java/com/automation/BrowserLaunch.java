package com.automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty(null, null);
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver(); //Chrome brower launches
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
		
	}

}
