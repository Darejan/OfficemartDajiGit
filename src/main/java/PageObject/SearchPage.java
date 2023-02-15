package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SearchPage {
    public SelenideElement
           searchButton = $(byText("პროდუქტის ძიება")),
           searchField = $(".form_group"),
           searchFieldButton = $(".fas fa-search",2);
}
