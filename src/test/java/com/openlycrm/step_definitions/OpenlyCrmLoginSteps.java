package com.openlycrm.step_definitions;


import com.openlycrm.pages.DashboardPage;
import com.openlycrm.pages.LoginPage;
import com.openlycrm.utilities.BrowserUtils;
import com.openlycrm.utilities.ConfigurationReader;
import com.openlycrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.List;
import java.util.Map;

public class OpenlyCrmLoginSteps {


    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();


//AC-1

    @Given("On the given user login page")
    public void onTheGivenUserLoginPage() {
    Driver.getDriver().get(ConfigurationReader.getProperty("openly.url"));
}

    @When("Users trying to login as {string} and {string}")
    public void usersTryingToLoginAsAnd(String arg0, String arg1) {
        loginPage.username.sendKeys(arg0);
        loginPage.password.sendKeys(arg1);
        BrowserUtils.sleep(1);
        loginPage.loginButton.click();

    }

    @Then("verify the URL")
    public void verifyTheURL() {
        BrowserUtils.verifyElementDisplayed(dashboardPage.dashboardLogo);
    }

    //AC-2
    @Given("Hr user clicks Employees in the quick menu and sees the Company Structure")
    public void hr_user_clicks_employees_in_the_quick_menu_and_sees_the_company_structure() {
        loginPage.login();
        dashboardPage.employeesButton.click();
    }
    @When("Hr user  add a department from the company structure.")
    public void hr_user_add_a_department_from_the_company_structure() {
    dashboardPage.addDepartment.click();
    }
    @When("Hr user can type New Hr in the department add box")
    public void hr_user_can_type_new_hr_in_the_department_add_box() {
    dashboardPage.addBox.sendKeys("New Hr");

    dashboardPage.addButton.click();
    }
    @Then("Hr user should see new department in the company structure schema")
    public void hr_user_should_see_new_department_in_the_company_structure_schema() {

        BrowserUtils.verifyElementDisplayed(dashboardPage.addBox);

    }

    //AC-3
    @When("Hr user click on  top menu search box")
    public void hr_user_click_on_top_menu_search_box() {
        dashboardPage.parentMenu.click();
    }
    @When("Hr user  choose your {string} option")
    public void hr_user_choose_your_option(String string) {


        dashboardPage.parentDepartment.isSelected();
       BrowserUtils.sleep(1);
       dashboardPage.addButton.click();
    }
    @Then("Hr user can choose parent menu from department box")
    public void hr_user_can_choose_parent_menu_from_department_box() {

        BrowserUtils.verifyElementDisplayed(dashboardPage.parentMenu);
    }
 //AC - 4
        @Given("Let hr user click the add a department button from the company structure.")
        public void let_hr_user_click_the_add_a_department_button_from_the_company_structure() {
        loginPage.login();
        dashboardPage.employeesButton.click();
        dashboardPage.addDepartment.click();
        }


        @When("Hr user click Select from structure")
        public void hrUserClickSelectFromStructure() {
            BrowserUtils.sleep(1);
        dashboardPage.selectFromStructure.click();

        }
        @When("Let hr user supervisor select and click")
        public void let_hr_user_supervisor_select_and_click() {
            BrowserUtils.sleep(1);
        dashboardPage.superVisor.click();

        }
        @When("Click the hr user add button")
        public void click_the_hr_user_add_button() {
            BrowserUtils.sleep(1);
        dashboardPage.addButton.click();
        }
        @Then("Let hr user validate the view")
        public void let_hr_user_validate_the_view() {
        BrowserUtils.verifyElementDisplayed(dashboardPage.newHrDisplay);
        }

        //AC-5
        @When("Hr user click the New Department search box")
        public void hr_user_click_the_new_department_search_box() {

        dashboardPage.employeesButton.click();
        }

        @When("Hr user select HR department")

        public void hr_user_select_hr_department() {
        dashboardPage.addDepartment.click();
        dashboardPage.departmentNameBox.click();
        dashboardPage.newDepartment.click();
    }
    @When("Hr user close the add department")
    public void hr_user_close_the_add_department() {
        dashboardPage.closeAddDepartment.click();
    }
    @Then("Verify that add department is closed")
    public void verify_that_add_department_is_closed() {
    String expected = "https://qa.openlycrm.com/company/vis_structure.php";
    String actual = Driver.getDriver().getCurrentUrl();

    Assert.assertEquals(expected,actual);
    }
    //AC-6
    @When("Hr user adds department")
    public void hr_user_adds_department() {
    dashboardPage.addDepartment.click();


    }
    @And("click the new department box and write {string}")
    public void clickTheNewDepartmentBoxAndWrite(String arg0) {
        BrowserUtils.sleep(1);
        dashboardPage.newDepartment.sendKeys(arg0);
        dashboardPage.addButton.click();
    }
    @When("Hr user can delete department")
    public void hr_user_can_delete_department() {
    dashboardPage.employeesButton.click();

    }


    @Then("Hr user should see new department")
    public void hrUserShouldSeeNewDepartment() {

        BrowserUtils.verifyURLContains("https://qa.openlycrm.com/company/vis_structure.php");
    }

    @Given("Hr user should see company structured")
    public void hrUserShouldSeeCompanyStructured() {
        loginPage.login();
        dashboardPage.employeesButton.click();

    }

    @When("Hr user  should be able to add child departments")
    public void hrUserShouldBeAbleToAddChildDepartments() {

        dashboardPage.addDepartment.click();

    }
    @And("click department name box and write {string}")
    public void clickDepartmentNameBoxAndWrite(String arg0) {
        dashboardPage.departmentName.sendKeys(arg0);

    }
    @And("click parent name box and write {string}")
    public void clickParentNameBoxAndWrite(String arg0) {
        dashboardPage.parentName.sendKeys(arg0);
                dashboardPage.addchildButton.click();
    }
    @Then("Hr user displayed child department")
    public void hrUserDisplayedChildDepartment() {

        BrowserUtils.verifyElementDisplayed(dashboardPage.displayChild);
    }


    @Given("Helpdesk and marketing users on the login page")
    public void helpdeskAndMarketingUsersOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("openly.url"));
    }
    @And("Users click the Employees button")
    public void usersClickTheEmployeesButton() {
        dashboardPage.employeesButton.click();
    }

    @Then("verify display add department button")
    public void verifyDisplayAddDepartmentButton() {
       BrowserUtils.verifyElementDisplayed(dashboardPage.companyStructure);
    }


}











