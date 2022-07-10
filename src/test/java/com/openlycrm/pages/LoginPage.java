package com.openlycrm.pages;

import com.openlycrm.utilities.ConfigurationReader;
import com.openlycrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "USER_LOGIN")
    public  WebElement username;

    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;

    public void login(){
        Driver.getDriver().get(ConfigurationReader.getProperty("openly.url"));
        this.username.sendKeys(ConfigurationReader.getProperty("username"));
        this.password.sendKeys(ConfigurationReader.getProperty("password"));
        this.loginButton.click();


    }
}
