package com.automationprac.tests;

import com.automationprac.pages.SignUpPage;
import com.automationprac.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignUpPageTest extends BaseTest {
    //HomePage home = new HomePage(driver);
    //SignUpPage signUp = new SignUpPage(driver);

    @Test
    public void signUpTest() throws InterruptedException {
        HomePage home = new HomePage(driver); //object of homepage
        home.clickSignInButton();
        SignUpPage signUp = new SignUpPage(driver); //object of signuppage

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        signUp.setEnter_email("bezos123@gmail.com");
        signUp.setTitle();
        signUp.setFirst_name("Jeff");
        signUp.setLast_name("Bezos");
        signUp.setPassword("12345qwerty");
        signUp.selectDropdownDay(12);
        signUp.selectDropdownMonth(1);
        signUp.selectDropdownYear("1964");
        signUp.setAddress("410 Terry Ave N");
        signUp.setCity("Seattle");
        signUp.selectDropdownState("Washington");
        signUp.setZipCode("98109");
        signUp.selectDropdownCountry("United States");
        signUp.setPhone("1-206-266-1000");
        //signUp.clickRegister();
    }
    @Test
    public void signInTest() throws  InterruptedException {
        HomePage home = new HomePage(driver);
        home.clickSignInButton();
        SignUpPage signUp = new SignUpPage(driver);
        signUp.signIn("abcd123@gmail.com", "12345qwerty");
        //Thread.sleep(4000);

    }
}
