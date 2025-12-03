package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ServiceDevelopmentPage {

    private final SelenideElement
            technologiesList = $(".technologies-list-content");

    @Step("Проверить наличие используемых технологий на странице")
    public ServiceDevelopmentPage checkTechnologiesListIsPresent() {
        technologiesList.scrollTo().shouldBe(visible);
        return this;
    }
}
