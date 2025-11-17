package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

@DisplayName("Класс для проверки функциональности на странице <Наша история>")
public class CenticoreTests extends TestBase {

    private final String
            MAIN_PAGE_URL = "https://centicore.ru";

    MainPage mainPage = new MainPage();


    @Test
    @Feature("Проверка таба навигации на главной странице")
    @Story("Я как пользователь хочу иметь возможность ознакомиться с информацией о компании в разделе <Наша история> за определенный год")
    @Owner("NikitaRyazanov")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "HistoryPage", url = MAIN_PAGE_URL)
    @DisplayName("Проверка наличия истории за 2024")
    void checkStoryFor2024() {

        step("Перейти на главную страницу", () -> {
            mainPage
                    .openPage();
        });

        step("Открыть раздел <Наша история>", () -> {
            mainPage
                    .hoverAboutUsTab()
                    .clickOnOurHistoryTab();
        });

        step("Проверить наличие истроии за 2024 год", () -> {
            mainPage
                    .checkStoryForCertainYear("2024");
        });
    }

    @Test
    @Feature("Проверка таба навигации на главной странице")
    @Story("Я как пользователь хочу иметь возможность ознакомиться с информацией о компании в разделе <Наша история> за определенный год")
    @Owner("NikitaRyazanov")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "HistoryPage", url = MAIN_PAGE_URL)
    @DisplayName("Проверка наличия истории за 2023")
    void checkStoryFor2023() {

        step("Перейти на главную страницу", () -> {
            mainPage
                    .openPage();
        });

        step("Открыть раздел <Наша история>", () -> {
            mainPage
                    .hoverAboutUsTab()
                    .clickOnOurHistoryTab();
        });

        step("Проверить наличие истроии за 2023 год", () -> {
            mainPage
                    .checkStoryForCertainYear("2023");
        });
    }

    @Test
    @Feature("Проверка таба навигации на главной странице")
    @Story("Я как пользователь хочу иметь возможность ознакомиться с информацией о компании в разделе <Наша история> за определенный год")
    @Owner("NikitaRyazanov")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "HistoryPage", url = MAIN_PAGE_URL)
    @DisplayName("Проверка наличия истории за 2022")
    void checkStoryFor2022() {

        step("Перейти на главную страницу", () -> {
            mainPage
                    .openPage();
        });

        step("Открыть раздел <Наша история>", () -> {
            mainPage
                    .hoverAboutUsTab()
                    .clickOnOurHistoryTab();
        });

        step("Проверить наличие истроии за 2022 год", () -> {
            mainPage
                    .checkStoryForCertainYear("2022");
        });
    }

    @Test
    @Feature("Проверка таба навигации на главной странице")
    @Story("Я как пользователь хочу иметь возможность ознакомиться с информацией о компании в разделе <Наша история> за определенный год")
    @Owner("NikitaRyazanov")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "HistoryPage", url = MAIN_PAGE_URL)
    @DisplayName("Проверка наличия истории за 2021")
    void checkStoryFor2021() {

        step("Перейти на главную страницу", () -> {
            mainPage
                    .openPage();
        });

        step("Открыть раздел <Наша история>", () -> {
            mainPage
                    .hoverAboutUsTab()
                    .clickOnOurHistoryTab();
        });

        step("Проверить наличие истроии за 2021 год", () -> {
            mainPage
                    .checkStoryForCertainYear("2021");
        });
    }

    @Test
    @Feature("Проверка таба навигации на главной странице")
    @Story("Я как пользователь хочу иметь возможность ознакомиться с информацией о компании в разделе <Наша история> за определенный год")
    @Owner("NikitaRyazanov")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "HistoryPage", url = MAIN_PAGE_URL)
    @DisplayName("Проверка наличия истории за 2020")
    void checkStoryFor2020() {

        step("Перейти на главную страницу", () -> {
            mainPage
                    .openPage();
        });

        step("Открыть раздел <Наша история>", () -> {
            mainPage
                    .hoverAboutUsTab()
                    .clickOnOurHistoryTab();
        });

        step("Проверить наличие истроии за 2020 год", () -> {
            mainPage
                    .checkStoryForCertainYear("2020");
        });
    }
}
