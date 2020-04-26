# Проект автоматизации тестирования сайта GeekBrains
Проект был сделан в рамках курса "ООП в Java"

Тесты написаны на сайте https://geekbrains.ru/

## Чтобы запустить тесты и просмотреть отчет соберите проект командой:

```mvn
mvn clean test allure:serve
```


```java
    @DisplayName("Вход с валидный логин/пароль")
    @Test
    void checkSingInValidLogin() {
        String login = "hao17583@bcaoo.com";
        String password = "hao17583";

        new AuthorizationPage(driver)
                .openUrl()
                .authorization(login, password)
                .checkNamePage("Главная");
    }
```
## Используемые библиотеки

  - selenium-java
  - junit-jupiter
  - webdrivermanager
  - hamcrest