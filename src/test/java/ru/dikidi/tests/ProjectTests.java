package ru.dikidi.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.dikidi.pages.HomePage;
import ru.dikidi.pages.ProjectsPage;

import static io.qameta.allure.Allure.step;

public class ProjectTests extends TestBase{
    HomePage homePage = new HomePage();
    ProjectsPage projectsPage = new ProjectsPage();

    @Test
    @DisplayName("Успешное создание проекта")
    @Tag("Regression")
    void checkSuccessfulCreatingProject() {

        step("Проходим авторизацию", () -> {
            homePage.openPage()
                    .openAuthorizationModal()
                    .clickOnNumberButtonInModal()
                    .setUserNumber()
                    .setUserPassword()
                    .clickOnSubmitButton();
        });

        step("Переходим на страницу проектов", () -> {
            homePage.openBusinessPage();
        });

        step("Кликаем на кнопку добавления проекта", () -> {
            projectsPage.createNewProject();
        });

        step("Кликаем на кнопку 'Создать новый проект'", () -> {
            projectsPage.createNewCompany();
        });
    }
}
