package ru.dikidi.tests;

import org.junit.jupiter.api.Test;
import ru.dikidi.pages.HomePage;

public class ProjectTests extends TestBase{
    HomePage homePage = new HomePage();

    @Test
    void checkSuccessfulCreatingProject() {
        homePage.openPage().openAuthorizationModal().clickOnNumberButtonInModal().setUserNumber();
    }
}
