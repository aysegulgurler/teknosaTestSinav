package com.teknosa.tests;
import com.teknosa.driver.BaseTest;
import com.teknosa.pages.InvalidPassword;
import com.teknosa.pages.InvalidUsername;
import org.junit.Test;

public class InvalidPasswordLoginTest extends BaseTest{

    @Test
    public void UnSuccessPasswordTest(){
        InvalidPassword invalidPassword = new InvalidPassword();

        invalidPassword.unSuccessPasswordLogin();

    }
}
