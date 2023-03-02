package Tests;

import StepObject.BasketSteps;
import StepObject.SearchSteps;
import Utils.ChromeRunner;
import Utils.Retry;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure
        .SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static DataObject.BasketData.*;
import static DataObject.SearchData.*;
import static com.codeborne.selenide.Selenide.refresh;

@Listeners(Utils.TestLister.class)
public class BasketTests extends ChromeRunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("TC 4 - Add item to the basket")
    public void addItemToBasket() {
        SearchSteps Steps1 = new SearchSteps();
        BasketSteps Steps2 = new BasketSteps();
        Steps1  .clickOnSearchButton()
                .correctSearchData(correctSearchCriteria)
                .clickOnSearchFieldButton();
        Steps2  .clickOnAddToBasket();
        Assert.assertEquals(addBasketMessage,  Steps2.toastMessage.getText());
       //<div class="toast" style="top: 0px; transition: transform 0.2s ease 0s, opacity 0.2s ease 0s;">პროდუქტი წარმატებით დაემატა კალათაში</div>
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("TC 5 - Check product name in the basket")
    public void checkProductName() {
        SearchSteps Steps1 = new SearchSteps();
        BasketSteps Steps2 = new BasketSteps();
        Steps1  .clickOnSearchButton()
                .correctSearchData(correctSearchCriteria)
                .clickOnSearchFieldButton();
        Steps2  .clickOnAddToBasket();
        refresh();
        Steps2  .clickOnBasketButton();
        //Assert.assertEquals(productName, Steps3.productNameInBasket.getText());
        Assert.assertTrue(Steps2.productNameInBasket.is(Condition.visible));
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.MINOR)
    @Description("TC 6 - Check product color in the basket")
    public void checkProductColor() {
        SearchSteps Steps1 = new SearchSteps();
        BasketSteps Steps2 = new BasketSteps();
        Steps1  .clickOnSearchButton()
                .correctSearchData(correctSearchCriteria)
                .clickOnSearchFieldButton();
        Steps2  .clickOnAddToBasket();
        refresh();
        Steps2  .clickOnBasketButton();
        Assert.assertTrue(Steps2.productColor.isDisplayed());
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("TC 7 - Check product code in the basket")
    public void checkProductCode() {
        SearchSteps Steps1 = new SearchSteps();
        BasketSteps Steps2 = new BasketSteps();
        Steps1  .clickOnSearchButton()
                .correctSearchData(correctSearchCriteria)
                .clickOnSearchFieldButton();
        Steps2  .clickOnAddToBasket();
        refresh();
        Steps2  .clickOnBasketButton();
        Assert.assertTrue(Steps2.productCode.is(Condition.visible));
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("TC 8 - Check product quantity in the basket")
    public void checkProductQuantity() {
        SearchSteps Steps1 = new SearchSteps();
        BasketSteps Steps2 = new BasketSteps();
        Steps1  .clickOnSearchButton()
                .correctSearchData(correctSearchCriteria)
                .clickOnSearchFieldButton();
        Steps2  .clickOnAddToBasket();
        refresh();
        Steps2  .clickOnBasketButton();
        Assert.assertTrue(Steps2.productQuantity.is(Condition.visible));
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("TC 9 - Check product price in the basket")
    public void checkProductPrice() {
        SearchSteps Steps1 = new SearchSteps();
        BasketSteps Steps2 = new BasketSteps();
        Steps1  .clickOnSearchButton()
                .correctSearchData(correctSearchCriteria)
                .clickOnSearchFieldButton();
        Steps2  .clickOnAddToBasket();
        refresh();
        Steps2  .clickOnBasketButton();
        Assert.assertTrue(Steps2.productPrice.is(Condition.visible));
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("TC 10 - Check product total price in the basket")
    public void checkTotalPrice() {
        SearchSteps Steps1 = new SearchSteps();
        BasketSteps Steps2 = new BasketSteps();
        Steps1  .clickOnSearchButton()
                .correctSearchData(correctSearchCriteria)
                .clickOnSearchFieldButton();
        Steps2  .clickOnAddToBasket();
        refresh();
        Steps2  .clickOnBasketButton();
        Assert.assertTrue(Steps2.totalPrice.is(Condition.visible));
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("TC 11 - Increase quantity and check total price")
    public void checkTotalPriceIncrease() {
        SearchSteps Steps1 = new SearchSteps();
        BasketSteps Steps2 = new BasketSteps();
        Steps1  .clickOnSearchButton()
                .correctSearchData(correctSearchCriteria)
                .clickOnSearchFieldButton();
        Steps2  .clickOnAddToBasket();
        refresh();
        Steps2  .clickOnBasketButton()
                .clickOnButtonIncrease();
        Assert.assertEquals(Steps2.getTotalPrice()/Steps2.getActualPrice(), Steps2.getProductQuantity());
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("TC 12 - Decrease quantity and check total price")
    public void checkTotalPriceDecrease() {
        SearchSteps Steps1 = new SearchSteps();
        BasketSteps Steps2 = new BasketSteps();
        Steps1  .clickOnSearchButton()
                .correctSearchData(correctSearchCriteria)
                .clickOnSearchFieldButton();
        Steps2  .clickOnAddToBasket();
        refresh();
        Steps2  .clickOnBasketButton()
                .clickOnButtonIncrease()
                .clickOnButtonIncrease()
                .clickOnButtonDecrease();
        Assert.assertEquals(Steps2.getTotalPrice()/Steps2.getActualPrice(), Steps2.getProductQuantity());
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("TC 13 - Delete product from the button X ")
    public void deleteProduct() {
        SearchSteps Steps1 = new SearchSteps();
        BasketSteps Steps2 = new BasketSteps();
        Steps1.clickOnSearchButton()
                .correctSearchData(correctSearchCriteria)
                .clickOnSearchFieldButton();
        Steps2.clickOnAddToBasket();
        refresh();
        Steps2.clickOnBasketButton()
                .clickOnButtonX();
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("TC 14 - Empty basket ")
    public void emptyBasket1() {
        SearchSteps Steps1 = new SearchSteps();
        BasketSteps Steps2 = new BasketSteps();
        Steps1.clickOnSearchButton()
                .correctSearchData(correctSearchCriteria)
                .clickOnSearchFieldButton();
        Steps2.clickOnAddToBasket();
        refresh();
        Steps2.clickOnBasketButton()
                .emptyBasket();
        Assert.assertTrue(Steps2.totalPriceAllProducts.is(Condition.not(Condition.visible)));
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("TC 15 - Empty basket check text ")
    public void emptyBasket2() {
        SearchSteps Steps1 = new SearchSteps();
        BasketSteps Steps2 = new BasketSteps();
        Steps1.clickOnSearchButton()
                .correctSearchData(correctSearchCriteria)
                .clickOnSearchFieldButton();
        Steps2.clickOnAddToBasket();
        refresh();
        Steps2.clickOnBasketButton()
                .emptyBasket();
        Assert.assertTrue(Steps2.textEmptyBasket.isDisplayed());
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("TC 16 - Empty basket check continue")
    public void emptyBasket3() {
        SearchSteps Steps1 = new SearchSteps();
        BasketSteps Steps2 = new BasketSteps();
        Steps1.clickOnSearchButton()
                .correctSearchData(correctSearchCriteria)
                .clickOnSearchFieldButton();
        Steps2.clickOnAddToBasket();
        refresh();
        Steps2.clickOnBasketButton()
                .emptyBasket();
        Assert.assertFalse(Steps2.buttonContinue.exists());
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("TC 17 - Empty basket check button empty basket")
    public void emptyBasket4() {
        SearchSteps Steps1 = new SearchSteps();
        BasketSteps Steps2 = new BasketSteps();
        Steps1.clickOnSearchButton()
                .correctSearchData(correctSearchCriteria)
                .clickOnSearchFieldButton();
        Steps2.clickOnAddToBasket();
        refresh();
        Steps2.clickOnBasketButton()
                .emptyBasket();
        Assert.assertFalse(Steps2.buttonEmptyBasket.exists());
    }

}
