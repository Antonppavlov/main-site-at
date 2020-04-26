package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import ru.geekbrains.main.site.at.base.BeforeAndAfterStep;
import ru.geekbrains.main.site.at.page.content.CoursePage;

@Execution(ExecutionMode.CONCURRENT)
@DisplayName("Страница Курсы")
public class CourseWebTest extends BeforeAndAfterStep {

    @DisplayName("Проверка работы фильтров")
    @Test
    void checkSingInValidLogin() {
        ((CoursePage)
                new CoursePage(driver)
                        .openUrl()
                        .closedPopUp()
                        .getLeftNavigation()
                        .clickButton("Курсы")
        )
                .getContentNavigationCourseBlock().clickButton("Курсы")
                .configFilter("Бесплатные", "Тестирование")
                .checkingDisplayedCourses(
                        "Тестирование ПО. Уровень 1",
                        "Тестирование ПО. Уровень 2"
                )
        ;

    }
}
