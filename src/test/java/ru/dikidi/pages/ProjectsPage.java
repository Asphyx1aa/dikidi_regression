package ru.dikidi.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ProjectsPage {
    private SelenideElement addProjectButton = $(".create-promotions");
    private SelenideElement createNewProjectButton = $(".add-company");
    private SelenideElement companyType = $(".list-item.company");
    private SelenideElement companyOccupation = $("div[data-name='services']");
    private SelenideElement companySpecialization = $(".check-item.show").$("label[for='services-55']");

    public ProjectsPage createNewProject() {
        addProjectButton.click();
        return this;
    }

    public ProjectsPage createNewCompany() {
        createNewProjectButton.click();
        companyType.click();
        companyOccupation.click();
        companySpecialization.click();
        return this;
    }
}
