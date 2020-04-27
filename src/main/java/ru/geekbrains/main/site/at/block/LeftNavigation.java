package ru.geekbrains.main.site.at.block;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.page.BasePageObject;
import ru.geekbrains.main.site.at.page.content.CoursePage;
import ru.geekbrains.main.site.at.page.content.HomePage;
import ru.geekbrains.main.site.at.page.content.TestPage;
import ru.geekbrains.main.site.at.page.content.base.ContentBasePage;
import ru.geekbrains.main.site.at.util.PageNotCreateException;

public class LeftNavigation extends BasePageObject {

    @FindBy(css = "[class='svg-icon icon-logo']")
    private WebElement icon;

    @FindBy(css = "[class*='main-page-hidden'] [href='/courses']")
    private WebElement buttonCourses;

    @FindBy(css = "[class*='main-page-hidden'] [href='/events']")
    private WebElement buttonEvents;

    @FindBy(css = "[class*='main-page-hidden'] [href='/topics']")
    private WebElement buttonTopics;

    @FindBy(css = "[class*='main-page-hidden'] [href='/posts']")
    private WebElement buttonPosts;

    @FindBy(css = "[class*='main-page-hidden'] [href='/tests']")
    private WebElement buttonTests;

    @FindBy(css = "[class*='main-page-hidden'] [href='/career']")
    private WebElement buttonCareer;

    public LeftNavigation(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    @Step("Нажатие кнопки {nameButton}")
    public ContentBasePage clickButton(Button button) {
        ContentBasePage contentBasePage = null;

        switch (button) {
            case icon:
                icon.click();
                contentBasePage = new HomePage(driver);
                break;
            case buttonCourses:
                buttonCourses.click();
                contentBasePage = new CoursePage(driver);
                break;
            case buttonEvents:
                buttonEvents.click();
                break;
            case buttonTopics:
                buttonTopics.click();
                break;
            case buttonPosts:
                buttonPosts.click();
                break;
            case buttonTests:
                buttonTests.click();
                contentBasePage = new TestPage(driver);
                break;
            case buttonCareer:
                buttonCareer.click();
                break;
        }

        if(null==contentBasePage){
            throw new PageNotCreateException("Страница: "+button.getName()+" не описана!");
        }

        return contentBasePage;
    }

   public enum Button {
        icon("Главная"),
        buttonCourses("Курсы"),
        buttonEvents("Вебинары"),
        buttonTopics("Форум"),
        buttonPosts("Блог"),
        buttonTests("Тесты"),
        buttonCareer("Карьера");

        private String name;

        Button(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
