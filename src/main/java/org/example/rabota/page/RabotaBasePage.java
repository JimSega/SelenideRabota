package org.example.rabota.page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class RabotaBasePage {

    private final SelenideElement container = $("#__nuxt");

    public RabotaBasePage open() {
        Selenide.open("/");
        return this;
    }

    public RabotaBasePage shouldBeVisible() {
        container.shouldBe(visible);
        return this;
    }


}