package com.facbook.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours {

	public static void main(String[] args) {
		// Test the New Tour Site
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// Initialize browser;//upcasting polymorphism
		// Maximize browser
		
		driver.manage().window().maximize();
		// Open newtours site http://newtours.demoaut.com/
		driver.get("http://newtours.demoaut.com/");
		
		//driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("selenium1994");
								//or
		WebElement user =  driver.findElement(By.xpath("//*[@name='userName']"));
		user.sendKeys("selenium1994");
		
		//driver.findElement(By.xpath("//*[@name='password']")).sendKeys("smarttech");
								//or
		WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
		password.sendKeys("smarttech");
		
		//driver.findElement(By.xpath("//*[@value='Login']")).click();
								//or
		WebElement Login = driver.findElement(By.xpath("//*[@value='Login']"));
		Login.click();
		
		//close browser
		//driver.close();
		//driver.quit();

	}

}
