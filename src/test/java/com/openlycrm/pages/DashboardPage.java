package com.openlycrm.pages;

import com.openlycrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public class DashboardPage {



    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Employees']")
    public  WebElement employeesButton;

    @FindBy(xpath = "//span[@class='webform-small-button-text']")
    public WebElement addDepartment;

    @FindBy(xpath = "//input[contains(@id,'NAME')]")
    public WebElement addBox;

    @FindBy(xpath = "//span[contains(@class,'popup-window-button popup-window-button-accept')]")
    public WebElement addButton;

    @FindBy(xpath = "//select[contains(@id,'IBLOCK_SECTION_ID')]")
    public WebElement parentMenu;

    @FindBy(xpath = "//input[@name = 'site_id']")
    public WebElement parentDepartment;

    @FindBy(xpath = "//span[@class='logo-text']")
    public WebElement dashboardLogo;

    @FindBy(xpath = "//a[@id='single-user-choice']")
    public WebElement selectFromStructure;

    @FindBy(xpath = "//div[@class='finder-box-item-text']")
    public WebElement superVisor;

    @FindBy(xpath = "//a[@title='New Hr']")
    public WebElement newHrDisplay;

    @FindBy(xpath = "//input[contains(@id,'NAME')]")
    public WebElement departmentNameBox;

    @FindBy(xpath = "//input[contains(@id,'NAME')]")
    public WebElement newDepartment;

    @FindBy(xpath = "//span[@class='popup-window-close-icon popup-window-titlebar-close-icon']")
    public WebElement closeAddDepartment;


    @FindBy(xpath = "//div[@class='structure-employee-title']")
    public WebElement closeDepartment;

    @FindBy(xpath = "//div[@title='Add child department']")
    public WebElement addChildPlus;

    @FindBy(xpath = "//input[contains(@id,'NAME')]")
    public WebElement departmentName;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public WebElement addchildButton;

    @FindBy(xpath = "//a[@title='Child2']")
    public WebElement displayChild;

    @FindBy(xpath = "//select[contains(@id,'IBLOCK_SECTION_ID')]")
    public WebElement parentName;

    @FindBy(xpath = "//span[@class='pagetitle-item']")
    public WebElement companyStructure;




    }


