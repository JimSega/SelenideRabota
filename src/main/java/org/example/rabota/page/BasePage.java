package org.example.rabota.page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class BasePage {

    private final SelenideElement container = $("#__nuxt");

    public BasePage open() {
        Selenide.open("/");
        return this;
    }

    public BasePage shouldBeVisible() {
        container.shouldBe(visible);
        sleep(10000);
        return this;
    }


}