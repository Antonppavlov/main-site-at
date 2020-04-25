package ru.geekbrains.main.site.at.page.content;

import org.openqa.selenium.WebDriver;
import ru.geekbrains.main.site.at.page.content.base.ContentBasePage;

public class TestPage extends ContentBasePage {

    public TestPage(WebDriver driver, boolean authorization) {
        super(driver, authorization);
//        this.courseHeader = PageFactory.initElements(driver, CourseHeader.class);
    }

}
