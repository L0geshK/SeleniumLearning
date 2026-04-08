package com.uiplayground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FormAutomaction {
	public static void main(String[] args) {
		
		By Firstnamelocator = By.xpath("//input[@placeholder='Jatin']");
		By Lastnamelocator = By.xpath("//input[@placeholder='Sharma']");
		By EmailLocator = By.xpath("//input[@placeholder='jatin@example.com']");
		By Passwordlocator = By.xpath("//input[@placeholder='••••••••']");
		By Phonenumberlocator = By.xpath("//input[@data-testid='input-phone']");
		By Dataofbirthlocator = By.xpath("//input[@data-testid='input-dob']");
		By Genderlocator = By.xpath("//input[@data-testid='input-gender-male']");
		By TermsLocator = By.xpath("//input[@data-testid='input-terms']");
		By Countrylocator = By.xpath("//select[@data-testid='input-country']");
		By Buttonlocator = By.xpath("//button[@class='btn btn-primary']");
		By Successlocator = By.xpath("//div[@data-testid='registration-success']/div[2]");
		
		
		
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver wd = new ChromeDriver(options);
		wd.get("http://uiplayground.techwithjatin.com/");
		
		WebElement firstnane = wd.findElement(Firstnamelocator);
		firstnane.sendKeys("Logesh");
		
		WebElement lastname = wd.findElement(Lastnamelocator);
		lastname.sendKeys("Kanna");
		
		WebElement email = wd.findElement(EmailLocator);
		email.sendKeys("Logeshkanna@gmail.com");
		
		WebElement password = wd.findElement(Passwordlocator);
		password.sendKeys("LOHDJJD");
		
		WebElement phonenumber = wd.findElement(Phonenumberlocator);
		phonenumber.sendKeys("8072150155");
		
		WebElement dob = wd.findElement(Dataofbirthlocator);
		dob.sendKeys("14");
		dob.sendKeys("10");
		dob.sendKeys("1998");
		
		WebElement gender = wd.findElement(Genderlocator);
		gender.click();
		
		WebElement terms = wd.findElement(TermsLocator);
		terms.click();
		
		WebElement country = wd.findElement(Countrylocator);
		Select select = new Select(country);
		select.selectByValue("India");
		
			
		WebElement button = wd.findElement(Buttonlocator);
		button.click();
		
		WebElement success = wd.findElement(Successlocator);
		System.out.println(success.getText());
		
		wd.close();
		
	}

}
