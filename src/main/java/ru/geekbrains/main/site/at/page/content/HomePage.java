package ru.geekbrains.main.site.at.page.content;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.page.OpenUrl;
import ru.geekbrains.main.site.at.page.content.base.ContentBasePage;

import static com.codeborne.selenide.Selenide.open;

public class HomePage extends ContentBasePage implements OpenUrl {


    @Override
    public HomePage openUrl() {
      open("https://geekbrains.ru/");
        return this;
    }
}
