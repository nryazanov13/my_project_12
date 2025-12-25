package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class BlogPage {
    private final SelenideElement
            blogList = $(".news__list");

    @Step("Проверить наличие информации о новостях компании в блоге компании")
    public BlogPage checkNewsBlogListIsPresent() {
        blogList.scrollTo().shouldBe(visible);
        return this;
    }
}
