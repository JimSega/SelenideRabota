package org.example.rabota.page;

import com.codeborne.selenide.WebDriverRunner;
import org.aeonbits.owner.ConfigCache;
import org.example.rabota.dto.User;
import org.example.rabota.properties.GeneralConfig;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Configuration.*;

public class BaseTest {
    protected static GeneralConfig generalConfig = ConfigCache.getOrCreate(GeneralConfig.class);

    @BeforeAll
    public static void start() {
        browser = "Chrome";
        baseUrl = generalConfig.url();
        pollingInterval = 50;
        timeout = 20000;
        pageLoadTimeout = 60000;
        browserSize = "1920x1080";
    }

    public User getDefaultUser() {
        return new User(generalConfig.userName(), System.getProperty("password"));
    }

    @AfterAll
    public static void finish() {
        WebDriverRunner.closeWebDriver();
    }
}
