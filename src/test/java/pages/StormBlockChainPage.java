package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class StormBlockChainPage {

    private final SelenideElement
            protocolBlockChainList = $(".protocol__list");

    @Step("Проверить наличие информации о преимуществах Шторм Блокчейн на странице")
    public StormBlockChainPage checkProtocolBlockChainListIsPresent() {
        protocolBlockChainList.scrollTo().shouldBe(visible);
        return this;
    }
}
