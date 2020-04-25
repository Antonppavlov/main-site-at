package ru.geekbrains.main.site.at.block.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderAuthorizationBlock extends BaseHeaderBlock {

    public HeaderAuthorizationBlock(WebDriver driver, boolean authorization) {
        super(driver, authorization);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "header [class=\"schedule-opener js-schedule-opener\"]")
    private WebElement buttonCalendar;

    @FindBy(css = "[class=\"js-notices-link\"]")
    private WebElement buttonNotify;

    @FindBy(css = "header [href=\"/thanks\"]")
    private WebElement buttonLike;

    @FindBy(css = "[id=\"menu-messages\"]")
    private WebElement buttonMessages;

    @FindBy(css = "[class=\"gb-top-menu__item dropdown\"]")
    private WebElement buttonAvatar;
}
