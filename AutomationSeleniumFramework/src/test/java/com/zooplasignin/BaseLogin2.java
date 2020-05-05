package com.zooplasignin;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseLogin2 {

	public static void main(String[] args) {
		//Try with the Wait time, and Highlight options
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.zoopla.co.uk/");
		
		driver.findElement(By.xpath("//*[@class='ui-button-primary ui-cookie-accept-all-medium-large']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class= 'button button--tertiary-dark account-link__text']")));
		
		WebElement signin = driver.findElement(By.xpath("//*[@class= 'button button--tertiary-dark account-link__text']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid yellow;');", signin);
		
		signin.click();
		
		driver.findElement(By.xpath("//*[@id='signin_email']")).sendKeys("stevejrnyc@gmail.com");
		
		driver.findElement(By.xpath("//*[@id='signin_password']")).sendKeys("smarttech");
		
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
				
		WebElement signInButton = driver.findElement(By.xpath("//*[@id='signin_submit']"));
		
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid yellow;');", signInButton);
		
		signInButton.click();
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}

	}

