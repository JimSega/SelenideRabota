package org.example.rabota.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SignInPopup extends BasePage {

    private final SelenideElement containerFirstStep = $(".auth-main-step");
    private final SelenideElement numberOrEmailInput = containerFirstStep.$x(".//input[@name='login']");
    private final SelenideElement continuePressNumberOrEmail = containerFirstStep.$(".auth-main-step__button-content");
    private final SelenideElement containerSecondStep = $(".auth-authorization-step");
    private final SelenideElement passwordElement = containerSecondStep.$x(".//input[@name='password']");
    private final SelenideElement continuePassword = containerSecondStep.$x(".//button[contains(@class, 'auth-authorization-step__form-button')]");

    public SignInPopup open() {
        super.open();
        return this;
    }

    public SignInPopup setName(String name) {
        numberOrEmailInput.val(name);
        return this;
    }

    public SignInPopup clickSetName() {
        continuePressNumberOrEmail.click();
        return this;
    }

    public SignInPopup setPasswordElement(String password) {
        passwordElement.val(password);
        return this;
    }

    public IndexPage clickPassword() {
        continuePassword.click();
        return new IndexPage();
    }

    public SignInPopup shouldBeOpened() {
        containerFirstStep.shouldBe(visible);
        return this;
    }
}
