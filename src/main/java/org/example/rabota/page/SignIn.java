package org.example.rabota.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignIn extends RabotaBasePage {

    private final SelenideElement signIn = $(By.xpath("//div/button[contains(@class, 'user-profile-header__sign-in')]"));
    private final SelenideElement numberOrEmailInput = $(By.xpath("//input[@name='login']"));
    private final SelenideElement continuePressNumberOrEmail = $(".auth-main-step__button-content");
    private final SelenideElement passwordElement = $(By.xpath("//input[@name='password']"));
    private final SelenideElement continuePassword = $(By.xpath("//button[contains(@class, 'auth-authorization-step__form-button')]"));

    public SignIn open() {
        super.open();
        return this;
    }

    public SignIn clickEnter() {
        signIn.click();
        return this;
    }

    public SignIn setName(String name) {
        numberOrEmailInput.val(name);
        return this;
    }

    public SignIn clickSetName() {
        continuePressNumberOrEmail.click();
        return this;
    }

    public SignIn setPasswordElement(String password) {
        passwordElement.val(password);
        return this;
    }

    public RabotaBasePage clickPassword() {
        continuePassword.click();
        return this;
    }
}
