package org.example.rabota.page;

import com.codeborne.selenide.Selenide;

public abstract class BasePage {

    public BasePage open() {
        Selenide.open("/");
        return this;
    }


}