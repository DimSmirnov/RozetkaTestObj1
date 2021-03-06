package com.roz;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SuperTest {
    private WebDriver driver;
    private HomePage homePage;
    private SearchResultPage searchResultPage;
    private VideoPage videoPage;


    @Before
    public void precondition(){
        driver = new FirefoxDriver();
        homePage = new HomePage(driver);
        searchResultPage = new SearchResultPage(driver);
        videoPage = new VideoPage(driver);
    }

    @Test
    public void test() throws InterruptedException {
        homePage.openHomePage();
        homePage.hoverNoutPlanshCompLink();
        Thread.sleep(2000);
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePage.hoverNoutsLink1();
        homePage.clickNoutsLink2();
        Thread.sleep(2000);

        searchResultPage.hoverNoutInformLink();
        searchResultPage.clickVideoLink();
        Thread.sleep(2000);

        String checkText = videoPage.checkText();
        Assert.assertEquals(checkText, "Подпишитесь на наш канал!");
    }

    @After
    public void postcondition(){

        driver.quit();
    }
}
