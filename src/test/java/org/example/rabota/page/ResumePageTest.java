package org.example.rabota.page;

import org.aeonbits.owner.ConfigCache;
import org.example.rabota.properties.GeneralConfig;
import org.junit.jupiter.api.Test;


class ResumePageTest extends BaseTest {
    protected static GeneralConfig generalConfig = ConfigCache.getOrCreate(GeneralConfig.class);

    @Test
    void createResume() {
        var user = getDefaultUser();

        new IndexPage().open()
                .shouldBeOpened()
                .clickSignIn()
                .shouldBeOpened()
                .setName(user.getUserName())
                .clickSetName()
                .setPasswordElement(user.getPassword())
                .clickPassword()
                .shouldBeOpened()
                .clickUserProfile()
                .clickCreateResumeButton()
                .setInputNameLabel(generalConfig.firstName(), generalConfig.lastName())
                .setBirthYear(generalConfig.year())
                .setJob()
                .setLogIn(generalConfig.userName())
                .clickContinueButton()
                .clickBack();
    }
}