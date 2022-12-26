package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {

    @FindBy(xpath ="//input[@id='txtUsername']")
    public WebElement usernameTextField;

    @FindBy(id="txtPassword")
    public WebElement passwordTextField;

    @FindBy(xpath="//input[@id='btnLogin']")
    public WebElement loginButton;

    @FindBy(xpath="//span[@id='spanMessage']")
    public WebElement errorMessage;

    public LoginPage(){
        //call selenium page factory
        PageFactory.initElements(driver, this);
    }
}
