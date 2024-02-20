package org.example.rabota.page;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.aeonbits.owner.ConfigCache;
import org.example.rabota.properties.GeneralConfig;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    protected static GeneralConfig generalConfig = ConfigCache.getOrCreate(GeneralConfig.class);

    @BeforeAll
    public static void start() {
        Configuration.baseUrl = generalConfig.url();
        Configuration.pollingInterval = 50;
        Configuration.timeout = 20000;
        Configuration.pageLoadTimeout = 60000;
        Configuration.browserSize = "1920x1080";
    }

    @AfterAll
    public static void finish() {
        WebDriverRunner.closeWebDriver();
    }
}
