package com.automationprac.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private static String page_url="http://automationpractice.com/index.php";

    @FindBy(xpath = "//a[@class='login']")
    WebElement sign_in;

    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement search_box;

    public HomePage(WebDriver driver){
        driver.get(page_url);
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public void clickSignInButton() {
        sign_in.click();
    }
    public void setSearch_box(String search) {
        search_box.sendKeys(search);
    }






}
