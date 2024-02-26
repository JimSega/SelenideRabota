package org.example.rabota.page;

import org.junit.jupiter.api.Test;

class SignInTest extends BaseTest {

    @Test
    void signIn() {

        var user = getDefaultUser();

        new IndexPage().open()
                .shouldBeOpened()
                .clickSignIn()
                .shouldBeOpened()
                .setName(user.getUserName())
                .clickSetName()
                .setPasswordElement(user.getPassword())
                .clickPassword()
                .shouldBeOpened();
    }

}