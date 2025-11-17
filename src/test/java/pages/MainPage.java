package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final SelenideElement
            aboutUsTab = $("a[href='/about/']"),
            ourHistoryTab = $("a[href='/about/history/']"),

            historyYear = $(".history__year");

    private final ElementsCollection
            historyYearSlide = $$(".swiper-wrapper");

    public MainPage openPage() {
        open("/");
        return this;
    }

    public MainPage hoverAboutUsTab() {
        aboutUsTab.hover();
        return this;
    }

    public MainPage clickOnOurHistoryTab() {
        ourHistoryTab.click();
        return this;
    }

    public MainPage checkStoryForCertainYear(String year) {
        historyYearSlide.findBy(text(year)).click();
        historyYear.shouldHave(text(year));
        return this;
    }

}
