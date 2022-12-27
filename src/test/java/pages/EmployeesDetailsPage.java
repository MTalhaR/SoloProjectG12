package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EmployeesDetailsPage extends CommonMethods {
    @FindBy(xpath = "//h1[text()='Personal Details']")
    public WebElement detailsDisplayed;

    @FindBy(xpath = "//a[text()='Contact Details']")
    public WebElement contactDetailBtn;

    @FindBy(xpath = "//a[text()='Dependents']")
    public WebElement dependentsBtn;

    @FindBy(xpath = "(//a[text()='Job'])[2]")
    public WebElement jobBtn;

    @FindBy(xpath = "(//a[text()='Qualifications'])[2]")
    public WebElement qualificationBtn;

    @FindBy(xpath = "(//a[text()='Memberships'])[2]")
    public WebElement membershipBtn;
    public EmployeesDetailsPage(){
        PageFactory.initElements(driver,this);
    }
}
