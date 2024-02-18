package org.example.rabota.page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.aeonbits.owner.ConfigCache;
import org.example.rabota.properties.GeneralConfig;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class RabotaBasePage {
    private GeneralConfig generalConfig = ConfigCache.getOrCreate(GeneralConfig.class);
    private final SelenideElement container = $("#__nuxt");

    public RabotaBasePage open(String url) {
        Selenide.open(url);
        return this;
    }

    public RabotaBasePage shouldBeVisible() {
        container.shouldBe(visible);
        return this;
    }

    public String getBaseUrl() {
        return generalConfig.url();
    }

}