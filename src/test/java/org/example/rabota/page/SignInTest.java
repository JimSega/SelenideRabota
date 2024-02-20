package org.example.rabota.page;

import org.example.rabota.dto.User;
import org.junit.jupiter.api.Test;

class SignInTest extends BaseTest{

    @Test
    void signIn() {
        User user = new User(generalConfig.userName(), System.getProperty("password"));

        new SignIn().open()
                .clickEnter()
                .setName(user.getUserName())
                .clickSetName()
                .setPasswordElement(user.getPassword())
                .clickPassword()
                .shouldBeVisible();
    }

}