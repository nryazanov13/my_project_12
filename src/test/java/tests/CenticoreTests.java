package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.*;

@DisplayName("Класс для проверки функциональности переходов на главной странице ")
public class CenticoreTests extends TestBase {

    private final String
            MAIN_PAGE_URL = "https://centicore.ru";

    MainPage mainPage = new MainPage();
    CareerPage careerPage = new CareerPage();
    OilGasPage oilGasPage = new OilGasPage();
    OurHistoryPage ourHistoryPage = new OurHistoryPage();
    ServiceDevelopmentPage serviceDevelopmentPage = new ServiceDevelopmentPage();
    StormBlockChainPage stormBlockChainPage = new
            StormBlockChainPage();

    @Test
    @Feature("Проверка таба навигации на главной странице")
    @Story("Я как пользователь хочу иметь возможность ознакомиться с информацией о компании в разделе «Наша история» за 2024 год")
    @Owner("NikitaRyazanov")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "HistoryPage", url = MAIN_PAGE_URL)
    @DisplayName("Проверка перехода на раздел «О Нас/Наша история»")
    void checkCompanyStoryFor2024OnOurHistoryTab() {

        mainPage
                .openPage()
                .hoverAboutUsTab()
                .clickOnOurHistoryTab();

        ourHistoryPage
                .checkIfStoryIsPresent("2024");
    }

    @Test
    @Feature("Проверка таба навигации на главной странице")
    @Story("Я как пользователь хочу иметь возможность ознакомиться с информацией о разработке ПО в разделе «Услуги»")
    @Owner("NikitaRyazanov")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "MainPageHeader", url = MAIN_PAGE_URL)
    @DisplayName("Проверка перехода на раздел «Услуги/Разработка ПО»")
    void checkListOfTechnologiesOnServiceDevelopmentTab() {

        mainPage
                .openPage()
                .hoverServicesTab()
                .clickOnServicesDevelopmentTab();

        serviceDevelopmentPage
                .checkTechnologiesListIsPresent();
    }


    @Test
    @Feature("Проверка таба навигации на главной странице")
    @Story("Я как пользователь хочу иметь возможность ознакомиться с информацией о Нефтегазовой промышленности в разделе «Экспертиза»")
    @Owner("NikitaRyazanov")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "MainPageHeader", url = MAIN_PAGE_URL)
    @DisplayName("Проверка перехода на раздел «Экспертиза/Нефтегазовая промышленность»")
    void checkOilGasOnExpertiseTab() {

        mainPage
                .openPage()
                .hoverExpertiseTab()
                .clickOnOilGasTab();

        oilGasPage
                .checkActivityListIsPresent();
    }

    @Test
    @Feature("Проверка таба навигации на главной странице")
    @Story("Я как пользователь хочу иметь возможность ознакомиться с информацией о Шторм Блокчейн в разделе «Продукты»")
    @Owner("NikitaRyazanov")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "MainPageHeader", url = MAIN_PAGE_URL)
    @DisplayName("Проверка перехода на раздел «Продукты/Шторм Блокчейн»")
    void checkStormBlockChainOnProductsTab() {

        mainPage
                .openPage()
                .hoverProductTab()
                .clickOnStormBlockChainTab();

        stormBlockChainPage
                .checkProtocolBlockChainListIsPresent();
    }

    @Test
    @Feature("Проверка таба навигации на главной странице")
    @Story("Я как пользователь хочу иметь возможность ознакомиться с информацией о Вакансиях в разделе «Карьера»")
    @Owner("NikitaRyazanov")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "MainPageHeader", url = MAIN_PAGE_URL)
    @DisplayName("Проверка перехода на раздел «Карьера/Вакансии»")
    void checkVacanciesOnCareerTab() {

        mainPage
                .openPage()
                .hoverCareerTab()
                .clickOnVacanciesTab();

        careerPage
                .checkVacanciesListIsPresent();
    }
}