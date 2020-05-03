package com.zooplasignin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLogin {

	public static void main(String[] args) {
		// Go to Zoopla, and verify the Title
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.zoopla.co.uk/");
		
		System.out.println(driver.getTitle());

	}

}
