package cloud.sprint2.pages;

import cloud.sprint2.utilities.ConfigurationReader;
import cloud.sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {


    public loginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "user")
    public WebElement inputUsername;

    @FindBy(id = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@value='Log in']")
    public WebElement loginButton;

    public void login(String username, String password){
        this.inputUsername.sendKeys(username);
        this.inputPassword.sendKeys(password);
        this.loginButton.click();
    }
    public void login(){
        this.inputUsername.sendKeys("Employee42");
        this.inputPassword.sendKeys("Employee123");
        this.loginButton.click();
    }


}
