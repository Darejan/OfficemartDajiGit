package Tests;

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
    }

    //@Test (retryAnalyzer = Retry.class)
    //@Severity(SeverityLevel.CRITICAL)
   // @Description("TC 2 - search with correct data")
    //public void searchWithCorrectData(){
       // SearchSteps Steps2 = new SearchSteps();
       // Steps2
               // .clickOnSearchButton()
               // .correctSearchData(correctSearchCriteria);

   // }
}
