package ru.geekbrains.main.site.at.page.content;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.page.content.base.ContentBasePage;

public class HomePage extends ContentBasePage {

    public HomePage(WebDriver driver, boolean authorization) {
        super(driver, authorization);
        PageFactory.initElements(driver, this);
    }
}
