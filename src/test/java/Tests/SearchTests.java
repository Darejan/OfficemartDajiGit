package Tests;

import DataObject.SearchData;
import PageObject.SearchPage;
import StepObject.SearchSteps;
import Utils.ChromeRunner;
import Utils.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static DataObject.SearchData.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selenide.*;

@Listeners(Utils.TestLister.class)
public class SearchTests extends ChromeRunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.BLOCKER)
    @Description("TC 1 - Open search field")
    public void openSearchField(){
        SearchSteps Steps1 = new SearchSteps();
        Steps1
                .clickOnSearchButton();
                 Assert.assertTrue(Steps1.searchField.isDisplayed());
                 sleep(1000);
    }

    @Test (retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("TC 3 - search with incorrect data")
    public void searchWithIncorrectData() {
        SearchSteps Steps3 = new SearchSteps();
        Steps3
                .clickOnSearchButton()
                .incorrectSearchData(incorrectSearchCriteria)
                .clickOnSearchFieldButton();
        Assert.assertTrue(Steps3.searchResult.is(visible));
    }

    @Test (retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("TC 2 - search with correct data")
    public void searchWithCorrectData(){
        SearchSteps Steps2 = new SearchSteps();
        Steps2
                .clickOnSearchButton()
                .correctSearchData(correctSearchCriteria)
                .clickOnSearchFieldButton();
        int searchedItemsNumber = $$(".prod_bottom").size();
        for (int i = 0; i < searchedItemsNumber; i++){
            String getText = $(".prod_title", i).$(byTagName("h4")).getText();
            Assert.assertTrue(getText.contains(correctSearchCriteria));
        }
   }
}
