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

    @Step("click on the button plus for increasing quantity")
    public BasketSteps clickOnButtonIncrease(){
        buttonIncrease.click();
        return this;
    }

    @Step("click on the button minus for decreasing quantity")
    public BasketSteps clickOnButtonDecrease(){
        buttonDecrease.click();
        return this;
    }

    @Step("get actual price of one product")
    public double  getActualPrice(){
        String price = actualPrice.getText();
        double priceValue = Double.parseDouble(price);
        return priceValue;
    }

    @Step("get total price product")
    public double getTotalPrice(){
        String totalPrice = totalPriceValue.getText();
        double totalPriceValue = Double.parseDouble(totalPrice);
        return totalPriceValue;
    }

    @Step("get quantity of product")
    public int getProductQuantity(){
        String quantity = productQuantity.getText();
        Integer quantityValue = Integer.parseInt(quantity);
        return quantityValue;
    }

    @Step("click on the button  X for deletion of product")
    public BasketSteps clickOnButtonX(){
        buttonX.click();
        return this;
    }

    @Step("click on the button empty basket")
    public BasketSteps emptyBasket(){
        buttonEmptyBasket.click();
        return this;
    }

    @Step("get totaal price of all products")
    public double getTotalPriceAll(){
        String totalPriceAll = totalPriceAllProducts.getText();
        double totalPriceAllValue = Double.parseDouble(totalPriceAll);
        return totalPriceAllValue;
    }
}
