package org.example.rabota.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.$;

public class SignIn extends RabotaBasePage {
    @FindBy(how = How.CLASS_NAME, using = "//div/button[contains(@class, 'user-profile-header__sign-in')]")
    private SelenideElement signIn;

    private final SelenideElement numberOrEmailInput = $("//input[@name='login']");
    private final SelenideElement continuePressNumberOrEmail = $(".auth-main-step__button-content");
    private final SelenideElement password = $("//input[@name='password']");
    private final SelenideElement continuePassword = $("//button[contains(@class, 'auth-authorization-step__form-button')]");

    public RabotaBasePage open() {
        super.open(getBaseUrl());
        return this;
    }

}
