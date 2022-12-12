package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_nxqtetlae_e&adgrpid=60571832564&hvpone=&hvptwo=&hvadid=486453138860&hvpos=&hvnetw=g&hvrand=3703083378447668503&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061896&hvtargid=kwd-296458789801&hydadcr=14452_2154371&gclid=Cj0KCQiAm5ycBhCXARIsAPldzoVuAr-up9uPSnDRLS8OC6WQLntLPFG195AHNdo4okGM8p6psSNSOD0aAriBEALw_wcB");
		Thread.sleep(2000);
		WebElement searchBox = driver.findElement(By.xpath("//input[@aria-label ='Search' ]"));
		searchBox.sendKeys("Mobile",Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
