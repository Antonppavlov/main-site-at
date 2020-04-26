package ru.geekbrains.main.site.at.page.content;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import ru.geekbrains.main.site.at.block.ContentNavigationCourseBlock;
import ru.geekbrains.main.site.at.page.OpenUrl;
import ru.geekbrains.main.site.at.page.content.base.ContentBasePage;

import java.util.List;

public class CoursePage extends ContentBasePage implements OpenUrl {

    private ContentNavigationCourseBlock contentNavigationCourseBlock;

    @FindBy(xpath="//*[@id=\"cour-new\"]//li")
    private List<WebElement> filterList;

    @FindBy(xpath="//a/div/div/span")
    private List<WebElement> courseList;

    public CoursePage(WebDriver driver) {
        super(driver);
        this.contentNavigationCourseBlock = new ContentNavigationCourseBlock(driver);
    }

    public CoursePage configFilter(String... args) {

        for (String test : args) {
            //TODO после прохождения коллекций -переделать на коллекции
            driver.findElement(By.xpath("//form/ul//label[text()='" + test + "']"))
                    .click();
        }
        return this;
    }

    public CoursePage checkingDisplayedCourses(String... args) {
        for (String test : args) {
            //TODO после прохождения коллекций -переделать на коллекции
            driver.findElement(By.xpath("//a/div/div/span[text()='" + test + "']"));
        }
        return this;
    }

    public ContentNavigationCourseBlock getContentNavigationCourseBlock() {
        return contentNavigationCourseBlock;
    }

    @Override
    public CoursePage openUrl() {
        driver.get("https://geekbrains.ru/courses");
        return this;
    }
}
