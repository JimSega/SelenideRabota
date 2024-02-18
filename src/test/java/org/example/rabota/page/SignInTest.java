package org.example.rabota.page;

import org.aeonbits.owner.ConfigCache;
import org.example.rabota.properties.GeneralConfig;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

class SignInTest {
    private static String url;
    private static String userName;
    private static String password;

    @BeforeAll
    public static void read() {
        GeneralConfig generalConfig = ConfigCache.getOrCreate(GeneralConfig.class);
        url = generalConfig.url();
        userName = generalConfig.userName();
        password = System.getProperty("password");
    }

    @Test
    void signIn() {
        SignIn signIn = open(url, SignIn.class);
        signIn.clickEnter();
        signIn.setName(userName);
        signIn.clickSetName();
        signIn.setPasswordElement(password);
        signIn.clickPassword();
        signIn.shouldBeVisible();
        /*new SignIn().open()
                .clickEnter()
                .setName(userName)
                .clickSetName()
                .setPasswordElement(password)
                .clickPassword()
                .shouldBeVisible();*/
    }

}