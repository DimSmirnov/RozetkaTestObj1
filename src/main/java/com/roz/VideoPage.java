package com.roz;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VideoPage {
    private WebDriver driver;

    public VideoPage(WebDriver driver){
        this.driver = driver;
    }

    public VideoPage checkText(){
        String text = driver.findElement(By.xpath("//h3[text()='Подпишитесь на наш канал!']")).getText();
        return this;
    }
}
