package com.Selenium.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PhoenixLoginFlow {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--start-maximize");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://phoenix.techwithjatin.com/sign-in");
		Thread.sleep(5000);
		
		By useridlocator = By.xpath("//input[@id='username']");
		WebElement username = driver.findElement(useridlocator);
		username.clear();
		username.sendKeys("iamfd");
		
		By passwordlocator = By.id("password");
		WebElement password = driver.findElement(passwordlocator);
		password.clear();
		password.sendKeys("password");
		
		By loginbutton = By.xpath("//span[contains(text(),' Sign in ')]");
		WebElement button = driver.findElement(loginbutton);
		button.click();
		

		
		
		
	}

}
