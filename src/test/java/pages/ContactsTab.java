package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ContactsTab {
    private final SelenideElement
            locationsList = $(".locations__list");

    @Step("Проверить наличие контакной информации для города Москва")
    public ContactsTab checkContactsListIsPresent() {
        locationsList.scrollTo().shouldBe(visible);
        return this;
    }
}
