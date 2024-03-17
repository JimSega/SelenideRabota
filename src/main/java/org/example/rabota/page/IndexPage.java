package org.example.rabota.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class IndexPage extends BasePage {

    private final SelenideElement container = $("#__nuxt");
    private final SelenideElement signInButton = $(".user-profile-header__sign-in");
    //private final SelenideElement createResumeButton = $(By.xpath("//button[@aria-label='Создать резюме']"));
    private final SelenideElement createResumeButton = $("button.user-profile-menu__create-resume_light");
    private final SelenideElement userProfile = $(".user-profile-menu__user-no-avatar");

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

    public IndexPage clickUserProfile() {
        userProfile.click();
        return this;
    }

    public ResumePage clickCreateResumeButton() {
        createResumeButton.click();
        return new ResumePage();
    }

}
