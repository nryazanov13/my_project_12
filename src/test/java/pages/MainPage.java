package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final SelenideElement
            aboutUsTab = $("a[href='/about/']"),
            ourHistoryTab = $("a[href='/about/history/']"),
            historyYear = $(".history__desc"),
            servicesTab = $("a[href='/services/']"),
            servicesDevelopmentTab = $("a[href='/services/development/']"),
            technologiesList = $(".technologies-list-content"),
            expertisesTab = $("a[href='/expertise/']"),
            oilGasTab = $("a[href='/expertise/oil-gas/']"),
            activityList = $(".activity__list"),
            productsTab = $("a[href='/products/']"),
            stormBlockChainTab = $("a[href='/products/storm-blockchain/']"),
            protocolBlockChainList = $(".protocol__list"),
            careerTab = $("a[href='/career/']"),
            vacanciesTab = $("a[href='/vacancies/']"),
            vacanciesList = $(".vacancies__list");


    public MainPage openPage() {
        open("/");
        return this;
    }

    public MainPage hoverAboutUsTab() {
        aboutUsTab.hover();
        return this;
    }

    public MainPage hoverServicesTab() {
        servicesTab.hover();
        return this;
    }

    public MainPage hoverExpertiseTab() {
        expertisesTab.hover();
        return this;
    }

    public MainPage hoverProductTab() {
        productsTab.hover();
        return this;
    }

    public MainPage hoverCareerTab() {
        careerTab.hover();
        return this;
    }

    public MainPage clickOnOurHistoryTab() {
        ourHistoryTab.click();
        return this;
    }

    public MainPage clickOnOilGasTab() {
        oilGasTab.click();
        return this;
    }

    public MainPage clickOnStormBlockChainTab() {
        stormBlockChainTab.click();
        return this;
    }

    public MainPage clickOnServicesDevelopmentTab() {
        servicesDevelopmentTab.click();
        return this;
    }

    public MainPage clickOnVacanciesTab() {
        vacanciesTab.click();
        return this;
    }

    public MainPage checkIfStoryIsPresent(String year) {
        historyYear.shouldHave(text(year));
        return this;
    }

    public MainPage checkTechnologiesListIsPresent() {
        technologiesList.scrollTo().shouldBe(visible);
        return this;
    }

    public MainPage checkActivityListIsPresent() {
        activityList.scrollTo().shouldBe(visible);
        return this;
    }

    public MainPage checkProtocolBlockChainListIsPresent() {
        protocolBlockChainList.scrollTo().shouldBe(visible);
        return this;
    }

    public MainPage checkVacanciesListIsPresent() {
        vacanciesList.scrollTo().shouldBe(visible);
        return this;
    }

}
