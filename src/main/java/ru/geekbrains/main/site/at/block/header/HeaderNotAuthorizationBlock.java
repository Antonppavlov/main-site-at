package ru.geekbrains.main.site.at.block.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.page.sing.AuthorizationPage;

public class HeaderNotAuthorizationBlock extends BaseHeaderBlock {

    public HeaderNotAuthorizationBlock(WebDriver driver, boolean authorization) {
        super(driver, authorization);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[href=\"/login\"]")
    private WebElement singIn;

    @FindBy(css = "href=\"/register\"")
    private WebElement registration;

    public AuthorizationPage clickButtonSingIn() {
        singIn.click();
        return PageFactory.initElements(driver, AuthorizationPage.class);
    }

    public void clickButtonRegistration() {
        registration.click();
    }
}
