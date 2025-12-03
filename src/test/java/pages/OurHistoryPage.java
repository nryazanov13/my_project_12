package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class OurHistoryPage {
    private final SelenideElement
            historyYear = $(".history__desc");

    @Step("Проверить наличие истории за определенный {year} год")
    public OurHistoryPage checkIfStoryIsPresent(String year) {
        historyYear.shouldHave(text(year));
        return this;
    }
}
