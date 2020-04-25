package ru.geekbrains.main.site.at.page.content;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.geekbrains.main.site.at.block.CourseContentSwitchBlock;
import ru.geekbrains.main.site.at.page.content.base.ContentBasePage;

public class CoursePage extends ContentBasePage {

    private CourseContentSwitchBlock courseContentSwitchBlock;

    public CoursePage(WebDriver driver, boolean authorization) {
        super(driver, authorization);
        this.courseContentSwitchBlock = new CourseContentSwitchBlock(driver, authorization);
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

    public CourseContentSwitchBlock getCourseContentSwitchBlock() {
        return courseContentSwitchBlock;
    }
}
