package com.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlighter2 {

	public void getcolor(WebDriver driver,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver; // type casting polymorphism
		js.executeScript("arguments[0].setAttribute('style', 'background: red; border: 2px solid blue;');", element);

	}
	
	
	
	
}
