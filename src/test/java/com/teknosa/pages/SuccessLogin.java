package com.teknosa.pages;

import com.teknosa.methods.Methods;
import org.openqa.selenium.By;

public class LoginPage {

    Methods methods;

    public LoginPage(){
        methods = new Methods();
    }

    public void successLogin(){
        methods.waitBySeconds(1);
        methods.click(By.xpath("//a[@class='btn-user']"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//a[@class='btn btn-secondary homeCallLogin secondCallLogin']"));
        methods.waitBySeconds(2);
        methods.click(By.id("j_username1"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("j_username1"),"missstrange77@gmail.com");
        methods.waitBySeconds(2);
        methods.click(By.id("newLoginStepSecond"));
        methods.waitBySeconds(2);
        methods.click(By.id("j_password"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("j_password"),"Ayse9gul.");
        methods.click(By.id("rememberMe"));
        methods.waitBySeconds(2);
        methods.click(By.id("customerLoginButton"));
        methods.waitBySeconds(5);

    }
}

