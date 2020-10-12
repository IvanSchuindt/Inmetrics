package br.com.inmetrics.teste.interactions;

import br.com.inmetrics.teste.pages.LoginPage;

public class LoginPageInteractions extends LoginPage {

    public void inputUsuario(String usuario) {
        textUsuario.clear();
        textUsuario.sendKeys(usuario);
    }

    public void inputSenha(String senha) {
        textSenha.clear();
        textSenha.sendKeys(senha);
    }

    public void clickEntre() {
        btnEntre.click();
    }

}
