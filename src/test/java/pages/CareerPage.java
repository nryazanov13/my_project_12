package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CareerPage {

    private final SelenideElement
            vacanciesList = $(".vacancies__list");

    @Step("Проверить наличие информации о вакансиях на странице")
    public CareerPage checkVacanciesListIsPresent() {
        vacanciesList.scrollTo().shouldBe(visible);
        return this;
    }
}
