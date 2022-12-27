package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class DependentsSteps extends CommonMethods {
    @When("user clicks on displayed information")
    public void user_clicks_on_displayed_information() {
        click(employeeList.idDisplayed);
    }

    @Then("user sees employee details")
    public void user_sees_employee_details() {
        if (personalDetails.detailsDisplayed.isDisplayed()){
            System.out.println("personal details are displayed");
        } else {
            System.out.println("test has failed");
        }
    }
    @When("user clicks on dependents button")
    public void user_clicks_on_dependents_button() {
        click(personalDetails.dependentsBtn);
    }
    @When("user clicks on dependents add button")
    public void user_clicks_on_dependents_add_button() {
        click(dependents.dependentAddBtn);
    }
    @When("user enters dependent name")
    public void user_enters_dependent_name() {
        sendText(dependents.dependentName, "MASHA");
    }
    @When("user selects the relationship")
    public void user_selects_the_relationship() {
        selectDropdown(dependents.relationshipDD, "Child");
    }
    @When("user selects the date from calender")
    public void user_selects_the_date_from_calender() {
        click(dependents.calender);
    staticCalanderSelection(dependents.monthWebElement, "Mar",dependents.yearWebElement,"1999",dependents.dayList,"27");
        //sendText(dependents.calender, "1999-12-15");
    }
    @When("user clicks on dependent save button")
    public void user_clicks_on_dependent_save_button() {
        click(dependents.saveBtn);
    }
    @Then("user see the dependents information displayed")
    public void user_see_the_dependents_information_displayed() {
        System.out.println("information displayed");
    }
}
