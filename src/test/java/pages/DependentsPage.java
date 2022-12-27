package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class DependentsPage extends CommonMethods {
    @FindBy(xpath = "//input[@id='btnAddDependent']")
    public WebElement dependentAddBtn;

    @FindBy(id = "dependent_name")
    public WebElement dependentName;

    @FindBy(id = "dependent_relationshipType")
    public WebElement relationshipDD;

    @FindBy(id = "dependent_dateOfBirth")
    public WebElement calender;

    @FindBy(xpath = "//select[@class='ui-datepicker-month']")
    public WebElement monthWebElement;

    @FindBy(xpath = "//select[@class='ui-datepicker-year']")
    public WebElement yearWebElement;

    @FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr/td")
    public List<WebElement> dayList;

    @FindBy(id = "btnSaveDependent")
    public WebElement saveBtn;

    @FindBy(xpath = "//table[@id='dependent_list']/tbody/tr/td")
    public List<WebElement> tableResult;

    public DependentsPage(){
        PageFactory.initElements(driver,this);
    }
}
