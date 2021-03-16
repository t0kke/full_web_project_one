package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.href;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class OurWorkPage extends BaseTest {
    @DisplayName("На странице отображается кнопка обратной связи \"Напишите нам\"")
    @Test
    void checkFeedbackButton() {
        open("/work");
        $(".jumbotron_details .styleguide-button_medium").shouldHave(text("Напишите нам"))
                .shouldHave(href("https://distillery.com/ru/contact/"));
    }

    @DisplayName("На странице отображается grid выполненных работ")
    @Test
    void checkDisplayOfWorkTable() {
        open("/work");
        $$(".work-list__item").shouldHave(size(7));
    }
}
