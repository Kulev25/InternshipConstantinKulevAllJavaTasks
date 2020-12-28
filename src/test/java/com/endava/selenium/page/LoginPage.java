package com.endava.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(xpath = "//a[contains(@href, 'user/login/')]")
    private WebElement connectButton;
    @FindBy(xpath = "//input[contains(@id, 'login_email')]")
    private WebElement loginField;
    @FindBy(xpath = "//input[contains(@id, 'login_pass')]")
    private WebElement passwordField;
    @FindBy(xpath = "//input[contains(@type, 'submit')]")
    private WebElement submitButton;
    @FindBy(xpath = "//a[contains(@href, '/user/personal/')]")
    private WebElement loginValidation;

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String email, String password) {
        connectButton.click();
        loginField.sendKeys(email);
        passwordField.sendKeys(password);
        submitButton.click();
    }

    public WebElement getLoginValidation() {
        return loginValidation;
    }

    public String getLoginValidationValue() {
        return loginValidation.getText();
    }

}
