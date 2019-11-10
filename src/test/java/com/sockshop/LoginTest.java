package com.sockshop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginModal;
import pages.MainPage;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    private WebDriver driver;
    private String baseUrl;
    MainPage mainPage;
    LoginModal loginModal;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        baseUrl = "http://localhost/";
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.get(baseUrl);

    }
    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void loginAsExistsUser(){
        mainPage = new MainPage(driver);
        loginModal = new LoginModal(driver);

        mainPage.clickLoginModal();
        loginModal.enterTextToUsernameInput("test");
        loginModal.enterPasswordToPasswordInput("test");
        loginModal.clickBtnLogin(); // maybe mv assert from click method, to check method
        // TO DO check text 'Login as' and button 'logout'
    }
}
