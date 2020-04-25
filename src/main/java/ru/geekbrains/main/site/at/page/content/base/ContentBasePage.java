package ru.geekbrains.main.site.at.page.content.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.block.Navigation;
import ru.geekbrains.main.site.at.block.header.BaseHeaderBlock;
import ru.geekbrains.main.site.at.block.header.HeaderAuthorizationBlock;
import ru.geekbrains.main.site.at.block.header.HeaderNotAuthorizationBlock;
import ru.geekbrains.main.site.at.page.BasePageObject;

public abstract class ContentBasePage extends BasePageObject {

    protected Navigation navigation;
    protected BaseHeaderBlock baseHeaderBlock;

    @FindBy(css = "div button svg[class=\"svg-icon icon-popup-close-button \"]")
    private WebElement buttonPopUpClosed;

    public ContentBasePage(WebDriver driver, boolean authorization) {
        super(driver, authorization);

        this.navigation = new Navigation(driver, authorization);
        if (authorization) {
            baseHeaderBlock = new HeaderAuthorizationBlock(driver, true);
        } else {
            baseHeaderBlock = new HeaderNotAuthorizationBlock(driver, false);
        }
        PageFactory.initElements(driver, this);
    }


    public ContentBasePage closedPopUp() {
        buttonPopUpClosed.click();
        return this;
    }

    public Navigation getNavigation() {
        return navigation;
    }

    public BaseHeaderBlock getHeader() {
        return baseHeaderBlock;
    }


    public ContentBasePage checkNamePage(String exampleNamePage) {
        baseHeaderBlock.checkNamePage(exampleNamePage);
        return this;
    }
}
