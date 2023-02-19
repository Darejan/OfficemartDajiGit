package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class SearchPage {
    public SelenideElement
           searchButton = $(byText("პროდუქტის ძიება")),
           searchField = $(".form_group").$(byName("search")),
           searchFieldButton = $(".fas fa-search",2),
           getTextFromReturnedData = $(".prod_title"),
           searchResult = $(".search_result", 1).$(byTagName("h4"));
}
