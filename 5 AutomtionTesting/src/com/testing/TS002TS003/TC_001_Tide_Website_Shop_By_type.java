package com.testing.TS002TS003;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_001_Tide_Website_Shop_By_type {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://tide.com/en-us");

		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
		
		a.moveToElement(driver.findElement(By.linkText("Shop Products"))).build().perform();
		
		driver.findElement(By.xpath("//span[contains(text(),\"Pacs\")]")).click();
		
		driver.findElement(By.xpath("//strong[contains(text(),\"Febreze™ 4in1 Spring and Renewal\")]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),\"Find Retailers\")]")).click();
		
		//A page of all available options to buy the product is shown 
	}

}
