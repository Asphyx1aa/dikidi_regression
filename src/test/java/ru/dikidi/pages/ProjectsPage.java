package ru.dikidi.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ProjectsPage {
    private SelenideElement addProjectButton = $(".create-promotions");
    private SelenideElement createNewProjectButton = $(".add-company");
    private SelenideElement companyType = $(".list-item.company");
    private SelenideElement companyOccupation = $("div[data-name='services']");
    private SelenideElement companySpecialization = $(".check-item.show").$("label[for='services-55']");
    private SelenideElement nextButton = $(".action-btn.next");
    private SelenideElement radioButtonFilial = $("label[for='one']");
    private SelenideElement radioButtonQty = $("label[for='small']");
    private SelenideElement radioButtonExp = $("label[for='first']");
    private SelenideElement companyNameInput = $(".name-company").$("input[name='name']");
    private SelenideElement companyStreetInput = $("input[name='street']");
    private SelenideElement companyHouseInput = $("input[name='house']");
    private SelenideElement companyZipcodeInput = $("input[name='zipcode']");
    private SelenideElement checkbox = $("label[for='conditions']");

    public ProjectsPage createNewProject() {
        addProjectButton.click();
        return this;
    }

    public ProjectsPage createNewCompany() {
        createNewProjectButton.click();
        companyType.click();
        companyOccupation.click();
        companySpecialization.click();
        nextButton.click();
        radioButtonFilial.click();
        radioButtonQty.click();
        radioButtonExp.click();
        nextButton.click();
        companyNameInput.setValue("Test");
        companyStreetInput.setValue("Test");
        companyHouseInput.setValue("22");
        companyZipcodeInput.setValue("150000");
        checkbox.click();

        return this;
    }
}
