package Tests;

import StepObject.BasketSteps;
import StepObject.SearchSteps;
import Utils.ChromeRunner;
import Utils.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static DataObject.BasketData.addBasketMessage;
import static DataObject.BasketData.productName;
import static DataObject.SearchData.*;
import static com.codeborne.selenide.Selenide.refresh;
import static com.codeborne.selenide.Selenide.sleep;

@Listeners(Utils.TestLister.class)
public class BasketTests extends ChromeRunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("TC 4 - Add item to the basket")
    public void addItemToBasket() {
        SearchSteps Steps1 = new SearchSteps();
        BasketSteps Steps2 = new BasketSteps();
        Steps1
                .clickOnSearchButton()
                .correctSearchData(correctSearchCriteria)
                .clickOnSearchFieldButton();
        Steps2
                .clickOnAddToBasket();
        Assert.assertEquals(addBasketMessage,  Steps2.toastMessage.getText());
       // <div class="toast" style="top: 0px; transition: transform 0.2s ease 0s, opacity 0.2s ease 0s;">პროდუქტი წარმატებით დაემატა კალათაში</div>

    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("TC 5 - Check product name in the basket")
    public void checkProductName() {
        BasketSteps Steps3 = new BasketSteps();
        SearchSteps Steps1 = new SearchSteps();
        BasketSteps Steps2 = new BasketSteps();
        Steps1
                .clickOnSearchButton()
                .correctSearchData(correctSearchCriteria)
                .clickOnSearchFieldButton();
        Steps2
                .clickOnAddToBasket();
        refresh();
        Steps3
                .clickOnBasketButton();
        Assert.assertEquals(productName, Steps3.productNameInBasket.getText());
    }
}
