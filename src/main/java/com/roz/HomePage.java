package com.roz;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){

        this.driver = driver;
    }

    public HomePage openHomePage(){
        driver.get("http://rozetka.com.ua/");
        return this;
    }

    public HomePage hoverNoutPlanshCompLink(){
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.cssSelector("[href=\"http://rozetka.com.ua/computers-notebooks/c80253/\"]"));
        action.moveToElement(we).build().perform();

        return this;
    }

    public HomePage hoverNoutsLink1(){
        Actions action = new Actions(driver);
        WebElement we1 = driver.findElement(By.cssSelector("a[href=\"http://rozetka.com.ua/notebooks/c80004/\"]"));
        action.moveToElement(we1).build().perform();

        return this;
    }

    public HomePage clickNoutsLink2(){
        driver.findElement(By.cssSelector("a[href=\"http://rozetka.com.ua/notebooks/c80004/filter/\"")).click();

        return this;
    }
}
