package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPageTest extends BaseTest {
    @DisplayName("Проверка отображения названия компании, заголовка и подзаголовка в блоке с видео")
    @Test
    void titleMainTest() {
        open("");

        $(".jumbotron-home__label").shouldHave(text("Distillery"));
        $(".jumbotron-home__title").shouldHave(text("РАЗРАБОТКА И ДИЗАЙН"));
        $(".jumbotron-home__subtitle").shouldHave(text("ВЕБ-СЕРВИСОВ И МОБИЛЬНЫХ ПРИЛОЖЕНИЙ"));
    }

    @DisplayName("Отображается всплывающее окно с согласием на использование cookie-файлов")
    @Test
    void cookieNotification() {
        open("");

        $(".cookie-notification__text").shouldHave(text("Оставаясь на нашем сайте, вы соглашаетесь на использование cookie-файлов"));
        $(".cookie-notification__button").shouldBe(visible);
    }

    @DisplayName("Окно согласия использования cookie-файлов пропадает после принятия соглашения")
    @Test
    void cookieNotificationDisappearsAfterConsent() {
        open("");

        $(".cookie-notification__text").shouldBe(visible);
        $(".cookie-notification__button").click();
        $("cookie-notification__text").shouldBe(disappear);

    }
}
