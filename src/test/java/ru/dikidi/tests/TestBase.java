package ru.dikidi.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void setupTest() {
        Configuration.baseUrl = "https://test.dikidi.ru/";
        Configuration.browserSize = "1920x1080";
        SelenideLogger.addListener("allure", new AllureSelenide());
        Configuration.holdBrowserOpen = true;
    }
}
