package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class OilGasPage {
    private final SelenideElement
            activityList = $(".activity__list");

    @Step("Проверить наличие информации о работе в Нефтегазовой промышленности на странице")
    public OilGasPage checkActivityListIsPresent() {
        activityList.scrollTo().shouldBe(visible);
        return this;
    }
}
