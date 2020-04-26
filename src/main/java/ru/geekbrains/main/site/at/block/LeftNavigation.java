package ru.geekbrains.main.site.at.block;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.page.content.CoursePage;
import ru.geekbrains.main.site.at.page.content.HomePage;
import ru.geekbrains.main.site.at.page.content.base.ContentBasePage;
import ru.geekbrains.main.site.at.util.PageNotCreateException;

public class LeftNavigation  {

    @FindBy(css = "[class='svg-icon icon-logo']")
    private SelenideElement icon;

    @FindBy(css = "[class*='main-page-hidden'] [href='/courses']")
    private SelenideElement buttonCourses;

    @FindBy(css = "[class*='main-page-hidden'] [href='/events']")
    private SelenideElement buttonEvents;

    @FindBy(css = "[class*='main-page-hidden'] [href='/topics']")
    private SelenideElement buttonTopics;

    @FindBy(css = "[class*='main-page-hidden'] [href='/posts']")
    private SelenideElement buttonPosts;

    @FindBy(css = "[class*='main-page-hidden'] [href='/tests']")
    private SelenideElement buttonTests;

    @FindBy(css = "[class*='main-page-hidden'] [href='/career']")
    private SelenideElement buttonCareer;


    @Step("Нажатие кнопки {nameButton}")
    public ContentBasePage clickButton(String nameButton) {
        switch (nameButton) {
            case "Главная": {
                icon.click();
                return new HomePage();
            }
            case "Курсы": {
                buttonCourses.click();
                return new CoursePage();
            }
            case "Вебинары": {
                buttonEvents.click();
                break;
            }
            case "Форум": {
                buttonTopics.click();
                break;
            }
            case "Блог": {
                buttonPosts.click();
                break;
            }
            case "Тесты": {
                buttonTests.click();
                break;
            }
            case "Карьера": {
                buttonCareer.click();
                break;
            }
            default: {
                throw new PageNotCreateException("Не найдена кнопка с именем: " + nameButton);
            }
        }

        return new HomePage();
    }
}
