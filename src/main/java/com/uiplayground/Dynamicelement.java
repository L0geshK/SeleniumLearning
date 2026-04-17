package com.uiplayground;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamicelement {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver wd = new ChromeDriver(options);
        wd.get("http://uiplayground.techwithjatin.com/");
        By Dynamicelement = By.xpath("//span[contains(text(),'Dynamic Elements')]/..");

        WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(30));
        WebElement dynamicele = wait.until(ExpectedConditions.visibilityOfElementLocated(Dynamicelement));
        dynamicele.click();

        By AddMenuLocator = By.id("btn-add-item");
        WebElement Addmenu = wait.until(ExpectedConditions.visibilityOfElementLocated(AddMenuLocator));
       
        Addmenu.click();
        Thread.sleep(3000);
        Addmenu.click();
        Thread.sleep(3000);
        Addmenu.click();
        Thread.sleep(3000);
        
        By swiggyCardLocator = By.xpath("//div[@class='swiggy-card']");
        List<WebElement>FoodList = wd.findElements(swiggyCardLocator);
        System.out.println(FoodList.size());

        for(WebElement Fooditem :FoodList){
           By foodnamelocator = By.xpath(".//div[@class='swiggy-name']");
           WebElement foodname = Fooditem.findElement(foodnamelocator);
           System.out.println(foodname.getText());

            By pricenamelocator = By.xpath(".//span[@class='swiggy-price']");
           WebElement price = Fooditem.findElement(pricenamelocator);
           System.out.println(price.getText());

        }

        By counterclasslocator = By.xpath("//div[@id='live-counter']");
        WebElement counterclass = wd.findElement(counterclasslocator);
        System.out.println(counterclass.getText());

       
        By hidelocatorbutton = By.xpath("//button[@id='btn-toggle-visibility']");
        WebElement hidebutton = wd.findElement(hidelocatorbutton);
        hidebutton.click();

        By visibilitystateLocator = By.xpath("//span[@data-testid='visibility-state']");
        WebElement Visibility = wd.findElement(visibilitystateLocator);
        System.out.println("visibility-state"+Visibility.getText());





    }

}
