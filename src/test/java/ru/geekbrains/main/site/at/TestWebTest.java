package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import ru.geekbrains.main.site.at.base.BeforeAndAfterStep;
import ru.geekbrains.main.site.at.page.sing.AuthorizationPage;
import ru.geekbrains.main.site.at.page.content.CoursePage;

@Execution(ExecutionMode.CONCURRENT)
@DisplayName("Проверка страницы Тесты")
public class TestWebTest extends BeforeAndAfterStep {

    @DisplayName("Вход с валидный логин/пароль")
    @Test
    void checkSingInValidLogin() {
        String login = "hao17583@bcaoo.com";
        String password = "hao17583";

        driver.get("https://geekbrains.ru/tests");

        ((CoursePage)
                new AuthorizationPage(driver)
                        .authorization(login, password)
                        .checkNamePage("Главная")
                        .getNavigation()
                        .clickButton("Тесты")
        )
                .getCourseContentSwitchBlock().clickButton("Курсы")
                .configFilter("Бесплатные", "Тестирование")
                .checkingDisplayedCourses(
                        "Тестирование ПО. Уровень 1",
                        "Тестирование ПО. Уровень 2"
                )
        ;

    }
}
