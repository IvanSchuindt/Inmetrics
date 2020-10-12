package br.com.inmetrics.teste.steps;

import br.com.inmetrics.teste.interactions.LoginPageInteractions;

import br.com.inmetrics.teste.utils.DriverUtils;
import io.cucumber.java.PendingException;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginSteps extends DriverUtils {
    LoginPageInteractions login = PageFactory.initElements(driver, LoginPageInteractions.class);

    @Dado("um usuario {string} cadastrado pelo sistema")
    public void umUsuarioCadastradoPeloSistema(String usuario) throws Throwable {
        login.inputUsuario(usuario);
        throw new PendingException();
    }

    @Quando("preenche o campo senha com {string}")
    public void preencheOCampoSenhaComA(String senha) throws Throwable {
        login.inputSenha(senha);
        throw new PendingException();
    }

    @E("aciona o botao entre")
    public void acionaOBotaoEntre() throws Throwable {
        login.clickEntre();
        throw new PendingException();

    }

    @E("acessa a tela {string}")
    public void acessaATela (String arg0){
    }

    @Então("o usuario visualiza a tela {string}")
    public void oUsuarioVisualizaATela (String link){
    }

    }
