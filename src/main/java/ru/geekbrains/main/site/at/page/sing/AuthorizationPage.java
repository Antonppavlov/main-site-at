package ru.geekbrains.main.site.at.page.sing;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import ru.geekbrains.main.site.at.page.OpenUrl;
import ru.geekbrains.main.site.at.page.content.HomePage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AuthorizationPage implements OpenUrl {

    private SelenideElement inputLogin;
    private SelenideElement inputPassword;
    private SelenideElement buttonSingInd;

    public AuthorizationPage() {
        this.inputLogin = $("[data-testid='login-email']");
        this.inputPassword = $("[data-testid='login-password']");
        this.buttonSingInd = $("[data-testid='login-submit']");
    }

    @Step("авторизация с логин: {login} и пароль: {password}")
    public HomePage authorization(String login, String password) {
        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);
        buttonSingInd.click();
        return new HomePage();
    }

    @Override
    public AuthorizationPage openUrl() {
        open("https://geekbrains.ru/login");
        return this;
    }
}
