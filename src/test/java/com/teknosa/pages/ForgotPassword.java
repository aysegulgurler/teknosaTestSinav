package com.teknosa.pages;

import com.teknosa.methods.Methods;
import org.openqa.selenium.By;




public class InvalidPassword {
    Methods methods;


    public InvalidPassword(){
        methods = new Methods();


    }

    public void unSuccessPasswordLogin(){
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
        methods.waitBySeconds(4);
        methods.click(By.id("j_password"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("j_password"),"123456");
        methods.waitBySeconds(2);
        methods.click(By.id("customerLoginButton"));
        methods.waitBySeconds(2);
        Methods methods = new Methods();
        By errorMessageLocator = By.xpath("//div[@class='alert-body']");
        String expectedMessage = "Hatalı şifre, e-posta veya cep telefonu numarası girdiniz.";
        boolean isMessageDisplayed = methods.isErrorMessageDisplayed(errorMessageLocator, expectedMessage);

        if (isMessageDisplayed) {
            System.out.println("Hata mesajı görüntülendi."+ expectedMessage);
        } else {
            System.out.println("Hata mesajı görüntülenmedi veya beklenen metinle eşleşmedi.");
        }
    }
}
