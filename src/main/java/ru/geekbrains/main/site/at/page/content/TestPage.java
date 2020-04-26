package ru.geekbrains.main.site.at.page.content;

import org.openqa.selenium.WebDriver;
import ru.geekbrains.main.site.at.page.OpenUrl;
import ru.geekbrains.main.site.at.page.content.base.ContentBasePage;
import ru.geekbrains.main.site.at.page.sing.AuthorizationPage;

import static com.codeborne.selenide.Selenide.open;

public class TestPage extends ContentBasePage implements OpenUrl {

    @Override
    public TestPage openUrl() {
        open("https://geekbrains.ru/tests");
        return this;
    }
}
