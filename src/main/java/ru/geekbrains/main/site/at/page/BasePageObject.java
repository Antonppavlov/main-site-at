package ru.geekbrains.main.site.at.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePageObject {

    protected WebDriver driver;
    protected boolean authorization;
    protected WebDriverWait wait30second;

    public BasePageObject(WebDriver driver, boolean authorization) {
        this.authorization = authorization;
        this.driver = driver;
        this.wait30second = new WebDriverWait(driver, 30);
    }

}
