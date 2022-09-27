package com.smarttechqa.basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	
	public static void setup() throws InterruptedException  {
		 
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.smarttechqa.com/login");
		driver.manage().window().maximize();
		//driver.close();
		
		driver.findElement(By.id("email")).sendKeys("testqa@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("9876aa");
		//driver.findElement(By.cssSelector("#password")).sendKeys("9876aa");// CSS mostly used with internet explorer browser
		
	
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	
		System.out.println("the titel of the page is :" +driver.getTitle());
		
		
		System.out.println("Github is created");
		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		BaseClass.setup();
	}
}
