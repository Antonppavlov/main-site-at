package ru.geekbrains.main.site.at;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.geekbrains.main.site.at.base.BeforeAndAfterStep;
import ru.geekbrains.main.site.at.block.LeftNavigation;
import ru.geekbrains.main.site.at.page.content.TestPage;

@Execution(ExecutionMode.CONCURRENT)
@DisplayName("Проверка навигации")
@Feature("Проверка навигации")
public class LeftNavigationWebTest extends BeforeAndAfterStep {

    static LeftNavigation.Button[] stringProvider() {
        return  LeftNavigation.Button.values();
    }

    @DisplayName("Нажатие в навигации")
    @ParameterizedTest(name = "{index} => переход на страницу {0}")
    @MethodSource("stringProvider")
    void checkNavigation(LeftNavigation.Button button) {
        new TestPage(driver)
                .openUrl()
                .getLeftNavigation().clickButton(button)
                .getHeader().checkNamePage(button.getName());
    }

}