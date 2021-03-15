package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.href;
import static com.codeborne.selenide.Selenide.*;

public class NavigationMenuTest extends BaseTest {
    @DisplayName("Навигационная панель отображает разделы")
    @Test
    void navigatoinMenuContainsSections() {
        open("");
        $$("#navMenuBlock").shouldHave(texts("Наши работы О нас Карьера Блог Контакты"));
    }

    @DisplayName("Разделы навигационной панели содержат верные ссылки")
    @Test
    void sectionsHaveCorrectLinks() {
        open("");
        $("div[class='navigation-menu__container'] div:nth-child(1) a")
                .shouldHave(href("https://distillery.com/ru/work/"));
        $("div[class='navigation-menu__container'] div:nth-child(2) a").
                shouldHave(href("https://distillery.com/ru/about/"));
        $("div[class='navigation-menu__container'] div:nth-child(3) a").
                shouldHave(href("https://distillery.com/ru/career-russia/"));
        $("div[class='navigation-menu__container'] div:nth-child(4) a").
                shouldHave(href("https://distillery.com/ru/blog/"));
        $("div[class='navigation-menu__container'] div:nth-child(5) a").
                shouldHave(href("https://distillery.com/ru/contact/"));


    }
}
