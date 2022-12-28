package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ConfigReader;

public class SearchEmployeeSteps extends CommonMethods {

    @When("user enter valid employee id")
    public void user_enter_valid_employee_id() {

        sendText(employeeList.empSearchIdField, ConfigReader.getPropertyValue("id"));
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
       click(employeeList.searchButton);
    }
    @Then("user see employee information is displayed")
    public void user_see_employee_information_is_displayed() {
        tableConfirmation(employeeList.tableElement, ConfigReader.getPropertyValue("name"));
    }

    @When("user enters valid employee name")
    public void user_enters_valid_employee_name() {

        sendText(employeeList.empSearchNameField, ConfigReader.getPropertyValue("name"));
    }


}
