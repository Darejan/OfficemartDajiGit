package StepObject;


import DataObject.SearchData;
import PageObject.SearchPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class SearchSteps extends SearchPage {
    @Step("click on the button for search")
    public SearchSteps clickOnSearchButton(){
        searchButton.click();
        return this;
    }

    @Step ("fill correct searching data")
    public SearchSteps correctSearchData(String correctData){
        searchField.setValue(correctData);
        return this;
    }

    @Step ("click on the search button inside of the search field")
    public SearchSteps clickOnSearchFieldButton(){
        searchField.pressEnter();
        return this;
    }

    @Step ("fill incorrect searching data")
    public SearchSteps incorrectSearchData(String incorrectData){
        searchField.setValue(incorrectData);
        return this;
    }

    @Step ("get text from incorrect search result")
    public SearchSteps textFromIncorrectSearch(){
        searchResult.getText();
        return this;
    }

}
