package org.example.rabota.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ResumeAdditionalPage extends BasePage {
    //private final SelenideElement back = $(By.xpath("//button[contains(text(),'Назад')]"));
    private final SelenideElement back = $(".split-wrapper__back.r-btn");

    public IndexPage clickBack() {
        back.click();
        return new IndexPage();
    }
}
