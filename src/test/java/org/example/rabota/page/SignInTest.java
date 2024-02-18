package org.example.rabota.page;

import org.aeonbits.owner.ConfigCache;
import org.example.rabota.properties.GeneralConfig;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SignInTest {
    private static String userName;
    private static String password;

    @BeforeAll
    public static void read() {
        GeneralConfig generalConfig = ConfigCache.getOrCreate(GeneralConfig.class);
        userName = generalConfig.userName();
        password = System.getProperty("password");
    }

    @Test
    void signIn() {
        new SignIn().open()
                .clickEnter()
                .setName(userName)
                .clickSetName()
                .setPasswordElement(password)
                .clickPassword()
                .shouldBeVisible();
    }

}