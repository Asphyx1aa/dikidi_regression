package ru.dikidi.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.dikidi.pages.HomePage;
import ru.dikidi.pages.ProjectsPage;

import static io.qameta.allure.Allure.step;

public class ProjectTests extends TestBase {
    HomePage homePage = new HomePage();
    ProjectsPage projectsPage = new ProjectsPage();

    @Test
    @DisplayName("Успешная регистрация")
    @Tag("Regression")
    void checkSuccessfulRegistration() {

    }

    @Test
    @DisplayName("Авторизация по номеру телефона")
    @Tag("Regression")
    void checkSuccessfulAuthorizationByPhoneNumber() {
        step("Открываем сайт https://test.dikidi.ru", () -> {
            homePage.openPage();
        });

        step("Открываем модальное окно авторизации", () -> {
            homePage.openAuthorizationModal();
        });

        step("Выбираем способ авторизации по номеру телефона", () -> {
            homePage.clickOnNumberButtonInModal();
        });

        step("Вводим номер телефона", () -> {
            homePage.setUserNumber();
        });

        step("Вводим пароль", () -> {
            homePage.setUserPassword();
        });

        step("Подтверждаем вход", () -> {
            homePage.clickOnSubmitButton();
        });
    }

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

        step("Заполняем форму'", () -> {
            projectsPage.createNewCompany();
        });
    }

    @Test
    @DisplayName("Успешное удаление проекта")
    @Tag("Regression")
    void checkSuccessfulDeletingProject() {

    }
}
