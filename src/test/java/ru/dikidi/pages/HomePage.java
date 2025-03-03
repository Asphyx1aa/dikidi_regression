package ru.dikidi.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {
    private SelenideElement authorizationButton = $("li.authorization");
    private SelenideElement mobileNumberButton = $(".modal-body").$(".number");
    private SelenideElement mobileNumberInput = $("form").$("[name='number']");


    public HomePage openPage() {
        open("https://test.dikidi.ru/");
        executeJavaScript("$('#cookie-consent').remove()");

        return this;
    }

    public HomePage openAuthorizationModal() {
        authorizationButton.click();
        return this;
    }

    public HomePage clickOnNumberButtonInModal() {
        mobileNumberButton.click();
        return this;
    }

    public HomePage setUserNumber() {
        mobileNumberInput.setValue("9980000022");
        return this;
    }
}
