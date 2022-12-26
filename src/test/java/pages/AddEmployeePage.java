package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {

    @FindBy(id = "firstName")
    public WebElement firstNameField;

    @FindBy(id = "middleName")
    public WebElement middleNameField;

    @FindBy(id = "lastName")
    public WebElement lastNameField;

    @FindBy(id = "employeeId")
    public WebElement empIdLocator;

    @FindBy(id = "btnSave")
    public WebElement saveButton;

    @FindBy(xpath = "//h1[text()='Personal Details']")
    public WebElement EmployeeDetail;

    public AddEmployeePage(){
        PageFactory.initElements(driver, this);
    }

}
