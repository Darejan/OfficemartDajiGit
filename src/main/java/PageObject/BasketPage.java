package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class BasketPage {
    public SelenideElement
           addToBasketButton = $(".add_cart",1),
           toastMessage = $(".toast"),
           basketButton = $(".junior-span"),
           productNameInBasket = $(".item_title"),
           productColor = $(".item_col",2),
           productCode = $(".item_id"),
           productQuantity = $(".cartQuantity155469"),
           productPrice = $(".prod_price",0),
           totalPrice = $(".product_price",1),
           buttonIncrease = $(".fa-plus"),
           buttonDecrease = $(".fa-minus"),
           actualPrice = $(".prodPrice155469"),
           totalPriceValue = $(".prodSum155469"),
           buttonX = $(".fa-times",0),
           buttonEmptyBasket = $(".remove_carts",1),
           totalPriceAllProducts = $("#totalPrice"),
           textEmptyBasket = $(".emptyCart"),
           buttonContinue = $(".continue");
}
