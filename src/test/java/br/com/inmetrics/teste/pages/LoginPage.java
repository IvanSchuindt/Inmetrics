package br.com.inmetrics.teste.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(name = "username")
    protected WebElement textUsuario;

    @FindBy(name = "pass")
    protected WebElement textSenha;

    @FindBy(xpath = "//button[contains(text(),'Entre')]")
    protected WebElement btnEntre;

}
