package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    @FindBy(xpath="//a[@data-target='#login-modal']")
    WebElement loginButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void clickLoginModal(){
        loginButton.click();
    }
}
