package ru.dikidi.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {
    private SelenideElement authorizationButton = $("li.authorization");
    private SelenideElement mobileNumberButton = $(".modal-body").$(".number");
    private SelenideElement mobileNumberInput = $(".bootbox").$("#number");
    private SelenideElement userPasswordInput = $(".bootbox").$("input[type='password']");
    private SelenideElement submitButton = $(".bootbox").$("button[type='submit']");
    private SelenideElement businessButton = $(".business-btn");


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
        mobileNumberInput.setValue("79201291904");
        return this;
    }

    public HomePage setUserPassword() {
        userPasswordInput.setValue("888888");
        return this;
    }

    public HomePage clickOnSubmitButton() {
        submitButton.click();
        return this;
    }

    public HomePage openBusinessPage() {
        businessButton.click();
        return this;
    }

}
