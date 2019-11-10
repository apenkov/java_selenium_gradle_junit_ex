package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;

public class LoginModal extends BasePage {

    public LoginModal(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//input[@id='username-modal']")
    WebElement usernameInput;

    @FindBy(xpath = "//input[@id='password-modal']")
    WebElement passwordInput;

    @FindBy(xpath = "//button[contains(.,'Log in')]")
    WebElement btnLogin;

    @FindBy(xpath = "//div[.='Login successful.']")
    WebElement successLogin;

    public void enterTextToUsernameInput(String username){
        usernameInput.click();
        usernameInput.sendKeys(username);
        assertThat(usernameInput.getAttribute("value"),is(equalTo(username)));
    }

    public void enterPasswordToPasswordInput(String password){
        passwordInput.click();
        passwordInput.sendKeys(password);
        assertThat(passwordInput.getAttribute("value").length(),is(equalTo(password.length())));
    }

    public void clickBtnLogin(){
        btnLogin.click();
        assertThat(successLogin.isDisplayed(),is(equalTo(true)));

    }
}
