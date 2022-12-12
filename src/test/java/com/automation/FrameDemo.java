
package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("https://leafground.com/frame.xhtml;jsessionid=node0pmln8bnsefoiz20krxnjiub60675.node0");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);

		WebElement ele1 = driver.findElement(By.id("Click"));
		ele1.click();

		driver.switchTo().defaultContent();

		WebElement nframe1 = driver.findElement(By.xpath("//iframe[@src= 'page.xhtml']"));
		driver.switchTo().frame(nframe1);
		driver.switchTo().frame("frame2");

		WebElement ele2 = driver.findElement(By.id("Click"));
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(ele2));
		
		
		ele2.click();

	}

}
