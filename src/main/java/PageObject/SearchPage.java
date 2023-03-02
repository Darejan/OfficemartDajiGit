package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class SearchPage {
    public SelenideElement
           searchButton = $(".fa-search"),
           searchField = $(".form_group").$(byName("search")),
           searchFieldButton = $(".fas fa-search",2),
           //getTextFromReturnedData = $(".prod_title"),
           //searchResult = $(".search_result", 1).$(byTagName("h4")),
           searchResult = $(By.cssSelector("h4:contains('საძიებო სიტყვა') span.color_text"));
}
