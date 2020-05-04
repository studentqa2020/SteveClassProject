package com.zooplasignin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseLogin {

	public static void main(String[] args) {
		// Go to Zoopla, and verify the Title
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.zoopla.co.uk/");
				
		driver.findElement(By.xpath("//*[@class='ui-button-primary ui-cookie-accept-all-medium-large']")).click();
					
		driver.findElement(By.xpath("//*[@class= 'button button--tertiary-dark account-link__text']")).click();
			
		driver.findElement(By.xpath("//*[@id='signin_email']")).sendKeys("stevejrnyc@gmail.com");
		
		driver.findElement(By.xpath("//*[@id='signin_password']")).sendKeys("smarttech");
		
		driver.findElement(By.xpath("//*[@id='signin_submit']")).click();
		
		System.out.println(driver.getTitle());

		
	}

}
