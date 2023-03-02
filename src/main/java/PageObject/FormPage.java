package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class FormPage {
    public SelenideElement
           buttonContinue = $(".continue"),
           buttonLegalPerson = $("#pis"),
           buttonPhysicalPerson = $("#iur"),
           buttonSend = $("#btn2"),
           fieldCompanyName = $(".form_group",1).$(byText("კომპანიის სახელწოდება")),
           fieldCompanyId = $(".form_group",2).$(byName("personalId")),
           fieldAddress = $(By.name("address")),
           fieldPhone= $(By.name("phone")),
           fieldOrderReceiveDate = $(By.name("date")),
           fieldEmail = $(By.name("email"));
}
