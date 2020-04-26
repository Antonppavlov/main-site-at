package ru.geekbrains.main.site.at.block;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.page.content.SearchPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToCompressingWhiteSpace;

public class HeaderBlock  {
    //////////////////////общие поля
    @FindBy(css = "[class='gb-header__title']")
    protected SelenideElement headerTitlePage;

    @FindBy(css = "[id='top-menu'] [class='show-search-form'] svg")
    protected SelenideElement buttonSearch;

    @FindBy(css = "input[class='search-panel__search-field']")
    protected SelenideElement inputSearch;
    //////////////////////

    //////////////////////Поля только для НЕ авторизованного
    @FindBy(css = "[href='/login']")
    private SelenideElement singIn;

    @FindBy(css = "href='/register'")
    private SelenideElement registration;
    //////////////////////

    //////////////////////Поля только для авторизованного
    @FindBy(css = "header [class='schedule-opener js-schedule-opener']")
    private SelenideElement buttonCalendar;

    @FindBy(css = "[class='js-notices-link']")
    private SelenideElement buttonNotify;

    @FindBy(css = "header [href='/thanks']")
    private SelenideElement buttonLike;

    @FindBy(css = "[id='menu-messages']")
    private SelenideElement buttonMessages;

    @FindBy(css = "[class='gb-top-menu__item dropdown']")
    private SelenideElement buttonAvatar;
    //////////////////////


    @Step("проверка что имя страницы: {exampleNamePage}")
    public void checkNamePage(String exampleNamePage) {

        String headerPageText = headerTitlePage.getText();
        assertThat(headerPageText, equalToCompressingWhiteSpace(exampleNamePage));
    }

    @Step("поиск на сайте по тексту: {exampleNamePage}")
    public SearchPage searchText(String text) {
        buttonSearch.click();
        inputSearch.sendKeys(text);
        return new SearchPage();
    }


}
