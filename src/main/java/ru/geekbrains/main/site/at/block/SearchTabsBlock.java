package ru.geekbrains.main.site.at.block;

import com.codeborne.selenide.SelenideElement;
import org.hamcrest.Matcher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;

public class SearchTabsBlock  {

    @FindBy(css = "[class='search-page-tabs'] [data-tab='all']")
    private SelenideElement tabEveryWhere;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='professions']")
    private SelenideElement tabProfessions;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='courses']")
    private SelenideElement tabCourses;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='webinars']")
    private SelenideElement tabWebinars;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='blogs']")
    private SelenideElement tabBlogs;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='forums']")
    private SelenideElement tabForums;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='tests']")
    private SelenideElement tabTests;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='companies']")
    private SelenideElement tabCompanies;

    public void clickButton(Tab tab) {
        getButton(tab).click();
    }

    public SearchTabsBlock checkCount(Tab tab, Matcher matcher) {
        String actualCount = getButton(tab).findElement(By.cssSelector("span")).getText();
        assertThat(Integer.parseInt(actualCount), matcher);
        return this;
    }

    private SelenideElement getButton(Tab tab) {
        switch (tab) {
            case Everywhere:
                return tabEveryWhere;
            case Professions:
                return tabProfessions;
            case Courses:
                return tabCourses;
            case Webinars:
                return tabWebinars;
            case Blogs:
                return tabBlogs;
            case Forums:
                return tabForums;
            case Tests:
                return tabTests;
            case Companies:
                return tabCompanies;
            default:
                throw new IllegalStateException("Unexpected value: " + tab);
        }
    }

    public enum Tab {
        Everywhere("Везде"),
        Professions("Профессии"),
        Courses("Курсы"),
        Webinars("Вебинары"),
        Blogs("Блоги"),
        Forums("Форумы"),
        Tests("Тесты"),
        Companies("Компании");

        private String text;

        Tab(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }
}

