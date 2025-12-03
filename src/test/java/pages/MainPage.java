package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final SelenideElement
            aboutUsTab = $("a[href='/about/']"),
            ourHistoryTab = $("a[href='/about/history/']"),
            servicesTab = $("a[href='/services/']"),
            servicesDevelopmentTab = $("a[href='/services/development/']"),
            expertisesTab = $("a[href='/expertise/']"),
            oilGasTab = $("a[href='/expertise/oil-gas/']"),
            productsTab = $("a[href='/products/']"),
            stormBlockChainTab = $("a[href='/products/storm-blockchain/']"),
            careerTab = $("a[href='/career/']"),
            vacanciesTab = $("a[href='/vacancies/']");


    @Step("Открыли главную страницу")
    public MainPage openPage() {
        open("/");
        return this;
    }

    @Step("Навели курсор на раздел «О Нас»")
    public MainPage hoverAboutUsTab() {
        aboutUsTab.hover();
        return this;
    }

    @Step("Навели курсор на раздел «Услуги»")
    public MainPage hoverServicesTab() {
        servicesTab.hover();
        return this;
    }

    @Step("Навели курсор на раздел «Экспертиза»")
    public MainPage hoverExpertiseTab() {
        expertisesTab.hover();
        return this;
    }

    @Step("Навели курсор на раздел «Продукты»")
    public MainPage hoverProductTab() {
        productsTab.hover();
        return this;
    }

    @Step("Навели курсор на раздел «Карьера»")
    public MainPage hoverCareerTab() {
        careerTab.hover();
        return this;
    }

    @Step("Кликнуть на раздел «Наша история»")
    public MainPage clickOnOurHistoryTab() {
        ourHistoryTab.click();
        return this;
    }

    @Step("Кликнуть на раздел «Нефтегазовая промышленность»")
    public MainPage clickOnOilGasTab() {
        oilGasTab.click();
        return this;
    }

    @Step("Кликнуть на раздел «Шторм Блокчейн»")
    public MainPage clickOnStormBlockChainTab() {
        stormBlockChainTab.click();
        return this;
    }

    @Step("Кликнуть на раздел «Разработка ПО»")
    public MainPage clickOnServicesDevelopmentTab() {
        servicesDevelopmentTab.click();
        return this;
    }

    @Step("Кликнуть на раздел «Вакансии»")
    public MainPage clickOnVacanciesTab() {
        vacanciesTab.click();
        return this;
    }

}
