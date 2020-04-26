package ru.geekbrains.main.site.at.page.content;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.main.site.at.block.ContentNavigationCourseBlock;
import ru.geekbrains.main.site.at.page.OpenUrl;
import ru.geekbrains.main.site.at.page.content.base.ContentBasePage;

import static com.codeborne.selenide.Selenide.open;

public class CoursePage extends ContentBasePage implements OpenUrl {

    private ContentNavigationCourseBlock contentNavigationCourseBlock = new ContentNavigationCourseBlock();

    @FindBy(xpath = "//*[@id=\"cour-new\"]//li")
    private ElementsCollection filterList;

    @FindBy(xpath = "//a/div/div/span")
    private ElementsCollection courseList;


    public CoursePage configFilter(String... args) {
        for (String test : args) {
            filterList.findBy(Condition.exactText(test));
        }
        return this;
    }

    public CoursePage checkingDisplayedCourses(String... args) {
        for (String test : args) {
            courseList.findBy(Condition.exactText(test));
        }
        return this;
    }

    public ContentNavigationCourseBlock getContentNavigationCourseBlock() {
        return contentNavigationCourseBlock;
    }

    @Override
    public CoursePage openUrl() {
        open("https://geekbrains.ru/courses");
        return this;
    }
}
