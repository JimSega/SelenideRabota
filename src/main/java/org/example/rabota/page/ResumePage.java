package org.example.rabota.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.aeonbits.owner.ConfigCache;
import org.example.rabota.properties.GeneralConfig;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ResumePage extends BasePage {
    protected static GeneralConfig generalConfig = ConfigCache.getOrCreate(GeneralConfig.class);
    private final SelenideElement inputNameLabel = $(By.xpath("//input[@name='full_name']"));
    private final SelenideElement birthYear = $(By.xpath("//input[@name='birth_year_at']"));
    private final SelenideElement logIn = $(By.xpath("//input[@name='login']"));
    private final ElementsCollection dropdown = $$(By.xpath("//li/a[@class='list__tile list__tile_link']"));
    private final SelenideElement jobLabel = $("div.r-suggester__input");
    //private final SelenideElement continueButton = $(By.xpath("//button[contains(text(),'Продолжить')]"));
    private final SelenideElement continueButton = $(".secondary.r-btn_large");

    public ResumePage open() {
        Selenide.open(generalConfig.resume());
        return this;
    }

    public ResumePage setInputNameLabel(String firstName, String lastName) {
        inputNameLabel.clear();
        inputNameLabel.val(firstName + " " + lastName);
        return this;
    }

    public ResumePage setBirthYear(String year) {
        birthYear.val(year);
        return this;
    }

    public ResumePage setLogIn(String userName) {
        logIn.clear();
        logIn.val(userName);
        return this;
    }

    public ResumePage setJob() {
        jobLabel.click();
        dropdown.get((int) (Math.random() * dropdown.size())).click();
        return this;
    }

    public ResumeAdditionalPage clickContinueButton() {
        continueButton.click();
        return new ResumeAdditionalPage();
    }
}
