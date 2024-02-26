package org.example.rabota.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class IndexPage extends BasePage {

    private final SelenideElement container = $("#__nuxt");
    private final SelenideElement signInButton = $(".user-profile-header__sign-in");

    public IndexPage open() {
        super.open();
        return this;
    }

    public IndexPage shouldBeOpened() {
        container.shouldBe(visible);
        return this;
    }

    public SignInPopup clickSignIn() {
        signInButton.click();
        return new SignInPopup();
    }

}
