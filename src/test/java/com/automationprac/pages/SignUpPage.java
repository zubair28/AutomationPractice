package com.automationprac.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import  org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
    private WebDriver driver;

    @FindBy(xpath = "//*[@id='email_create']")
    WebElement enter_email;

   /* @FindBy(xpath = "//*[@id='SubmitCreate']/span")
    WebElement create_account_button;*/

    @FindBy(xpath = "//label[@for='id_gender1']")
    WebElement suffix;

    @FindBy(id = "customer_firstname")
    WebElement first_name;

    @FindBy(id = "customer_lastname")
    WebElement last_name;

    @FindBy(id = "passwd")
    WebElement password;

    @FindBy(id = "days")
    WebElement day;

    @FindBy(id = "months")
    WebElement month;

    @FindBy(id ="years")
    WebElement year;

    @FindBy(id = "address1")
    WebElement address;

    @FindBy(id = "city")
    WebElement city;

    @FindBy(id = "id_state")
    WebElement state;

    @FindBy(id = "postcode")
    WebElement zip;

    @FindBy(id = "id_country")
    WebElement country;

    @FindBy(id = "phone_mobile")
    WebElement phone;

    @FindBy(xpath = "//button[@id='submitAccount']")
    WebElement registerbutton;

    @FindBy(id = "email")
    WebElement email1;

    @FindBy(id = "passwd")
    WebElement password1;

    @FindBy(xpath = "//*[@id='SubmitLogin']")
    WebElement sign_in;

    public SignUpPage(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    public void setEnter_email(String email) {
        enter_email.sendKeys(email, Keys.RETURN);
    }
    public void setTitle() {
        suffix.click();
    }
    public void setFirst_name(String firstname) {
        first_name.sendKeys(firstname);
    }
    public void setLast_name(String lastName) {
        last_name.sendKeys(lastName);
    }
    public void setPassword(CharSequence yourpassword) {
        password.sendKeys(yourpassword);
    }
    public void selectDropdownDay(int value) {
        new Select(day).selectByIndex(value);
    }
    public void selectDropdownMonth(int value) {
        new Select(month).selectByIndex(value);
    }
    public void selectDropdownYear(String value) {
        new Select(year).selectByValue(value);
    }
    //----------------ADDRESS-----------------//

    public void setAddress(String youraddress) {
        address.sendKeys(youraddress);
    }
    public void setCity(String yourcity) {
        city.sendKeys(yourcity);
    }
    public void selectDropdownState(String value) {
        new Select(state).selectByVisibleText(value);
    }
    public void setZipCode(String zipCode) {
        zip.sendKeys(zipCode);
    }
    public void selectDropdownCountry(String value) {
        new Select(country).selectByVisibleText(value);
    }
    public void setPhone(String phonenum) {
        phone.sendKeys(phonenum);
    }
    public void clickRegister() {
        registerbutton.click();
    }
    public void signIn(String youremail, String yourpassword) {
        email1.sendKeys(youremail);
        password1.sendKeys(yourpassword);
        sign_in.click();
    }



}
