package ru.geekbrains.main.site.at.page.sing;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.page.BasePageObject;
import ru.geekbrains.main.site.at.page.content.HomePage;

public class AuthorizationPage extends BasePageObject {

    public AuthorizationPage(WebDriver driver) {
        super(driver, false);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[data-testid=\"login-email\"]")
    private WebElement inputLogin;

    @FindBy(css = "[data-testid=\"login-password\"]")
    private WebElement inputPassword;

    @FindBy(css = "[data-testid=\"login-submit\"")
    private WebElement buttonSingInd;

    @Step("авторизация с логин:{login} и пароль {password}")
    public HomePage authorization(String login, String password) {
        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);
        buttonSingInd.click();
        return new HomePage(driver, true);
    }

}