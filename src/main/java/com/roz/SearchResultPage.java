package com.roz;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SearchResultPage {
    private WebDriver driver;

    public SearchResultPage(WebDriver driver){

        this.driver = driver;
    }

    public SearchResultPage hoverNoutInformLink(){
        Actions action = new Actions(driver);
        WebElement we2 = driver.findElement(By.cssSelector("#block_with_goods > div.g-i-tile-l.clearfix > div:nth-child(4)"));
        action.moveToElement(we2).build().perform();

        return this;
    }

    public SearchResultPage clickVideoLink(){
        driver.findElement(By.cssSelector("div.g-i-tile:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)")).click();
        return  this;
    }
}
