package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

@DisplayName("Класс для проверки функциональности на странице <<Наша история>>")
public class CenticoreTests extends TestBase {

    private final String
            MAIN_PAGE_URL = "https://centicore.ru";

    MainPage mainPage = new MainPage();


    @Test
    @Feature("Проверка таба навигации на главной странице")
    @Story("Я как пользователь хочу иметь возможность ознакомиться с информацией о компании в разделе <<Наша история>> за 2024 год")
    @Owner("NikitaRyazanov")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "HistoryPage", url = MAIN_PAGE_URL)
    @DisplayName("Проверка перехода на раздел <<О Нас/Наша история>>")
    void checkCompanyStoryFor2024OnOurHistoryTab() {

        step("Перейти на главную страницу", () -> {
            mainPage
                    .openPage();
        });

        step("Открыть раздел <<Наша история>>", () -> {
            mainPage
                    .hoverAboutUsTab()
                    .clickOnOurHistoryTab();
        });

        step("Проверить наличие истроии за 2024 год", () -> {
            mainPage
                    .checkIfStoryIsPresent("2024");
        });
    }

    @Test
    @Feature("Проверка таба навигации на главной странице")
    @Story("Я как пользователь хочу иметь возможность ознакомиться с информацией о разработке ПО в разделе <<Услуги>>")
    @Owner("NikitaRyazanov")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "MainPageHeader", url = MAIN_PAGE_URL)
    @DisplayName("Проверка перехода на раздел <Услуги/Разработка ПО>")
    void checkListOfTechnologiesOnServiceDevelopmentTab () {

        step("Перейти на главную страницу", () -> {
            mainPage
                    .openPage();
        });

        step("Открыть раздел <<Разработка ПО>>", () -> {
            mainPage
                    .hoverServicesTab()
                    .clickOnServicesDevelopmentTab();
        });

        step("Проверить наличия используемых технологий на странице", () -> {
            mainPage
                    .checkTechnologiesListIsPresent();
        });
    }


    @Test
    @Feature("Проверка таба навигации на главной странице")
    @Story("Я как пользователь хочу иметь возможность ознакомиться с информацией о Нефтегазовой промышленности в разделе <<Экспертиза>>")
    @Owner("NikitaRyazanov")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "MainPageHeader", url = MAIN_PAGE_URL)
    @DisplayName("Проверка перехода на раздел <<Экспертиза/Нефтегазовая промышленность>>")
    void checkOilGasOnExpertiseTab () {

        step("Перейти на главную страницу", () -> {
            mainPage
                    .openPage();
        });

        step("Открыть раздел <<Нефтегазовая промышленность>>", () -> {
            mainPage
                    .hoverExpertiseTab()
                    .clickOnOilGasTab();
        });

        step("Проверить наличие информации о работе в Нефтегазовой промышенности на странице", () -> {
            mainPage
                    .checkActivityListIsPresent();
        });
    }

    @Test
    @Feature("Проверка таба навигации на главной странице")
    @Story("Я как пользователь хочу иметь возможность ознакомиться с информацией о Шторм Блокчейн в разделе <<Продукты>>")
    @Owner("NikitaRyazanov")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "MainPageHeader", url = MAIN_PAGE_URL)
    @DisplayName("Проверка перехода на раздел <<Продукты/Шторм Блокчейн>>")
    void checkStormBlockChainOnProductsTab () {

        step("Перейти на главную страницу", () -> {
            mainPage
                    .openPage();
        });

        step("Открыть раздел <<Шторм Блокчейн>>", () -> {
            mainPage
                    .hoverProductTab()
                    .clickOnStormBlockChainTab();
        });

        step("Проверить наличие информации о преимуществах о Шторм Блокчейн на странице", () -> {
            mainPage
                    .checkProtocolBlockChainListIsPresent();
        });
    }

    @Test
    @Feature("Проверка таба навигации на главной странице")
    @Story("Я как пользователь хочу иметь возможность ознакомиться с информацией о Вакансиях в разделе <<Карьера>>")
    @Owner("NikitaRyazanov")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "MainPageHeader", url = MAIN_PAGE_URL)
    @DisplayName("Проверка перехода на раздел <<Карьера/Вакансии>>")
    void checkVacanciesOnCareerTab () {

        step("Перейти на главную страницу", () -> {
            mainPage
                    .openPage();
        });

        step("Открыть раздел <<Вакансии>>", () -> {
            mainPage
                    .hoverCareerTab()
                    .clickOnVacanciesTab();
        });

        step("Проверить наличие информации о вакансиях на странице", () -> {
            mainPage
                    .checkVacanciesListIsPresent();
        });
    }
}
