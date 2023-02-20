package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class BasketPage {
    public SelenideElement
           addToBasketButton = $(".add_cart",1),
           toastMessage = $(".toast"),
           basketButton = $("junior-span"),
           productNameInBasket = $(".item_title");
}
