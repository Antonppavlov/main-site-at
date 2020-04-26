package ru.geekbrains.main.site.at.page.content;

import org.openqa.selenium.WebDriver;
import ru.geekbrains.main.site.at.block.SearchTabsBlock;
import ru.geekbrains.main.site.at.page.OpenUrl;
import ru.geekbrains.main.site.at.page.content.base.ContentBasePage;

import static com.codeborne.selenide.Selenide.open;

public class SearchPage extends ContentBasePage implements OpenUrl {

    private SearchTabsBlock searchTabsBlock = new SearchTabsBlock();


    @Override
    public SearchPage openUrl() {
        open("https://geekbrains.ru/search");
        return this;
    }

    public SearchTabsBlock getSearchTabsBlock() {
        return searchTabsBlock;
    }
}
