package com.automationlogin;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.util.Highlighter;

public class automationPracticeLogin {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);

		WebDriver driver = new ChromeDriver();// upcasting polymorphism
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//implicit
		// wait ===> HTML DOM page(slow down automation)
		// driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);// pageload
		// timeout==> all object in a page is loaded or not

		driver.get("http://automationpractice.com/index.php");
		System.out.println(driver.getTitle());// Home page
		WebElement signBtn = driver.findElement(By.xpath("// *[@class='login']"));
		BaseLogin color = new BaseLogin();
		Highlighter.getcolor(driver, signBtn);
		signBtn.click();// click
		// Thread.sleep(5000);//sleep= unconditional==bad practice
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());// Login page

		WebElement email = driver.findElement(By.xpath("//*[@id='email']"));

		// Explicit wait or webdriver wait
		WebDriverWait obj = new WebDriverWait(driver, 30);
		obj.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//*[@id='email']"), 0));

		Highlighter.getcolor(driver, email);
		email.sendKeys("sarowerny@gmail.com");

		WebElement password = driver.findElement(By.xpath("//*[@id='passwd']"));

		Highlighter.getcolor(driver, password);
		password.sendKeys("student");
		Thread.sleep(3000);
		// password.submit();//click
		// *[@id='SubmitLogin']
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
		loginBtn.click();

		System.out.println(driver.getTitle());// after Login done
	}

}