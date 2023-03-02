package StepObject;

import PageObject.FormPage;
import io.qameta.allure.Step;

public class FormSteps extends FormPage {
    @Step("click on the button continue fro the basket")
    public FormSteps clickOnContinue(){
        buttonContinue.click();
        return this;
    }

    @Step("get text from legal person button")
    public FormSteps clickOnSend(){
        buttonSend.click();
        return this;
    }

    @Step("fill text in the field company name")
    public FormSteps fillCompanyName(String name){
        fieldCompanyName.setValue(name);
        return this;
    }

    @Step("fill text in the field company ID")
    public FormSteps fillTextInCompanyID(String text){
        fieldCompanyId.setValue(text);
        return this;
    }

    @Step("fill more than 11 numbers in the field company ID")
    public FormSteps fillLongCompanyID(){
        fieldCompanyId.getSize();
        return this;
    }
}
