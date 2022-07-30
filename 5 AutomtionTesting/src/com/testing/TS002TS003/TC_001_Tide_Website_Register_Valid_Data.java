package com.testing.TS002TS003;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_001_Tide_Website_Register_Valid_Data {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://tide.com/en-us");

		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
		
		driver.findElement(By.linkText("Sign up now")).click();
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Alex");
		
		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("r.sinchana.shetty@gmail.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("9753Aelx@");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@value=\"CREATE ACCOUNT\"]")).click();
;	}
}
