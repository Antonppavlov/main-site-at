package ru.geekbrains.main.site.at.block.header;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.page.BasePageObject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToCompressingWhiteSpace;

public abstract class BaseHeaderBlock extends BasePageObject {

    @FindBy(css = "[class=\"gb-header__title\"]")
    protected WebElement headerTitlePage;

    @FindBy(css = "[id='top-menu'] [class='show-search-form'] svg")
    protected WebElement buttonSearch;

    @FindBy(css = "input[class=\"search-panel__search-field\"]")
    protected WebElement inputSearch;

    public BaseHeaderBlock(WebDriver driver, boolean authorization) {
        super(driver, authorization);
    }

    @Step("проверка что имя страницы: {exampleNamePage}")
    public BaseHeaderBlock checkNamePage(String exampleNamePage) {
        wait30second.until(ExpectedConditions.textToBePresentInElement(headerTitlePage, exampleNamePage));

        String headerPageText = headerTitlePage.getText();
        assertThat(headerPageText, equalToCompressingWhiteSpace(exampleNamePage));
        return this;
    }

    @Step("поиск на сайте по тексту: {exampleNamePage}")
    public BaseHeaderBlock searchText(String text) {
        buttonSearch.click();
        inputSearch.sendKeys(text);
        return this;
    }


}
