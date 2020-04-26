package ru.geekbrains.main.site.at.block;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.page.content.CoursePage;

import static com.codeborne.selenide.Selenide.$;

public class ContentNavigationCourseBlock  {

    private SelenideElement buttonProfessions;
    private SelenideElement buttonFreeIntensive;
    private SelenideElement buttonCourses;
    private SelenideElement buttonCompanies;

    public ContentNavigationCourseBlock() {
        this.buttonProfessions = $("[class*='nav nav-tabs'] [id='prof-link']");
        this.buttonFreeIntensive = $("[class*='nav nav-tabs'] [id='free-link']");
        this.buttonCourses = $("[class*='nav nav-tabs'] [id='cour-link']");
        this.buttonCompanies = $("[class*='nav nav-tabs'] [href*='https://forbusiness']");
    }

    public CoursePage clickButton(String nameButton) {
        switch (nameButton) {
            case "Профессии": {
                buttonProfessions.click();
                break;
            }
            case "Бесплатные интенсивы": {
                buttonFreeIntensive.click();
                break;
            }
            case "Курсы": {
                buttonCourses.click();
                break;
            }
            case "Компаниям": {
                buttonCompanies.click();
                break;
            }
            default: {
                throw new RuntimeException("Не найдена кнопка с именем: " + nameButton);
            }
        }

        return new CoursePage();
    }
}
