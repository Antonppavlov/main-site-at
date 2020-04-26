package ru.geekbrains.main.site.at.page.content;

import org.openqa.selenium.WebDriver;
import ru.geekbrains.main.site.at.page.OpenUrl;
import ru.geekbrains.main.site.at.page.content.base.ContentBasePage;
import ru.geekbrains.main.site.at.page.sing.AuthorizationPage;

public class TestPage extends ContentBasePage {

    public TestPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public TestPage openUrl() {
        driver.get("https://geekbrains.ru/tests");
        return this;
    }
}
