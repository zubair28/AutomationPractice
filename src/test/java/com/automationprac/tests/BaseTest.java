package com.automationprac.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;

    @BeforeTest
    public void setUpBrowser() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver-80");
        //ChromeDriver driver = new ChromeDriver();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
