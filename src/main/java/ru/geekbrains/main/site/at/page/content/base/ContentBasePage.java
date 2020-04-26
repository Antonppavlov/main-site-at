package ru.geekbrains.main.site.at.page.content.base;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.block.HeaderBlock;
import ru.geekbrains.main.site.at.block.LeftNavigation;

public abstract class ContentBasePage {

    protected LeftNavigation leftNavigation= new LeftNavigation();
    protected HeaderBlock headerBlock = new HeaderBlock();

    @FindBy(css = "div button svg[class='svg-icon icon-popup-close-button ']")
    private SelenideElement buttonPopUpClosed;


    public ContentBasePage closedPopUp() {
        if (buttonPopUpClosed.isDisplayed()) {
            this.buttonPopUpClosed.click();
        }
        return this;
    }

    public LeftNavigation getLeftNavigation() {
        return leftNavigation;
    }

    public HeaderBlock getHeader() {
        return headerBlock;
    }

    /**
     * Адаптер над объектом HeaderBlock
     * После работы с методом HeaderBlock#checkNamePage(String) сайт остается на тойже странице
     */
    public ContentBasePage checkNamePage(String exampleNamePage) {
        headerBlock.checkNamePage(exampleNamePage);
        return this;
    }

}
