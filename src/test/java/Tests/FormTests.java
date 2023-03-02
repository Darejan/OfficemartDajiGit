package Tests;

import StepObject.BasketSteps;
import StepObject.FormSteps;
import StepObject.SearchSteps;
import Utils.ChromeRunner;
import Utils.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static DataObject.FormsData.*;
import static DataObject.SearchData.*;
import static com.codeborne.selenide.Selenide.refresh;

@Listeners(Utils.TestLister.class)
public class FormTests extends ChromeRunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("TC 18 - continue process from basket and see the forms")
    public void buttonContinue() {
        SearchSteps Steps1 = new SearchSteps();
        BasketSteps Steps2 = new BasketSteps();
        FormSteps Steps3 = new FormSteps();
        Steps1.clickOnSearchButton()
                .correctSearchData(correctSearchCriteria)
                .clickOnSearchFieldButton();
        Steps2  .clickOnAddToBasket();
        refresh();
        Steps2   .clickOnBasketButton();
        Steps3   .clickOnContinue();
        Assert.assertEquals("იურიდიული პირი",Steps3.buttonLegalPerson.getText().toLowerCase());
        Assert.assertEquals("ფიზიკური პირი",Steps3.buttonPhysicalPerson.getText().toLowerCase());
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("TC 19 - check company name when legal person's fields are empty")
    public void checkEmptyCompanyFields() {
        SearchSteps Steps1 = new SearchSteps();
        BasketSteps Steps2 = new BasketSteps();
        FormSteps Steps3 = new FormSteps();
        Steps1.clickOnSearchButton()
                .correctSearchData(correctSearchCriteria)
                .clickOnSearchFieldButton();
        Steps2  .clickOnAddToBasket();
        refresh();
        Steps2   .clickOnBasketButton();
        Steps3   .clickOnContinue()
                 .clickOnSend();
        Assert.assertTrue(Steps3.fieldCompanyName.getCssValue("border").equals("1px solid red"));
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("TC 20 - check company ID when legal person's fields are empty")
    public void checkEmptyCompanyId() {
        SearchSteps Steps1 = new SearchSteps();
        BasketSteps Steps2 = new BasketSteps();
        FormSteps Steps3 = new FormSteps();
        Steps1.clickOnSearchButton()
                .correctSearchData(correctSearchCriteria)
                .clickOnSearchFieldButton();
        Steps2  .clickOnAddToBasket();
        refresh();
        Steps2   .clickOnBasketButton();
        Steps3   .clickOnContinue()
                .clickOnSend();
        Assert.assertTrue(Steps3.fieldCompanyId.getCssValue("border").equals("1px solid red"));
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("TC 21 - check address when legal person's fields are empty")
    public void checkEmptyAddress() {
        SearchSteps Steps1 = new SearchSteps();
        BasketSteps Steps2 = new BasketSteps();
        FormSteps Steps3 = new FormSteps();
        Steps1.clickOnSearchButton()
                .correctSearchData(correctSearchCriteria)
                .clickOnSearchFieldButton();
        Steps2  .clickOnAddToBasket();
        refresh();
        Steps2   .clickOnBasketButton();
        Steps3   .clickOnContinue()
                .clickOnSend();
        Assert.assertTrue(Steps3.fieldAddress.getCssValue("border").equals("1px solid red"));
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("TC 22 - check phone when legal person's fields are empty")
    public void checkEmptyPhone() {
        SearchSteps Steps1 = new SearchSteps();
        BasketSteps Steps2 = new BasketSteps();
        FormSteps Steps3 = new FormSteps();
        Steps1.clickOnSearchButton()
                .correctSearchData(correctSearchCriteria)
                .clickOnSearchFieldButton();
        Steps2  .clickOnAddToBasket();
        refresh();
        Steps2   .clickOnBasketButton();
        Steps3   .clickOnContinue()
                .clickOnSend();
        Assert.assertTrue(Steps3.fieldPhone.getCssValue("border").equals("1px solid red"));
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("TC 23 - check order received date when legal person's fields are empty")
    public void checkEmptyOrderDate() {
        SearchSteps Steps1 = new SearchSteps();
        BasketSteps Steps2 = new BasketSteps();
        FormSteps Steps3 = new FormSteps();
        Steps1.clickOnSearchButton()
                .correctSearchData(correctSearchCriteria)
                .clickOnSearchFieldButton();
        Steps2  .clickOnAddToBasket();
        refresh();
        Steps2   .clickOnBasketButton();
        Steps3   .clickOnContinue()
                .clickOnSend();
        Assert.assertTrue(Steps3.fieldOrderReceiveDate.getCssValue("border").equals("1px solid red"));
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("TC 24 - check email when legal person's fields are empty")
    public void checkEmptyEmail() {
        SearchSteps Steps1 = new SearchSteps();
        BasketSteps Steps2 = new BasketSteps();
        FormSteps Steps3 = new FormSteps();
        Steps1.clickOnSearchButton()
                .correctSearchData(correctSearchCriteria)
                .clickOnSearchFieldButton();
        Steps2  .clickOnAddToBasket();
        refresh();
        Steps2   .clickOnBasketButton();
        Steps3   .clickOnContinue()
                .clickOnSend();
        Assert.assertTrue(Steps3.fieldEmail.getCssValue("border").equals("1px solid red"));
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("TC 25 - check company name when legal person's fields are not empty")
    public void checkCompanyName() {
        SearchSteps Steps1 = new SearchSteps();
        BasketSteps Steps2 = new BasketSteps();
        FormSteps Steps3 = new FormSteps();
        Steps1.clickOnSearchButton()
                .correctSearchData(correctSearchCriteria)
                .clickOnSearchFieldButton();
        Steps2  .clickOnAddToBasket();
        refresh();
        Steps2   .clickOnBasketButton();
        Steps3   .clickOnContinue()
                 .clickOnSend()
                 .fillCompanyName(companyName);
        Assert.assertFalse(Steps3.fieldAddress.getCssValue("border").equals("1px solid red"));
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("TC 26 - check company Id field with text input")
    public void checkCompanyIdWithText() {
        SearchSteps Steps1 = new SearchSteps();
        BasketSteps Steps2 = new BasketSteps();
        FormSteps Steps3 = new FormSteps();
        Steps1.clickOnSearchButton()
                .correctSearchData(correctSearchCriteria)
                .clickOnSearchFieldButton();
        Steps2  .clickOnAddToBasket();
        refresh();
        Steps2   .clickOnBasketButton();
        Steps3   .clickOnContinue()
                .clickOnSend()
                .fillTextInCompanyID(insertTextValue);
        Assert.assertFalse(Steps3.fieldCompanyId.getCssValue("border").equals("1px solid red"));
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("TC 27 - check company Id field with less than 11 numbers")
    public void checkCompanyIdShortNumbers() {
        SearchSteps Steps1 = new SearchSteps();
        BasketSteps Steps2 = new BasketSteps();
        FormSteps Steps3 = new FormSteps();
        Steps1.clickOnSearchButton()
                .correctSearchData(correctSearchCriteria)
                .clickOnSearchFieldButton();
        Steps2  .clickOnAddToBasket();
        refresh();
        Steps2   .clickOnBasketButton();
        Steps3   .clickOnContinue()
                .fillTextInCompanyID(lessThanElevenSymbols)
                .clickOnSend();
        Assert.assertTrue(Steps3.fieldCompanyId.getCssValue("border").equals("1px solid red"));
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("TC 28 - check company Id field with more than 11 numbers")
    public void checkCompanyIdLongNumbers() {
        SearchSteps Steps1 = new SearchSteps();
        BasketSteps Steps2 = new BasketSteps();
        FormSteps Steps3 = new FormSteps();
        Steps1.clickOnSearchButton()
                .correctSearchData(correctSearchCriteria)
                .clickOnSearchFieldButton();
        Steps2  .clickOnAddToBasket();
        refresh();
        Steps2   .clickOnBasketButton();
        Steps3   .clickOnContinue()
                 .fillTextInCompanyID(moreThanElevenSymbols);
        Assert.assertEquals(Steps3.fillLongCompanyID(), 11);
    }
}
