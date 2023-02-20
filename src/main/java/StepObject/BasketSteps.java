package StepObject;

import PageObject.BasketPage;
import io.qameta.allure.Step;

public class BasketSteps extends BasketPage {
    @Step("on chosen item click on the button add to basket")
    public BasketSteps clickOnAddToBasket(){
        addToBasketButton.click();
        return this;
    }

    @Step("click on the basket button")
    public BasketSteps clickOnBasketButton(){
        basketButton.click();
        return this;
    }



}
