package com.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> tableHeadings = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));

		for (WebElement tHeading : tableHeadings)
			System.out.println(tHeading.getText());
		System.out.println("-------------------------------------------------------------------------------");

		List<WebElement> tableDatas = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));

		for (WebElement tdata : tableDatas) {
			System.out.println(tdata.getText());
		}
		System.out.println("-------------------------------------------------------------------------------");

		List<WebElement> columnDatas = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
		for (WebElement cData : columnDatas) {
			System.out.println(cData.getText());
		}
		System.out.println("-------------------------------------------------------------------------------");

		List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[5]"));
		for (WebElement trows : tableRows)
			System.out.println(trows.getText());

		WebElement tdata1 = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[5]/td[2]"));
		System.out.println(tdata1.getText());
		
		
		
		

		driver.close();

	}

}
