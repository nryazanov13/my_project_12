package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

@DisplayName("Класс для проверки функциональности главной страницы")
public class CenticoreTests {

    private final String
            MAIN_PAGE_URL = "https://centicore.ru/";

    MainPage mainPage = new MainPage();


    @Test
    @Feature("Проверка таба навигации на главной странице")
    @Story("Я как пользователь хочу иметь возможность ознакомиться с информацией о компании в разделе <Наша история>")
    @Owner("NikitaRyazanov")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "PracticeForm", url = MAIN_PAGE_URL)
    @DisplayName("Тест перехода в раздел <Наша история>")
    void fillFormWithAllFieldsTest() {

//        step("Перейти на главную страницу", () ->
//        {
//            mainPage.openPage();
//        });
//
//        step("Открыть раздел <Наша история>", () ->
//        {
//
//        });
//
//        step("Проверить наличие истроии за 2024 год", () ->
//        {
//
//        });

        //Open selenide page on GitHub
        open("https://centicore.ru/");
        //Hover mouse on "О Нас"
        $(".header-nav").$("a[href='/about/']").hover();
        //Click on "Наша история" text
        $$(".nav-modal").findBy(text("Наша история")).click();
        //Create variable for enterprise text
        String historyText = "История Centicore Group";
        //Check if text == enterpriseText variable
        $("heading").shouldHave(text(historyText));

    }
}
