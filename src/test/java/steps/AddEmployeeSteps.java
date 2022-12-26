package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class AddEmployeeSteps extends CommonMethods {
    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        click(dashboard.pimOption);
    }

    @When("user clicks on Add Employee button")
    public void user_clicks_on_add_employee_button() {
        click(dashboard.addEmployeeOption);
    }

    @When("user enter {string} and {string} and {string}")
    public void user_enter_and_and(String firstName, String middleName, String lastName) {
        sendText(addEmployee.firstNameField, firstName);
        sendText(addEmployee.middleNameField, middleName);
        sendText(addEmployee.lastNameField, lastName);
    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        click(addEmployee.saveButton);
    }

    @Then("employee added successfully")
    public void employee_added_successfully() {
        if (addEmployee.EmployeeDetail.isDisplayed()) {
            System.out.println("Employee added successfully");
        } else {
            System.out.println("Employee not added");
        }
    }
}
