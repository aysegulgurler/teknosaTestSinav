package com.teknosa.tests;

import com.teknosa.driver.BaseTest;

import com.teknosa.pages.LoginPage;
import org.junit.Test;

public class TeknosaLoginTest extends BaseTest {

    @Test
    public void TeknosaLoginTest() {
        LoginPage login = new LoginPage();

        login.successLogin();
    }

}
